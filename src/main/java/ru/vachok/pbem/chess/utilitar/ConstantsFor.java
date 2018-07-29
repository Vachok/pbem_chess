package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.emails.EChecker;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 Константы.

 @since 19.06.2018 (21:34) */
public enum ConstantsFor {
   /**
    Просто OK!
    */
   OK;

   public static final String APP_NAME = "ru.vachok.pbem.chess-";

   /**
    {@link UTF8}
    */
   public static final DecoderEnc UTF_8_ENC = new UTF8();

   /**
    Таймаут 1000мс. 1 сек.
    */
   public static final int TIMEOUT_1000 = 1000;

   /**
    {@link List} e-mail для отправки.
    */
   public static final List<String> RCPT = new ArrayList<>();

   /**
    Выход с ошибкой
    */
   public static final int BAD = 666;

   /**
    {@link MessageCons}
    */
   public static final MessageToUser MESSAGE_LOG = new MessageCons();

   public static final int KILOBYTE = 1024;

   /**
    1 килобайт
    */
   public static final int MEGABYTE = KILOBYTE * 1024;

   /**
    1 мегабайт в байтах
    */
   public static final int GIGABYTE = MEGABYTE * 1024;

   /**
    Color Figure
    */
   public static final String BLACK = "BLACK";

   /**
    Запрос для получения содержимого сайта из {@link URL}

    @see EChecker
    */
   public static final String GETTOME = "gettome:";

   public static final UnsupportedOperationException NOT_READY = new UnsupportedOperationException("NOT READY, Sorry...");

   public static final DataConnectTo DATA_CONNECT_TO_REG = new RegRuMysql();

   public static final double NRIGA = 32.2;

   public static final double A107 = 21.6;

   public static final String MY_EMAIL = "143500@gmail.com";

   public static final DecoderEnc CP_1251 = new WinCP();

   public static final File DIR_VID = new File("f:\\Video\\Captures\\IPCamera\\IV2405P_00626E6A45EA\\record\\");

   /**
    Доступность <a href="http://www.vachok.ru" target=_blank></a>
    */
   private static boolean regIsOk;

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
    {@link #regIsOk}

    @return true = доступен.
    */
   public static boolean getRegIsOk() {
      return regIsOk;
   }

   /**
    @return строка в помощью по-программе.
    */
   public static String help() {
      UTF_8_ENC.toAnotherEnc("Хуйня, ващэ хуйня!");
      throw NOT_READY;
   }

}