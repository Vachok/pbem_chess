package ru.vachok.pbem.chess.emails;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @since 24.06.2018 (10:41)
 */
public class ESender implements Runnable {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = ESender.class.getSimpleName();

   private MessageToUser messageToUser = new MessageCons();

   @Override
   public void run() {
      throw new UnsupportedOperationException("In progress");
   }

   /**
    * Отправка запрошенного URL
    *
    * @param orderURL запрос вида "get:адрес"
    * @throws MalformedURLException        url
    * @throws UnsupportedEncodingException bytes2url
    */
   public void sendMe(String orderURL) throws MalformedURLException, UnsupportedEncodingException {
      List<String> rctp = new ArrayList<>();
      rctp.add("143500@gmail.com");
      String subj = "YOUR RESPONSE (" + LocalDateTime.now().toString() + ")";
      URL url = null;
      try{
         url = new URL(orderURL);
      }
      catch(MalformedURLException e){
         try{
            url = new URL("http://" + orderURL);
         }
         catch(MalformedURLException e1){
            url = new URL("https://" + orderURL);
         }

      }
      byte[] pageBytes = new byte[ConstantsFor.MEGABYTE];
      try(InputStream openStreamURL = url.openStream()){
         pageBytes = openStreamURL.readAllBytes();
      }
      catch(IOException e){
         messageToUser.out("ESender_50", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert("ESender", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }

      //Ответы, действия
      String usrToString = new String(pageBytes, "UTF-8");
      new EChecker().sendMail(rctp, subj, usrToString);
   }
}