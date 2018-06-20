package ru.vachok.pbem.chess.emails;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Provider;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static javax.mail.Provider.Type.TRANSPORT;


/**
 * Проверка почтового ящика.
 *
 * @since 20.06.2018 (11:43)
 */
public class EChecker implements Callable<String> {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = EChecker.class.getSimpleName();

   private static final Logger LOGGER = Logger.getLogger(SOURCE_CLASS);

   private static InitProperties initProperties = new DbProperties(SOURCE_CLASS);

   private static Properties properties = initProperties.getProps();

   private static MessageToUser messageToUser = new MessageCons();

   /**
    * Предполагается запускать как Daemon.
    *
    * @return пока ничего
    */
   @Override
   public String call() {
      throw new UnsupportedOperationException("not now");
   }

   /**
    * Проверка доступности он-лайн.
    * <p>
    * 1.<a href="imap.yandex.com" target=_blank>IMAP Yandex</a>
    * <p>
    * 2.{@code a161.eatmeat.ru}
    *
    * @throws IOException кидает {@link InetAddress#isReachable(int)}
    */
   public void chkServers() throws IOException {
      InetAddress inetAddressCHK = InetAddress.getByName("mail.chess.vachok.ru");
      String s = " is now : \n";
      messageToUser.infoNoTitles(inetAddressCHK.toString() + s + inetAddressCHK.isReachable(ConstantsFor.TIMEOUT_1000));
      inetAddressCHK = InetAddress.getByName("imap.yandex.com");
      messageToUser.infoNoTitles(inetAddressCHK.toString() + s + inetAddressCHK.isReachable(ConstantsFor.TIMEOUT_1000));
      inetAddressCHK = InetAddress.getByName("a161.eatmeat.ru");
      messageToUser.infoNoTitles(inetAddressCHK.toString() + s + inetAddressCHK.isReachable(ConstantsFor.TIMEOUT_1000));
   }

   @Deprecated (since = "20.06.2018 (23:12)", forRemoval = true)
   public void senderMail() throws EmailException {
      messageToUser.infoNoTitles(SOURCE_CLASS);
      boolean ok = new Utilit().isA161OK();
      if(properties.size()==0 || !ok){
         messageToUser.errorAlert("A161", "is", ConstantsFor.toUTF("В ЁБАНОМ АУТЕ!"));

         initProperties.getProps();
      }

      initProperties.setProps(properties);
      MultiPartEmail email = new MultiPartEmail();
      String pass = properties.getProperty("pass");
      String fromA = "chess@vachok.ru";
      email.setStartTLSEnabled(true);
      email.setAuthentication(fromA, pass);
      email.setHostName("imap.yandex.com");
      email.setSslSmtpPort(String.valueOf(465));
      email.setMsg(LocalDateTime.now() + "");
      email.setFrom(fromA);
      email.addTo("143500@gmail.com");
      email.setSSLCheckServerIdentity(true);
      email.setStartTLSRequired(true);
      String s = email.toString();
      messageToUser.infoNoTitles(s);
      email.send();
   }

   /**
    * Посылает почту
    *
    * @throws EmailException кидает {@link MultiPartEmail#setMsg(java.lang.String)}
    */
   public void sendMail() throws Exception {
      Authenticator authenticator = new DSRes();
      Session session = Session.getInstance(properties, authenticator);
      Provider provider = new Provider(TRANSPORT, "smtps", "com.sun.mail.smtp.SMTPTransport", "Oracle", null);
      session.setProvider(provider);
      String userName = "bot@chess.vachok.ru";
      InternetAddress fromMe = new InternetAddress(userName);
      SimpleEmail simpleEmail = new SimpleEmail();
      String aHostName = "mail.chess.vachok.ru";
      PasswordAuthentication passwordAuthentication = (( DSRes ) authenticator).getPasswordAuthentication();
      String pass = "S15cQFO8kk50FKj";
      Collection<InternetAddress> fromMeC = new ArrayList<>();
      fromMeC.add(fromMe);
      simpleEmail.addTo("olga-barchi@yandex.ru");
      simpleEmail.setSSLOnConnect(true);
      simpleEmail.setAuthentication(passwordAuthentication.getUserName(), passwordAuthentication.getPassword());
      simpleEmail.setSentDate(new Date());
      simpleEmail.setDebug(true);

      byte[] bytes = jStr().getBytes();
      StringBuilder stringBuilder = new StringBuilder();
      //noinspection ForLoopReplaceableByForEach
      for(int j = 0; j < bytes.length; j++){
         int r = new Random().nextInt(bytes.length);
         stringBuilder.append(( char ) bytes[r]);
      }
      simpleEmail.setMsg(ConstantsFor.toUTF("http://chessplanet.ru/pages/game-zone/rules/kratkie-pravila-igry-v-shahmaty\nГЫГЫГЫ\n" + jStr() + "\n" + stringBuilder.toString()));
      simpleEmail.addTo("143500@gmail.com");
      simpleEmail.setReplyTo(fromMeC);
      simpleEmail.setHostName(aHostName);
      simpleEmail.setSubject(ConstantsFor.toUTF("Я БОТ, и я пока не общителен, но ........"));
      Session mailSession = simpleEmail.getMailSession();
      boolean debug = mailSession.getDebug();
      PrintStream debugOut = mailSession.getDebugOut();
      if(debug) debugOut.println();
      String protocol = provider.getProtocol();
      messageToUser.infoNoTitles(protocol);

      simpleEmail.setFrom(fromMe.getAddress());
      simpleEmail.setAuthentication(userName, pass);
      simpleEmail.send();
   }

   /**
    * <i>Это БРЭД</i>
    *
    * @return просто строка бреда.
    * @see #sendMail()
    */
   private String jStr() {
      int i = LocalDateTime.now().compareTo(LocalDateTime.MAX);
      long n = (new Calendar.Builder().setDate(2019, 1, 1).build().getTimeInMillis());
      n = Math.abs(n);
      n = System.currentTimeMillis() - n;
      n = TimeUnit.MILLISECONDS.toMinutes(n);
      i = Math.abs(i);
      String s = ConstantsFor.toUTF("Я смогу рабоать ещё ") + i + ConstantsFor.toUTF(" лет, детка! А Новый год через ") + n + ConstantsFor.toUTF(" минут...");
      messageToUser.infoNoTitles(s);
      return s;
   }
}