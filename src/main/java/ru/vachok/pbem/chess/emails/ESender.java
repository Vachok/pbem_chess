package ru.vachok.pbem.chess.emails;


import javafx.concurrent.Task;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;

import javax.mail.Authenticator;
import javax.mail.NoSuchProviderException;
import javax.mail.Provider;
import javax.mail.Session;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


/**
 * Почтовый отправитель
 *
 * @since 24.06.2018 (10:41)
 */
public class ESender extends Task<Boolean> implements Runnable, EMailsChess {

    /**
     * Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = ESender.class.getSimpleName();
    private static final ExecutorService EXECUTOR_SENDER = Executors.newSingleThreadExecutor();
    private static MessageToUser messageToUser = new MessageCons();
    private static EmailsProviders p = new VachokMailer();
  
   private static MessageToUser messageToUser = new MessageCons();

   /**
    * Аутентификатор и настройка провайдера почты.
    * {@link EmailsProviders}
    *
    * @see VachokMailer
    */
   private static EmailsProviders p = new VachokMailer();

   private DecoderEnc decoderEnc = new UTF8();

   /**
    * {@link List} получателей
    */
   private List<String> rcpt;

   /**
    * Тема
    */
   private String subj;

   /**
    * Тело сообщения
    */
   private String msg;

   /**
    * Запрошенный {@link URL}
    */
   private URL orderURL;

   /**
    * Конструктор по-умолчанию
    *
    * @param rcpt {@link List} строк - адреса получателей
    * @param subj тема письма
    * @param msg  тело письма
    */
   public ESender(List<String> rcpt, String subj, String msg) {
      this.rcpt = rcpt;
      this.subj = subj;
      this.msg = msg;
   }

   /**
    * Конструктор запроса {@link URL} {@code gettome:}
    *
    * @param rcpt     {@link List} строк - адреса получателей
    * @param subj     тема письма
    * @param msg      тело письма
    * @param orderURL URL, для парсинга
    */
   public ESender(List<String> rcpt, String subj, String msg, URL orderURL) {
      this.rcpt = rcpt;
      this.subj = subj;
      this.msg = msg;
      this.orderURL = orderURL;
      sendURL(orderURL);
   }

   /**
    * Отправить сообщение электронной почты.
    *
    * @param rcpt адреса электронной почты <b>To</b>.
    * @param subj тема
    * @param msg  сообщение, для отправки.
    * @return статус. true = удача.
    */
   @Override
   public boolean sendMail(List<String> rcpt, String subj, String msg) {
      this.rcpt = rcpt;
      ESender.sendM(rcpt, subj, msg);
      return true;
   }

   @Override
   public String checkMail() {
      return null;
   }

   /**
    * {@link #ESender(List, String, String, URL)}
    * Отправка запрошенного URL
    *
    * @param url {@link #orderURL}
    * @see EChecker#getUrlAddress(String)
    */
   void sendURL(URL url) {
      subj = "GETTOME (URL4U" + LocalDateTime.now().toString() + ")";
      byte[] pageBytes = new byte[ConstantsFor.MEGABYTE];
      try(InputStream openStreamURL = orderURL.openStream()){
         pageBytes = openStreamURL.readAllBytes();
      }
      catch(IOException e){
         ESender.messageToUser.out("ESender_50", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         ESender.messageToUser.errorAlert("ESender", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      this.msg = decoderEnc.toAnotherFromBytes(pageBytes);
      sendMail();
   }

   /**
    * Отправка сообщения электронной почты.
    *
    * @return true = ok.
    * @see VachokMailer#chessMail()
    */
   private boolean sendMail() {
      InitProperties initPr = new DbProperties("mailP");
      Properties mailP = initPr.getProps();
      Authenticator authenticator = new VachokMailer.AuthForChess();
      (( VachokMailer.AuthForChess ) authenticator).getPasswordAuthentication();
      Session session = Session.getInstance(mailP, authenticator);
      Properties cur = session.getProperties();
      initPr = new FileProps(ESender.SOURCE_CLASS);
      initPr.setProps(cur);
      Provider regRu = ESender.p.chessMail();
      Email simpleEmail = new SimpleEmailREG(rcpt, subj, msg).getMailBin();
      try{
         session.setProvider(regRu);
      }
      catch(NoSuchProviderException e){
         ESender.messageToUser.out("EChecker_114", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         ESender.messageToUser.errorAlert(ESender.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      try{
         simpleEmail.send();
      }
      catch(EmailException e){
         ESender.messageToUser.out("EChecker_149", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         ESender.messageToUser.errorAlert("EChecker", e.getMessage(), Arrays.toString(e.getStackTrace()));
         return false;
      }
      return true;
   }

   /**
    * Отправить почту. Аутентификатор {@link VachokMailer.AuthForChess}
    * {@link EmailsProviders#chessMail()}
    * {@link VachokMailer#chessMail()}
    * {@link Properties} javaid для метода - {@code mailP}
    *
    * @param rcpt {@link #rcpt}
    * @param subj {@link #subj}
    * @param msg  {@link #msg}
    */
   public static void sendM(List<String> rcpt, String subj, String msg) {
      InitProperties initPr = new DbProperties("mailP");
      Properties mailP = initPr.getProps();
      Authenticator authenticator = new VachokMailer.AuthForChess();
      (( VachokMailer.AuthForChess ) authenticator).getPasswordAuthentication();
      Session session = Session.getInstance(mailP, authenticator);
      Properties cur = session.getProperties();
      initPr = new FileProps(ESender.SOURCE_CLASS);
      initPr.setProps(cur);
      Provider regRu = ESender.p.chessMail();
      Email simpleEmail = new SimpleEmailREG(rcpt, subj, msg).getMailBin();
      try{
         session.setProvider(regRu);
      }
      catch(NoSuchProviderException e){
         ESender.messageToUser.out("EChecker_114", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         ESender.messageToUser.errorAlert(ESender.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      try{
         simpleEmail.send();
      }
      catch(EmailException e){
         ESender.messageToUser.out("EChecker_149", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         ESender.messageToUser.errorAlert("EChecker", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   /**
    * 1. Запуск.
    * 1.1 {@link #sendMail()}
    */
   @Override
   public void run() {
      sendMail();
   }

   /**
    * {@link #ESender(List, String, String)}
    *
    * @return true = отправлено
    */
   @Override
   protected Boolean call() {
      return sendMail();
   }
}