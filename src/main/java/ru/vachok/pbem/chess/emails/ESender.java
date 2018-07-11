package ru.vachok.pbem.chess.emails;


import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;

import javax.mail.Authenticator;
import javax.mail.NoSuchProviderException;
import javax.mail.Provider;
import javax.mail.Session;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @since 24.06.2018 (10:41)
 */
public class ESender implements Runnable {

    /**
     * Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = ESender.class.getSimpleName();
    private static final ExecutorService EXECUTOR_SENDER = Executors.newSingleThreadExecutor();
    private static MessageToUser messageToUser = new MessageCons();
    private static EmailsProviders p = new VachokMailer();

   private List<String> rcpt;

   private String subj;

   private String msg;

   private URL orderURL;

   public ESender(List<String> rcpt, String subj, String msg) {
        this.rcpt = rcpt;
        this.subj = subj;
        this.msg = msg;
    }

    /**
     * Отправка запрошенного URL
     *
     * @param orderURL запрос вида "get:адрес"
     * @throws UnsupportedEncodingException bytes2url
     */
    public void sendMail(URL orderURL) {
       subj = "GETTOME (URL4U" + LocalDateTime.now().toString() + ")";
        byte[] pageBytes = new byte[ConstantsFor.MEGABYTE];
       try(InputStream openStreamURL = orderURL.openStream()){
            pageBytes = openStreamURL.readAllBytes();
        } catch (IOException e) {
          ESender.messageToUser.out("ESender_50", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
          ESender.messageToUser.errorAlert("ESender", e.getMessage(), Arrays.toString(e.getStackTrace()));
        }

        //Ответы, действия
       String usrToString = Utilit.toUTF(pageBytes);
       this.msg = usrToString;
       sendMail();
    }

    /**
     * Отправка сообщения электронной почты.
     *
     * @return true = ok.
     */
    private boolean sendMail() {
        InitProperties initPr = new DbProperties("mailP");
        Properties mailP = initPr.getProps();
        Authenticator authenticator = new VachokMailer.AuthForChess();
        ((VachokMailer.AuthForChess) authenticator).getPasswordAuthentication();
        Session session = Session.getInstance(mailP, authenticator);
        Properties cur = session.getProperties();
       initPr = new FileProps(ESender.SOURCE_CLASS);
        initPr.setProps(cur);
       Provider regRu = ESender.p.chessMail();
        Email simpleEmail = new SimpleEmailREG(rcpt, subj, msg).getMailBin();
        try {
            session.setProvider(regRu);
        } catch (NoSuchProviderException e) {
           ESender.messageToUser.out("EChecker_114", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
           ESender.messageToUser.errorAlert(ESender.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
        }
        try {
            simpleEmail.send();
        } catch (EmailException e) {
           ESender.messageToUser.out("EChecker_149", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
           ESender.messageToUser.errorAlert("EChecker", e.getMessage(), Arrays.toString(e.getStackTrace()));
            return false;
        }
        return true;
    }

    @Override
    public void run() {
       sendMail();
    }

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
}