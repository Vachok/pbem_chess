package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
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
      connect();
   }

   @Override
   public String connect() {
      FTPClient ftpClient = getClient();
      FTPFile[] ftpFiles = new FTPFile[0];
      try{

         ftpFiles = ftpClient.listFiles();
      }
      catch(IOException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, String.format("%s%n%n%s", e.getMessage(),
               Arrays.toString(e.getStackTrace()).replaceAll(", ",
                     "\n").replace("{", "").replace("}", "")));
      }
      return Arrays.toString(ftpFiles).replaceAll(", ", "\n");
   }

   @Override
   public FTPFile[] getWorkFolderName() {
      throw FTPDownloader.NOT_READY_YET;
   }
}