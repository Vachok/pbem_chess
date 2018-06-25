package ru.vachok.pbem.chess.emails;


import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.utilitar.Utilit;

import javax.mail.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Проверка почтового ящика.
 *
 * @see EMailsChess
 * @since 20.06.2018 (11:43)
 */
public class EChecker implements Runnable {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = EChecker.class.getSimpleName();

   private static EmailsProviders p = new VachokMailer();

   private static MessageToUser messageToUser = new MessageCons();

   private Map<String, String> mailS = new ConcurrentHashMap<>();


   /**
    * Отправка сообщения электронной почты.
    *
    * @param rcpt email адреса.
    * @param subj тема сообщения.
    * @param msg  сообщение, для отправки.
    * @return true = ok.
    */
   public boolean sendMail(List<String> rcpt, String subj, String msg) {
      InitProperties initPr = new DbProperties("mailP");
      Properties mailP = initPr.getProps();
      Authenticator authenticator = new VachokMailer.AuthForChess();
      ((VachokMailer.AuthForChess) authenticator).getPasswordAuthentication();
      Session session = Session.getInstance(mailP, authenticator);
      Properties cur = session.getProperties();
      initPr = new FileProps(SOURCE_CLASS);
      initPr.setProps(cur);
      Provider regRu = p.chessMail();
      Email simpleEmail = new SimpleEmailREG(rcpt, subj, msg).getMailBin();
      try {
         session.setProvider(regRu);
      } catch (NoSuchProviderException e) {
         messageToUser.out("EChecker_114", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      try {
         simpleEmail.send();
      } catch (EmailException e) {
         messageToUser.out("EChecker_149", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("EChecker", e.getMessage(), Arrays.toString(e.getStackTrace()));
         return false;
      }
      return true;
   }

   /**
    * Создаёт {@link Map} заголовки - base64 mail
    */
   private synchronized Map<String, String> letParty() {
      InitProperties initProperties = new DbProperties("mailP");
      Properties mailP = initProperties.getProps();
      Properties authP = new DbProperties("SimpleEmailBinchess").getProps();
      Session chkSess = Session.getDefaultInstance(mailP);
      String host = mailP.getProperty("host");
      String user = authP.getProperty("userName");
      String password = authP.getProperty("pass");
      mailS = new ConcurrentHashMap<>();
      mailS.put("Самая первая запись", "Encoding = no");
      try {
         Store store = chkSess.getStore("pop3s");
         store.connect(host, user, password);
         Folder inBox = store.getFolder("Inbox");
         inBox.open(Folder.READ_ONLY);
         Message[] mailSMessages = inBox.getMessages();
         mailS.put("Вторая", Utilit.toUTF("UTF-8"));
         for (Message mailSMessage : mailSMessages) {
            File file = new File("mes\\" + mailSMessage.getMessageNumber() + ".eem");
            InputStream inputStreamM = mailSMessage.getInputStream();
            byte[] bytes = inputStreamM.readAllBytes();
            String msg = LocalDateTime.now() + "\n" + mailSMessage.getSentDate().toString() + "\nFrom STREAM-bytes is: " + bytes.length + "\n" + new String(bytes);
            String key = "Message number " + mailSMessage.getMessageNumber() + "_" + System.currentTimeMillis() + ".\n\n" + "SUBJECT : " + mailSMessage.getSubject() + ";";
            mailS.put(key, msg);
            FileUtils.writeStringToFile(file, key + "\n MESSAGE: " + msg, "UTF-8");
         }
         mailS.put(Utilit.toW1251("Третья..."), "ENC 1251");
         mailS.put("TOTAL EMAILS IS ", mailS.size() + " with 3 handJOBs");
      } catch (IOException | NoSuchElementException | MessagingException e) {
         messageToUser.out("EChecker_116", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("EChecker", e.getMessage(), Arrays.toString(e.getStackTrace()));
         notifyAll();
      }
      notifyAll();
      return mailS;
   }

   @Override
   public synchronized void run() {
      String s = this.toString();
      if (s.toLowerCase().contains("gettome:")) {
         Pattern p = Pattern.compile("^(gettome:).*[,]");
         Matcher m = p.matcher(s);
         while (m.find()) s = p.toString();
         messageToUser.info(SOURCE_CLASS, Utilit.toUTF("Строка для передачи в парсер:\n"), s + "\n");
         this.mailS = letParty();
      }
   }
}