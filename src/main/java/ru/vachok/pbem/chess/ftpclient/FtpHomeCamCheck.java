package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.emails.EmailsProviders;
import ru.vachok.pbem.chess.emails.SimpleEmailREG;
import ru.vachok.pbem.chess.emails.VachokMailer;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;
import ru.vachok.pbem.chess.utilitar.Utilit;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.*;


/**
 * Периодическая проверка FTP-сервера. Если размер файлов менялся - отправить об этом сообщение.
 *
 * @since 30.06.2018 (1:19)
 */
public class FtpHomeCamCheck implements FtpConnect, Runnable {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = FtpHomeCamCheck.class.getSimpleName();

   /**
    * {@link MessageCons}
    */
   private static MessageToUser messageToUser = new MessageCons();

   /**
    * {@link FtpConnect#getClient()}
    */
   private final FTPClient ftpClient = getClient();

   private InitProperties initProperties;

   /**
    * {@link UTF8}
    */
   private DecoderEnc decoderEnc = new UTF8();

   private Properties properties = new Properties();

   /**
    * имя папки, исходя из сегодняшней даты.
    * {@link #dateAsFolderName()}
    */
   private String eDateSt = dateAsFolderName();

   /**
    * Конструктор-инициализатор класса.
    * Если БД {@link RegRuMysql} в данный момент не доступна,
    * пытается забрать установки из локального файла. {@code {@link #SOURCE_CLASS}.prorerties}
    */
   public FtpHomeCamCheck() {
      try{
         File properFile = new File(SOURCE_CLASS + ".properties");
         if(!properFile.exists()){
            initProperties = new DbProperties(SOURCE_CLASS);
            properties = initProperties.getProps();
            run();
         }
         else{ initProperties = new FileProps(SOURCE_CLASS); }
      }
      catch(Exception e){
         FtpHomeCamCheck.messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   /**
    * 1. Запуск, как {@link Runnable}
    * 1.1 {@link #connect()}
    */
   @Override
   public void run() {
      properties = initProperties.getProps();
      connect();
   }

   /**
    * Делает имя рабочей папки
    * {@link #connect()}
    *
    * @return массив {@link FTPFile} из рабочей папки {@link #eDateSt}. Получает методом {@link #ftpFiles(FTPClient, String)}, после получения рабочей папки.
    */
   @Override
   public FTPFile[] getWorkFolderName() {
      String workFolderName = null;
      String dateFolderOnServer = null;
      try{

         dateFolderOnServer = "/IPCamera/IV2405P_00626E6A45EA/record/" + eDateSt + "/";
         ftpClient.doCommand("CWD", dateFolderOnServer);
      }
      catch(IOException e){
         FtpHomeCamCheck.messageToUser.errorAlert(FtpHomeCamCheck.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      try{
         FTPFile[] dirsOnCamera = ftpClient.listDirectories();

         workFolderName = dateFolderOnServer + dirsOnCamera[0].getName() + "/";
      }
      catch(IOException e){FtpHomeCamCheck.messageToUser.errorAlert(FtpHomeCamCheck.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      try{ftpClient.doCommand("CWD", workFolderName);}
      catch(IOException e){
         FtpHomeCamCheck.messageToUser.errorAlert(FtpHomeCamCheck.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return ftpFiles(ftpClient, workFolderName);
   }

   /**
    * 1. Соединение с сервером физически.
    * 1.1 {@link #dnLoader(FTPFile)}
    * 1.3 {@link #messageToSend(long, long)}
    * 1.4 {@link #eSend(String)}
    *
    * @see #getWorkFolderName()
    */
   @Override
   public void connect() {
      ftpClient.setAutodetectUTF8(true);

      long sizeAll = 0;
      for(FTPFile ftpFile : getWorkFolderName()){
         FtpHomeCamCheck.dnLoader(ftpFile);
         sizeAll += ftpFile.getSize();
      }
      sizeAll = sizeAll / 1024 / 1024;
      long lo = sizeAll - Long.parseLong(properties.getProperty("size2downMeg"));
      properties.setProperty("size2downMeg", sizeAll + "");
      FtpHomeCamCheck.messageToUser.info(FtpHomeCamCheck.SOURCE_CLASS, decoderEnc.toAnotherEnc("Всего в мегабайтах, после последней проверки: "), sizeAll + "/(LO: " + lo + ")");
      if(lo!=0) eSend(messageToSend(sizeAll, lo));
   }

   /**
    * 1 {@link #connect()}
    * 1.2 загрузка одного файла с сервера.
    *
    * @param ftpFile пофайлово
    */
   private static void dnLoader(FTPFile ftpFile) {
      messageToUser.info(ftpFile.getName(), ftpFile.getGroup(), ftpFile.getLink());
      messageToUser.info(ftpFile.getUser(), ftpFile.getSize() + " size", new Date(ftpFile.getTimestamp().getTimeInMillis()).toString());
   }

   /**
    * 1.4 Почтовое отправление {@link #connect()}
    *
    * @param msg тело письма.
    * @see ESender
    * @see VachokMailer
    * @see EmailsProviders
    * @see SimpleEmailREG
    */
   private void eSend(String msg) {
      List<String> rcpt = new ArrayList<>();
      rcpt.add("143500@gmail.com");
      new DbProperties(FtpHomeCamCheck.SOURCE_CLASS).delProps();
      ESender.sendM(rcpt, "FTP", msg);
      new FileProps(FtpHomeCamCheck.SOURCE_CLASS).setProps(properties);
      new DbProperties(FtpHomeCamCheck.SOURCE_CLASS).setProps(properties);
   }

   /**
    * 1.3 {@link FtpHomeCamCheck#connect()}
    *
    * @param sizeAll размер файлов в байтах
    * @param difSize разница сейчас-сохраненный в {@link Properties}
    * @return сообщение чтобы отправить по-почте.
    */
   private String messageToSend(long sizeAll, long difSize) {
      return FtpHomeCamCheck.SOURCE_CLASS + "\n" + Utilit.toUTF("Всего в мегабайтах, после последней проверки: ") + "\n" + sizeAll + "/(dif: " + difSize + ")" + "\n" + properties.toString();
   }

   /**
    * 1 {@link #getWorkFolderName()}
    * 1.1 {@link #isVeryOld(String)} проверка "давности". Производится путём сверки текущего времени и времени файлика <i>index.dat</i>
    * на FTP-сервере.
    * 1.2 {@link #dateAsFolderName()}
    *
    * @param ftpClient      {@link FtpConnect#getClient()}
    * @param workFolderName {@link #eDateSt}
    * @return массив {@link FTPFile}
    */
   private FTPFile[] ftpFiles(FTPClient ftpClient, String workFolderName) {
      FTPFile[] ftpFiles = new FTPFile[0];
      String indexChangeTime = "Getting FTP Status";
      try{
         ftpFiles = ftpClient.listFiles();
         indexChangeTime = ftpClient.getModificationTime(workFolderName + "index.dat");
      }
      catch(IOException | NullPointerException e){
         FtpHomeCamCheck.messageToUser.out("FTPCTest_75", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         FtpHomeCamCheck.messageToUser.errorAlert("FTPCTest", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      if(isVeryOld(indexChangeTime)){
         FtpHomeCamCheck.messageToUser.errorAlert(indexChangeTime, ftpFiles.length + " files to download. ", dateAsFolderName() + " is very old? " + isVeryOld(indexChangeTime));
      }
      if(!isVeryOld(indexChangeTime)){
         FtpHomeCamCheck.messageToUser.info(indexChangeTime, ftpFiles.length + " files to download. ", dateAsFolderName() + " is very old? " + isVeryOld(indexChangeTime));
      }
      return ftpFiles;
   }

   /**
    * 1.1 {@link #ftpFiles(FTPClient, String)}
    *
    * @param indexChangeTime timestamp когда менялся файл index.dat
    * @return давно или нет производились изменения.
    */
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
      catch(NumberFormatException e){FtpHomeCamCheck.messageToUser.errorAlert("No index.dat", e.getMessage(), "ID 129");}
      return false;
   }

   /**
    * 1 {@link #ftpFiles(FTPClient, String)}
    * 1.2 создаёт имя {@link #eDateSt}
    *
    * @return имя рабочей папки на FTP
    * @see Calendar
    * {@link #eDateSt}
    */
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
}