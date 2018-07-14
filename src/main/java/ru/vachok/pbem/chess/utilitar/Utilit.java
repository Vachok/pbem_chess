package ru.vachok.pbem.chess.utilitar;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.WARNING;


/**
 * Полезные методы
 *
 * @since 19.06.2018 (21:43)
 */
public class Utilit {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = Utilit.class.getSimpleName();

   private static final Logger LOGGER = Logger.getLogger(SOURCE_CLASS);

   private static MessageToUser messageToUser = new MessageCons();

   /**
    * Проверка доступности ПК.
    *
    * @return true - онлайн.
    */
   public boolean isA161OK() {
      InetAddress inetAddress;
      try{
         inetAddress = InetAddress.getByName("a161.eatmeat.ru");
         return inetAddress.isReachable(ConstantsFor.TIMEOUT_1000);
      }
      catch(IOException e){
         Utilit.LOGGER.log(WARNING, "java.net.UnknownHostException is" + e.getMessage());
      }
      throw new NullPointerException("FUCK!");
   }

   /**
    * Побайтовое преобразование в UTF-8
    *
    * @param pageBytes байты строки
    * @return строка в запрошенной кодировке
    */
   public static String toUTF(byte[] pageBytes) {
      try{
         return new String(pageBytes, "UTF-8");
      }
      catch(UnsupportedEncodingException e){
         LOGGER.log(WARNING, "java.io.UnsupportedEncodingException is" + e.getMessage());
      }
      return "Unsupported";
   }

   /**
    * Преобразование в <b>UNICODE</b>
    *
    * @param s строка для преобразования
    * @return UNICODE {@link String }
    */
   public static String toUnicode(String s) {
      try{
         return new String(s.getBytes(), "UNICODE");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.out("Utilit_86", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return "Can't convert to UNICODE!";
   }

   /**
    * Преобразование в <b>Windows-1251</b>
    *
    * @param s строка для преобразования
    * @return Windows -1251 {@link String }
    * @deprecated
    */
   @Deprecated (since = "15.07.2018 (0:29)")
   public static String toW1251(String s) {
      try{
         return new String(s.getBytes(), "Windows-1251");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.out("Utilit_103", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return "Can't convert to Windows-1251!";
   }

   /**
    * Определяем дальнейшие действия.
    */
   public static void whatNextToDo() {
      String s;
      Scanner scanner = new Scanner(System.in);
      messageToUser.infoNoTitles(toUTF("Введите комманду. OR нажмите h, для вызова помощи."));
      while(scanner.hasNext()){
         s = scanner.nextLine();
         switch(s){
            case "get":
               break;
            case "h":
               helpMe(SOURCE_CLASS);
               break;
            case "exit":
               exitWitnClean(63);
               break;
            default:
               throw new UnsupportedOperationException(Utilit.toUTF("ЗАПРЕЩАЮ!"));
         }
      }
   }

   /**
    * Преобразование в <b>UTF-8</b>
    *
    * @param s строка для преобразования
    * @return Windows -1251 {@link String }
    * @deprecated since 15.07.2018 (0:29)
    */
   @Deprecated (since = "15.07.2018 (0:29)")
   public static String toUTF(String s) {
      try{
         return new String(s.getBytes(), "UTF-8");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.out("Utilit_63", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return "Can't convert to UTF-8!";
   }

   /**
    * Помощь на экран.
    *
    * @param whatHelpNeeds чем помочь?
    */
   private static void helpMe(String whatHelpNeeds) {
      throw new UnsupportedOperationException(toUTF("03 ЕДЕТ!\n\n") + whatHelpNeeds);
   }

   /**
    * Выход, с перемещением логов в папку <b>logs</b>
    *
    * @param reaSon номер строки-вызова
    */
   public static void exitWitnClean(int reaSon) {
      File[] prnFiles = new File(".").listFiles();
      File dirLog = new File("logs\\");
      try{
         if(!dirLog.exists()) FileUtils.forceMkdir(dirLog);
         FileUtils.cleanDirectory(dirLog);

         for(File prnFile : prnFiles!=null? prnFiles: new File[0]){
            if(prnFile.getName().contains(".prn") || prnFile.getName().contains(".log") || prnFile.getName().contains(".obj")){FileUtils.copyFileToDirectory(prnFile, dirLog, true); }
         }
      }
      catch(IOException e){
         if(prnFiles!=null){
            for(File p : prnFiles) messageToUser.info(SOURCE_CLASS, "PRN HERE:", p.getAbsolutePath());
         }
         messageToUser.out("Utilit_128", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      messageToUser.info(toUTF("Я пошел..."), dirLog.getAbsolutePath(), new Date(dirLog.lastModified()) + "");
      System.exit(reaSon);

   }

   /**
    * Строка приветствия.
    *
    * @return строка в зависимости от времени суток, возвращает разное приветствие.
    */
   public String checkTime() {
      String s = Utilit.toUTF("Доброго времени суток");
      if(LocalTime.now().isAfter(LocalTime.of(12, 0))) s = "Добрый день!";
      if(LocalTime.now().isAfter(LocalTime.of(21, 0))) s = "Добрый вечер!";
      if(LocalTime.now().isBefore(LocalTime.of(9, 0))) s = "Доброй ночи!";
      if(LocalTime.now().isBefore(LocalTime.of(12, 0))) s = "Доброе утро!";
      return s;
   }

   /**
    * imap.yandex.com
    * a161.eatmeat.ru
    * getMailBin.chess.vachok.ru
    *
    * @return состояние серверов
    */
   public String chkServers() {
      String s1 = "";
      try{
         InetAddress inetAddressCHK = InetAddress.getByName("getMailBin.chess.vachok.ru");
         String s = " is now : \n";
         s1 = inetAddressCHK.toString() + s;
         inetAddressCHK = InetAddress.getByName("");
         s1 = s1 + inetAddressCHK.isReachable(ConstantsFor.TIMEOUT_1000);
         inetAddressCHK = InetAddress.getByName("a161.eatmeat.ru");
         s1 = s1 + inetAddressCHK.isReachable(ConstantsFor.TIMEOUT_1000);
      }
      catch(IOException e){
         Utilit.messageToUser.out("Utilit_172", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         Utilit.messageToUser.errorAlert("Utilit", e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
      return s1;
   }
}