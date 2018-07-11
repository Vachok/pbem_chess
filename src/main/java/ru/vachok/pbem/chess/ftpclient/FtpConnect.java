package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.IOException;
import java.util.Arrays;


public interface FtpConnect {

   void connect();

   default FTPClient getClient() {
      MessageToUser messageToUser = new MessageCons();
      FTPClient ftpClient = new FTPClient();
      ftpClient.setAutodetectUTF8(true);
      try{ftpClient.connect(FTPDefaults.HOSTNAME, FTPDefaults.PORT);}
      catch(IOException e){
         messageToUser.out("FtpConnect_27", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert("FtpConnect Problems with connection!", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      try{ftpClient.login(FTPDefaults.USER_NAME, FTPDefaults.DEF_PASSWORD);}
      catch(IOException e){
         messageToUser.out("FtpConnect_25", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert("FtpConnect. WRONG PASSWORD!", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return ftpClient;
   }

   FTPFile[] getFTPFiles();
}
