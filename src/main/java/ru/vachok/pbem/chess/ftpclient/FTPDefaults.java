package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTP;
import ru.vachok.mysqlandprops.DbProperties;


/**
 * @since 03.07.2018 (23:01)
 */
public enum FTPDefaults {
   FTP_DEFAULTS;

   /**
    * IP камера в комнате
    */
   public static final String HOSTNAME = "10.10.111.52";

   /**
    * Порт {@link #HOSTNAME}
    */
   public static final int PORT = 50021;

   /**
    * имя пользователя
    */
   public static final String USER_NAME = "kudr";

   /**
    * пароль
    */
   public static final String DEF_PASSWORD = new DbProperties("pass").getProps().getProperty("defpassftp");

   /**
    * Тип передачи. Нужен для корректной загрузки.
    */
   public static final int MY_FILE_TYPE = FTP.BINARY_FILE_TYPE;
}
