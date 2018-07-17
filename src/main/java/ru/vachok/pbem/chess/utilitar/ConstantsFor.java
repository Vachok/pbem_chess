package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.A161Mysql;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.emails.EChecker;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.Arrays;


/**
 * Константы.
 *
 * @since 19.06.2018 (21:34)
 */
public enum ConstantsFor {
   /**
    * Просто OK!
    */
   OK;

   /**
    * Таймаут 1000мс. 1 сек.
    */
   public static final int TIMEOUT_1000 = 1000;

   /**
    * Выход с ошибкой
    */
   public static final int BAD = 666;

   /**
    * 1000000 миллисек timeout.
    */
   public static final long TIMEOUT_100000 = 1000000;

   /**
    * 1 мегабайт в байтах
    */
   public static final int MEGABYTE = 1024 * 1024 * 1024;

   /**
    * Выход с предупреждением
    */
   public static final int WARN = 333;

   /**
    * Название кодировки
    *
    */
   public static final String UTF_8 = "UTF-8";

   /**
    * 1 килобайт
    */
   public static final int KILOBYTE = 1024 * 1024;

   /**
    * Кодировка Windows-1251 (CP1251)
    */
   public static final String W1251 = "Windows-1251";

   /**
    * Color Figure
    */
   public static final String BLACK = "BLACK";

   /**
    * Запрос для получения содержимого сайта из {@link URL}
    *
    * @see EChecker
    */
   public static final String GETTOME = "gettome:";

   public static final UnsupportedOperationException NOT_READY = new UnsupportedOperationException("NOT READY, Sorry...");

   public static final DataConnectTo DATA_CONNECT_TO_REG = new RegRuMysql();

   public static final DataConnectTo DATA_CONNECT_TO_A161 = new A161Mysql("testb");

   public static DecoderEnc decoderEncUtf8 = new UTF8();

   /**
    * Доступность <a href="http://www.vachok.ru" target=_blank></a>
    */
   private static boolean regIsOk;

   /**
    * {@link #regIsOk}
    *
    * @return true = доступен.
    */
   public static boolean getRegIsOk() {
      return regIsOk;
   }

   static {
      try{
         InetAddress vachokRu = InetAddress.getByName("vachok.ru");
         regIsOk = vachokRu.isReachable(TIMEOUT_1000);
      }
      catch(IOException e){
         MessageToUser messageToUser = new MessageCons();
         messageToUser.out("ConstantsFor_29", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("ConstantsFor", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }
   /**
    * @return строка в помощью по-программе.
    */
   public static String help() {
      decoderEncUtf8.toAnotherEnc("Хуйня, ващэ хуйня!");
      throw NOT_READY;
   }
}