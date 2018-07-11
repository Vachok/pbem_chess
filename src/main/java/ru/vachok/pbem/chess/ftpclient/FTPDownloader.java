package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTPFile;


/**
 * @since 03.07.2018 (22:57)
 */
public class FTPDownloader implements Runnable, FtpConnect {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = FTPDownloader.class.getSimpleName();

   private static final UnsupportedOperationException NOT_READY_YET = new UnsupportedOperationException("Not ready yet");
   @Override
   public void run() {
      throw FTPDownloader.NOT_READY_YET;
   }

   @Override
   public void connect() {
      throw FTPDownloader.NOT_READY_YET;
   }

   @Override
   public FTPFile[] getFTPFiles() {
      throw FTPDownloader.NOT_READY_YET;
   }
}