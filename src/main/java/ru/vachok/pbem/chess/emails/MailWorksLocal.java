package ru.vachok.pbem.chess.emails;


import com.sun.mail.util.BASE64DecoderStream;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;


/**
 * @since 22.06.2018 (22:26)
 */
public class MailWorksLocal implements Callable {

   private static final String SOURCE_CLASS = MailWorksLocal.class.getSimpleName();

   private static MessageToUser messageToUser = new MessageCons();

   /**
    * @see EChecker
    */
   private Message[] mailMessages;

   private Callable<Object> thisObject;

   private Map<String, String> mapMail;

   /**
    * Декодированные байты почтового сообщения.
    */
   private byte[] mailMSGBytes;

   /**
    * Конструктор
    *
    * @param mailMessages массив сообщения от сервера.
    */
   public MailWorksLocal(Message[] mailMessages) {
      this.mailMessages = mailMessages;
      thisObject = ( Callable<Object> ) mailS();
   }

   /**
    * Заполняет {@link #mailMSGBytes}
    */
   private Object mailS() {
      Object o = mailMessages;
      int length = mailMessages.length;
      messageToUser.infoNoTitles(length + " is total count of e-mails");
      try{ mailMSGBytes = decode(mailMessages).readAllBytes();}
      catch(IOException e){
         messageToUser.out("MailWorksLocalTest_39", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("MailWorksLocalTest", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return o;
   }

   /**
    * @param mapMail мапа, полученная из чекера.
    * @see EChecker
    */
   public MailWorksLocal(Map<String, String> mapMail) {
      this.mapMail = mapMail;
   }

   /**
    * Computes a result, or throws an exception if unable to do so.
    *
    * @return computed result
    * @throws Exception if unable to compute a result
    */
   @Override
   public Object call() throws Exception {
      return thisObject.call();
   }
   private BASE64DecoderStream decode(Message[] inputMesEnc) {
      for(Message m : inputMesEnc){
         try(BASE64DecoderStream outputStream = new BASE64DecoderStream(m.getInputStream())){
            return outputStream;
         }
         catch(MessagingException | IOException e){
            messageToUser.out("MailWorksLocalTest_48", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
            messageToUser.errorAlert("MailWorksLocalTest", e.getMessage(), Arrays.toString(e.getStackTrace()));
         }
      }
      Thread.currentThread().interrupt();
      throw new NullPointerException("Nothing here...");
   }
}