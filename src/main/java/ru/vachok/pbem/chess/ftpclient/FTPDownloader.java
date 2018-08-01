package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTPFile;


/** <h1>Загрузка файлов с FTP-cam.</h1>

 * @since 03.07.2018 (22:57)
 */
public class FTPDownloader implements Runnable, FtpConnect {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = FTPDownloader.class.getSimpleName();

   /**
    * Сообщение о неготовности компонента
    */
   private static final UnsupportedOperationException NOT_READY_YET = new UnsupportedOperationException("Not ready yet 12.07.2018 (16:07) ");

   /**
    * 1. Стартовая точка
    */
   @Override
   public void run() {
      throw FTPDownloader.NOT_READY_YET;
   }

   @Override
   public String connect() {
      throw FTPDownloader.NOT_READY_YET;
   }

   @Override
   public FTPFile[] getWorkFolderName() {
      throw FTPDownloader.NOT_READY_YET;
   }
}