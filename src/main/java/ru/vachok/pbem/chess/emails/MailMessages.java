package ru.vachok.pbem.chess.emails;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.board.MoveStarter;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.SpeedRunActualize;
import ru.vachok.pbem.chess.utilitar.UserAns;

import javax.mail.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;
import static ru.vachok.pbem.chess.utilitar.ConstantsFor.UTF_8_ENC;


/**
 <h1>Получает сообщения</h1>
 <p>
 {@link UserAns}, {@link MoveStarter}, {@link SpeedRunActualize}

 @since 25.06.2018 (2:41) */
public class MailMessages implements Callable<Message[]> {

   private static final String SOURCE_CLASS = MailMessages.class.getSimpleName();


   /**
    <h3>true = очистка ящика.</h3>
    */
   private boolean cleanMBox;

   /**
    <h2>Конструктор очистки ящика.</h2>

    @param cleanMBox удалить сообщения = true
    */
   public MailMessages(boolean cleanMBox) {
      this.cleanMBox = cleanMBox;
      MessageToUser messageToUser = new MessageCons();
      messageToUser.info(SOURCE_CLASS, "cleanMBox is", cleanMBox + ".");
   }

   /**
    <b>Конструктор по-умолчанию.</b>
    */
   public MailMessages() {
      Logger.getLogger(SOURCE_CLASS).log(INFO, this.getClass().getTypeName());
   }

   /**
    <h2>Вызов</h2>
    {@link UserAns}, {@link MoveStarter}, {@link SpeedRunActualize}
    <p>
    В зависимости от {@link #cleanMBox}, или
    1.1 {@link Cleaner#saveToDiskAndDelete(Folder)}
    1.1 {@link #getInbox()}

    @return сообщения. {@link Message}
    */
   @Override
   public Message[] call() {
      Message[] messages = new Message[0];
      try{
         if(cleanMBox) Cleaner.saveToDiskAndDelete(getInbox());
         messages = getInbox().getMessages();
      }
      catch(MessagingException | IOException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, String.format("%s%n%n%s", e.getMessage(), Arrays.toString(e.getStackTrace())));
      }
      return messages;
   }

   /**
    <h2>Взять {@link Folder} {@code Inbox}</h2>{@link #call()}
    <p>
    Проверяет почту.
    .1 {@link #getSessionProps()}

    @return папку Inbox. {@link Folder}
    */
   protected Folder getInbox() {
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
      Folder inBox = null;
      try{
         inBox = Objects.requireNonNull(store).getFolder("Inbox");
         inBox.open(Folder.READ_WRITE);
         Logger.getLogger(Cleaner.class.getSimpleName()).log(INFO, inBox.getMessageCount() + " inbox size");
         return inBox;
      }
      catch(MessagingException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, String.format("%s%n%n%s", e.getMessage(), Arrays.toString(e.getStackTrace())));
      }
      throw new UnsupportedOperationException("Inbox not available :(");
   }

   /**
    {@link #getInbox()}
    <p>
    {@link #saveProps(Properties)}

    @return {@link Properties} от {@link DBRegProperties} {@code mail-regru}
    */
   private Properties getSessionProps() {
      InitProperties initProperties = new DBRegProperties("mail-regru");
      Properties sessionProps = initProperties.getProps();
      sessionProps.setProperty("NewSessionStarted", new Date().toString());
      saveProps(sessionProps);
      return sessionProps;
   }


   /**<h2>Созранение {@link Properties}</h2>
    Пробует сохранить настройки в файл и в БД.
    <p>
    {@link ConstantsFor#APP_NAME} + {@link #SOURCE_CLASS}

    @param sessionProps настройки сокдинения. {@link #getSessionProps()}
    */
   private void saveProps(Properties sessionProps) {
      InitProperties initProperties = new FileProps(SOURCE_CLASS);
      initProperties.setProps(sessionProps);
      initProperties = new DBRegProperties(ConstantsFor.APP_NAME + SOURCE_CLASS);
      initProperties.getProps();
      initProperties.setProps(sessionProps);
   }

   /**
    <h1>Очищает ящик</h1>.

    @since 28.07.2018 (2:55)
    */
   public static class Cleaner extends MailMessages {

      /**<h3>Разбор удалить/нет</h3>
       Эксепшены. по-теме сообщения.
       Содержащее этот паттерн удалено будет. Остальное нет.
       <p>
       Если содержит {@code all} - удалить всё.
       */
      private static String delMe = "";

      /**<h2>Конструктор с уточнением по-удалению.</h2>
       @param delMe что требуется удалить.
       */
      public Cleaner(String delMe) {
         Cleaner.delMe = delMe;
      }

      /**<h2>Конструктор умолч.</h2>
       */
      public Cleaner() {
      }


      /**<h2>Работа</h2>{@link #cleanMBox}
       @param inbox {@link #getInbox()}
       @return {@link Message}[], если остались.
       @throws MessagingException что-то случилось с почтой
       @throws IOException сохраняет на диск.        */
      static Message[] saveToDiskAndDelete(Folder inbox) throws MessagingException, IOException {
         Message[] mailMes = inbox.getMessages();
         if(mailMes.length <= 0) throw new RejectedExecutionException(UTF_8_ENC.toAnotherEnc("Сообщений нет..."));
         for(Message message : mailMes){
            String fileName = "mail\\" + message.getMessageNumber() + "-" + System.currentTimeMillis() + ".eml";
            FileOutputStream outputStream = new FileOutputStream(fileName);
            message.writeTo(outputStream);
            if(!message.getSubject().toLowerCase().contains(delMe)){
               Logger.getLogger(Cleaner.class.getSimpleName()).log(WARNING,
                     UTF_8_ENC.toAnotherEnc("Пропущено: " + Arrays.toString(message.getFrom()) + "\n" + message.getSubject()));
            }
            else{ if(new File(fileName).exists() && new File(fileName).length() > 10) message.setFlag(Flags.Flag.DELETED, true); }
         }
         Logger.getLogger(Cleaner.class.getSimpleName()).log(INFO, inbox.getMessageCount() + " inbox size");
         inbox.close(true);
         return mailMes;
      }
   }
}