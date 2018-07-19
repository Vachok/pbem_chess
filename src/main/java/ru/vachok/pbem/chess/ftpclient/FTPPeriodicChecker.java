package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.utilitar.Utilit;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;


/**
 * @since 30.06.2018 (1:19)
 */
public class FTPPeriodicChecker implements FtpConnect, Runnable {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = FTPPeriodicChecker.class.getSimpleName();

   private InitProperties initProperties;

   private Properties properties = new Properties();

   private static MessageToUser messageToUser = new MessageCons();

   private String eDateSt = dateAsFolderName();

   private final FTPClient ftpClient = getClient();

   public FTPPeriodicChecker() {
      try{
         if(!new File(FTPPeriodicChecker.SOURCE_CLASS + ".properties").exists()){
            initProperties = new DbProperties(FTPPeriodicChecker.SOURCE_CLASS);
         }
         else{ initProperties = new FileProps(FTPPeriodicChecker.SOURCE_CLASS); }
      }
      catch(Exception e){
         FTPPeriodicChecker.messageToUser.errorAlert(FTPPeriodicChecker.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   @Override
   public void connect() {
      long sizeAll = 0;
      for(FTPFile ftpFile : getFTPFiles()){
         FTPPeriodicChecker.dnLoader(ftpFile);
         sizeAll += ftpFile.getSize();
      }
      sizeAll = sizeAll / 1024 / 1024;
      long lo = sizeAll - Long.parseLong(properties.getProperty("size2downMeg"));
      properties.setProperty("size2downMeg", sizeAll + "");
      FTPPeriodicChecker.messageToUser.info(FTPPeriodicChecker.SOURCE_CLASS, Utilit.toUTF("Всего в мегабайтах, после последней проверки: "), sizeAll + "/(LO: " + lo + ")");
      if(lo!=0) eSend(messageToSend(sizeAll, lo));
   }

   @Override
   public FTPFile[] getFTPFiles() {

      String workFolderName = null;
      String dateFolderOnServer = null;
      try{

         dateFolderOnServer = "/IPCamera/IV2405P_00626E6A45EA/record/" + eDateSt + "/";
         ftpClient.doCommand("CWD", dateFolderOnServer);
      }
      catch(IOException e){
         FTPPeriodicChecker.messageToUser.errorAlert(FTPPeriodicChecker.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      try{
         FTPFile[] dirsOnCamera = ftpClient.listDirectories();

         workFolderName = dateFolderOnServer + dirsOnCamera[0].getName() + "/";
      }
      catch(IOException e){FTPPeriodicChecker.messageToUser.errorAlert(FTPPeriodicChecker.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      try{ftpClient.doCommand("CWD", workFolderName);}
      catch(IOException e){
         FTPPeriodicChecker.messageToUser.errorAlert(FTPPeriodicChecker.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return ftpFiles(ftpClient, workFolderName);
   }

   @Override
   public void run() {
      properties = initProperties.getProps();
      ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(2);
      String s = scheduledExecutorService.toString();
      connect();
      properties.setProperty("ftp", s);
   }

   private static void dnLoader(FTPFile ftpFile) {
      messageToUser.info(ftpFile.getName(), ftpFile.getGroup(), ftpFile.getLink());
      messageToUser.info(ftpFile.getUser(), ftpFile.getSize() + " size", new Date(ftpFile.getTimestamp().getTimeInMillis()).toString());
   }

   private void eSend(String msg) {
      List<String> rcpt = new ArrayList<>();
      rcpt.add("143500@gmail.com");
      new DbProperties(FTPPeriodicChecker.SOURCE_CLASS).delProps();
      ESender.sendM(rcpt, "FTP", msg);
      new FileProps(FTPPeriodicChecker.SOURCE_CLASS).setProps(properties);
      new DbProperties(FTPPeriodicChecker.SOURCE_CLASS).setProps(properties);
   }

   private String messageToSend(long sizeAll, long difSize) {
      return FTPPeriodicChecker.SOURCE_CLASS + "\n" + Utilit.toUTF("Всего в мегабайтах, после последней проверки: ") + "\n" + sizeAll + "/(dif: " + difSize + ")" + "\n" + properties.toString();
   }

   private String dateAsFolderName() {
      Integer year = Calendar.getInstance().get(Calendar.YEAR);
      Integer month = Calendar.getInstance().get(Calendar.MONTH);
      month = month + 1;
      Integer day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
      String dateT = year.toString() + "0" + month.toString() + day.toString();
      if(day < 10 && month < 10) dateT = year.toString() + "0" + month.toString() + "0" + day.toString();
      if(day >= 10 && month >= 10) dateT = year.toString() + month.toString() + day.toString();
      if(day < 10 && month >= 10) dateT = year.toString() + month.toString() + "0" + day.toString();
      return dateT;
   }

   private FTPFile[] ftpFiles(FTPClient ftpClient, String workFolderName) {
      FTPFile[] ftpFiles = new FTPFile[0];
      String indexChangeTime = "Getting FTP Status";
      try{
         ftpFiles = ftpClient.listFiles();
         indexChangeTime = ftpClient.getModificationTime(workFolderName + "index.dat");
      }
      catch(IOException | NullPointerException e){
         FTPPeriodicChecker.messageToUser.out("FTPCTest_75", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         FTPPeriodicChecker.messageToUser.errorAlert("FTPCTest", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      if(isVeryOld(indexChangeTime)){
         FTPPeriodicChecker.messageToUser.errorAlert(indexChangeTime, ftpFiles.length + " files to download. ", dateAsFolderName() + " is very old? " + isVeryOld(indexChangeTime));
      }
      if(!isVeryOld(indexChangeTime)){
         FTPPeriodicChecker.messageToUser.info(indexChangeTime, ftpFiles.length + " files to download. ", dateAsFolderName() + " is very old? " + isVeryOld(indexChangeTime));
      }
      return ftpFiles;
   }

   private boolean isVeryOld(String indexChangeTime) {
      int hourNow = LocalTime.now().getHour();
      String hourNowString = String.valueOf(LocalTime.now().getHour());
      if(hourNow < 10) hourNowString = "0" + LocalTime.now().getHour();
      String minNowString = String.valueOf(LocalTime.now().getMinute());
      int minuteNow = LocalTime.now().getMinute();
      if(minuteNow < 10) minNowString = "0" + minNowString;
      String secNowString = String.valueOf(LocalTime.now().getSecond());
      int secondNow = LocalTime.now().getSecond();
      if(secondNow < 10) secNowString = "0" + secNowString;
      String nowTime = hourNowString + minNowString + secNowString;
      try{
         long l = Long.parseLong(dateAsFolderName() + nowTime);
         long l1 = Long.parseLong(indexChangeTime);
         long l2 = l - l1;
         properties.setProperty("now", String.valueOf(l));
         properties.setProperty("was", String.valueOf(l1));
         properties.setProperty("diff", String.valueOf(l2));
         return l2 > 100000;
      }
      catch(NumberFormatException e){FTPPeriodicChecker.messageToUser.errorAlert("No index.dat", e.getMessage(), "ID 129");}
      return false;
   }
}