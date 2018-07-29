package ru.vachok.pbem.chess.emails;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;

import javax.mail.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MailWorksLocal1 implements Callable<Message[]> {

   private static final String SOURCE_CLASS = MailWorksLocal1.class.getSimpleName();

   private final MessageToUser messageToUser = new MessageCons();

   @Override
   public Message[] call() {
      return getInbox();
   }

   public Message[] getInbox() {
      Properties mailProps = getSessionProps();
      Authenticator authenticator = new Authenticator() {

         @Override
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(mailProps.getProperty("user"), mailProps.getProperty("password"));
         }
      };
      Session chkSess = Session.getDefaultInstance(mailProps, authenticator);
      Store store = null;
      try{
         store = chkSess.getStore();
         store.connect(mailProps.getProperty("host"), mailProps.getProperty("user"), mailProps.getProperty("password"));
      }
      catch(MessagingException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, String.format("%s%n%n%s", e.getMessage(), Arrays.toString(e.getStackTrace())));
      }
      Folder inBox;
      try{
         inBox = Objects.requireNonNull(store).getFolder("Inbox");
         inBox.open(Folder.READ_WRITE);
         return saveToDiskAndReturn(inBox);

      }
      catch(MessagingException | IOException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, String.format("%s%n%n%s", e.getMessage(), Arrays.toString(e.getStackTrace())));
      }
      throw new NullPointerException("26.07.2018 (18:39)");
   }

   private Properties getSessionProps() {
      InitProperties initProperties = new DBRegProperties("mail-regru");
      Properties sessionProps = initProperties.getProps();
      sessionProps.setProperty("NewSessionStarted", new Date().toString());
      saveProps(sessionProps);
      return sessionProps;
   }

   private Message[] saveToDiskAndReturn(Folder inBox) throws MessagingException, IOException {
      Message[] mailMes = inBox.getMessages();
      for(Message message : mailMes){
         messageToUser.info(message.getMessageNumber() + ". " + message.getReceivedDate() + ": type " + message.getContentType(), "From: " +
                     Arrays.toString(message.getFrom()) + " | " + message.getSubject(),
               Arrays.toString(message.getAllRecipients()) + " recipients. "
                     + message.getFlags());
         message.writeTo(new FileOutputStream("mail\\" + message.getMessageNumber() + ".eml"));
         if(message.getSubject().toLowerCase().contains("speed:")){
            String speedString = message.getSubject().toLowerCase().replaceFirst("speed:", "");
            Instant sentDate = message.getSentDate().toInstant();
         }
      }
      return mailMes;
   }

   private void saveProps(Properties sessionProps) {
      InitProperties initProperties = new FileProps(SOURCE_CLASS);
      initProperties.setProps(sessionProps);
      initProperties = new DBRegProperties(ConstantsFor.APP_NAME + SOURCE_CLASS);
      initProperties.setProps(sessionProps);
   }
}