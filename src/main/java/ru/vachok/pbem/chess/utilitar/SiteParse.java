package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;


/**
 * @since 09.07.2018 (10:44)
 */
public class SiteParse {

   private static final String SOURCE_CLASS = SiteParse.class.getSimpleName();

   private MessageToUser messageToUser = new MessageCons();

   private URL siteURL;

   private void dnldSite(String month, String day) {
      byte[] stringDownloadedBytes = null;
      try{
         siteURL = new URL(String.format("https://istra--mo.sudrf.ru/modules.php?name=sud_delo&srv_num=1&H_date=%s.%s.2018", day, month));

      }
      catch(MalformedURLException e){ messageToUser.errorAlert(SiteParse.SOURCE_CLASS, "err id 20", e.getMessage()); }
      try(InputStream inputStream = siteURL.openStream();){
         stringDownloadedBytes = inputStream.readAllBytes();
         messageToUser.out(day + month, stringDownloadedBytes);
      }
      catch(IOException e){messageToUser.errorAlert(SiteParse.SOURCE_CLASS, "err id 26", e.getMessage());}
      String urlAsStringDownloaded = "NO URL!";
      try{urlAsStringDownloaded = new String(Objects.requireNonNull(stringDownloadedBytes), "Windows-1251");}
      catch(UnsupportedEncodingException e){
         messageToUser.errorAlert(SiteParse.SOURCE_CLASS, "err id 33", e.getMessage());
      }
      messageToUser.infoNoTitles(urlAsStringDownloaded);
   }

}