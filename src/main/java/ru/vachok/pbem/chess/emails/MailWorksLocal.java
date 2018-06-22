package ru.vachok.pbem.chess.emails;


import com.sun.mail.util.BASE64DecoderStream;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Arrays;


/**
 * @since 22.06.2018 (22:26)
 */
class MailWorksLocal implements Runnable {

   private static final String SOURCE_CLASS = MailWorksLocal.class.getSimpleName();

   private static MessageToUser messageToUser = new MessageCons();

   private Message[] mailMessages;

   private byte[] bytes;

   MailWorksLocal(Message[] mailMessages) {
      this.mailMessages = mailMessages;
   }

   public byte[] getMailMessageBytes() {
      return bytes;
   }

   @Deprecated (since = "23.06.2018 (5:54)" )
   public void mailS() {
      int length = mailMessages.length;
      messageToUser.infoNoTitles(length + " is total count of e-mails" );
      try{bytes = decode(mailMessages).readAllBytes();}
      catch(IOException e){
         messageToUser.out("MailWorksLocalTest_39", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n" )).getBytes());
         messageToUser.errorAlert("MailWorksLocalTest", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   /**
    * When an object implementing interface <code>Runnable</code> is used
    * to create a thread, starting the thread causes the object's
    * <code>run</code> method to be called in that separately executing
    * thread.
    * <p>
    * The general contract of the method <code>run</code> is that it may
    * take any action whatsoever.
    *
    * @see Thread#run()
    */
   @Override
   public void run() {
      mailS();
   }

   private BASE64DecoderStream decode(Message[] inputMesEnc) {
      for(Message m : inputMesEnc){
         try(BASE64DecoderStream outputStream = new BASE64DecoderStream(m.getInputStream())){
            return outputStream;
         }
         catch(MessagingException | IOException e){
            messageToUser.out("MailWorksLocalTest_48", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n" )).getBytes());
            messageToUser.errorAlert("MailWorksLocalTest", e.getMessage(), Arrays.toString(e.getStackTrace()));
         }
      }
      Thread.currentThread().interrupt();
      throw new NullPointerException("Nothing here..." );
   }
}