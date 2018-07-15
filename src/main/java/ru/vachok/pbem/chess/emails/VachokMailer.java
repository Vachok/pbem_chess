package ru.vachok.pbem.chess.emails;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Provider;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Properties;

import static javax.mail.Provider.Type.TRANSPORT;


/**
 * PBEM CHESS {@link Provider} для электронной почты.
 *
 * @since 21.06.2018 15:51
 */
public class VachokMailer implements Serializable, EmailsProviders {

   /**
    * @deprecated
    */
   @Deprecated (since = "15.07.2018 (20:45)", forRemoval = true)
   private static final long serialVersionUID = 1L;

   /**
    * @deprecated
    */
   @Deprecated (since = "15.07.2018 (20:46)", forRemoval = true)
   private String version = String.valueOf(serialVersionUID);

   /**
    * Тип {@link Provider}, для отправки
    */
   private transient Provider.Type transport = TRANSPORT;

   /**
    * {@link MessageCons}
    */
   private transient MessageToUser messageToUser = new MessageCons();

   /**
    * Установщик класса.
    * {@link #chessMail()}
    */
   public VachokMailer() {
      this.chessMail();
   }

   @Override
   public String toString() {
      return "VachokMailer{" +
            "serialVersionUID=" + serialVersionUID +
            ", transport=" + transport +
            ", version='" + version + '\'' +
            "AUTH{" + "\n" +
            '}';
   }

   /**{@link #VachokMailer()}
    * Сеттит {@link Provider}, для отправлений через хостинг.
    *
    *{@link #writeReplace()}
    * @return провайдер Reg.Ru (chess)
    */
   @Override
   public Provider chessMail() {
      String vendor = "Vachok";
      String className = "com.sun.getMailBin.smtp.SMTPTransport";
      String protocol = "smtps";
      try{
         writeReplace();
      }
      catch(IOException e){
         messageToUser.out("RegRuMailer_62", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("VachokMailer", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return new Provider(transport, protocol, className, vendor, version);
   }

   /**
    * Read resolve object.
    *
    * @return the object
    * @throws ObjectStreamException the object stream exception
    */
   @SuppressWarnings ("WeakerAccess")
   protected Object readResolve() throws ObjectStreamException {
      return this.toString();
   }

   /**
    * Write replace object.

    * @throws IOException                the io exception
    */
   @SuppressWarnings ("WeakerAccess")
   protected void writeReplace() throws IOException {
      Object reRu = this.readResolve();
      byte[] reRuB = reRu.toString().getBytes();
      try(FileOutputStream objToFileStream = new FileOutputStream("regru.obj")){
         objToFileStream.write(reRuB);
      }
      catch(IOException e){
         messageToUser.out("RegRuMailer_63", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("VachokMailer", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }

   }

   /**
    * Аутентификация для <i>SMTP</i>-соединения.
    * <p>
    * chess.vachok.ru
    *
    * @see EChecker
    * @since 20.06.2018 (16:22)
    */
   static class AuthForChess extends Authenticator {

      private static final String SOURCE_CLASS = AuthForChess.class.getSimpleName();

      /**
       * {@link MessageCons}
       */
      private static MessageToUser messageToUser = new MessageCons();

      /**
       * {@link DbProperties}
       */
      private static InitProperties initProperties = new DbProperties("SimpleEmailBinchess");
      @Override
      public String toString() {
         return "AuthForChess{" +
               "initProperties=" + initProperties +
               ", messageToUser=" + messageToUser +
               ", SOURCE_CLASS='" + SOURCE_CLASS + '\'' +
               '}';
      }

      /**
       * Метод почтовой аутентификации
       *
       * @return {@link PasswordAuthentication} . Данные из {@link #initProperties}
       * @see ESender
       */
      @Override
      protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
         messageToUser.info(SOURCE_CLASS, "PasswordAuthentication", "STARTS...");
         Properties prop = initProperties.getProps();
         String userName = prop.getProperty("userName");
         String pass = prop.getProperty("pass");
         return new javax.mail.PasswordAuthentication(userName, pass);
      }
   }
}
