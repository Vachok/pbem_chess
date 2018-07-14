package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.IOException;
import java.net.InetAddress;
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
    * <a href="http://www.vachok.ru" target = _blank>http://www.vachok.ru</a>
    */
   private static InetAddress vachokRu;

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
         vachokRu = InetAddress.getByName("vachok.ru");
         regIsOk = vachokRu.isReachable(TIMEOUT_1000);
      }
      catch(IOException e){
         MessageToUser messageToUser = new MessageCons();
         messageToUser.out("ConstantsFor_29", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("ConstantsFor", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   /**
    * Вместо {@code toString}...
    *
    * @return строка "типа" {@code toString}
    */
   public static String con() {
      return "ConstantsFor{" +
            "OK=" + OK +
            ", regIsOk=" + regIsOk +
            ", TIMEOUT_1000=" + TIMEOUT_1000 +
            ", vachokRu=" + vachokRu +
            '}';
   }

   /**
    * @return //todo 12.07.2018 (15:44)
    */
   public static String help() {
      return Utilit.toUTF("а тут могла выть ваша...");
   }
}