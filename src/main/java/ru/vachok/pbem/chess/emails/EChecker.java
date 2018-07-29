package ru.vachok.pbem.chess.emails;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.mysqlandprops.props.DbProperties;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.StartScheduled;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;

import javax.mail.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 Проверка почтового ящика.

 @see EMailsChess
 @since 20.06.2018 (11:43)
 @deprecated  */
@Deprecated (since = "17.07.2018 (20:19)")
public class EChecker implements Runnable, Callable<Map<String, String>> {

   /**
    Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = EChecker.class.getSimpleName();

   /**
    {@link MessageCons}
    */
   private static final MessageToUser messageToUser = new MessageCons();

   /**
    {@link RegRuMysql}
    */
   private static final DataConnectTo dataConnectTo = new RegRuMysql();

   /**
    Адреса получателей
    {@link #run()}
    */
   private static final List<String> rcpt = new ArrayList<>();

   /**
    Сообщения из ящика
    {@link #getPOP3MessagesMap()}
    */
   private Map<String, String> mailS = new ConcurrentHashMap<>();

   /**
    Тема сообщения
    */
   private final String subj;

   /**
    {@link #subj}

    @param subj {@link StartScheduled#checkPeriodically()}
    */
   public EChecker(String subj) {
      this.subj = subj;
   }

   /**
    Вызов проверки ящика. {@link StartScheduled#checkPeriodically()}

    @return {@link #getPOP3MessagesMap()}
    */
   @Override
   public Map<String, String> call() {
      Map<String, String> cM = getPOP3MessagesMap();
      String s = cM.toString();
      EChecker.messageToUser.infoNoTitles(Utilit.toUTF(s));
      if(subj.toLowerCase().contains(ConstantsFor.GETTOME)){
         Pattern p = Pattern.compile("^(gettome:).*[,]");
         Matcher m = p.matcher(s);
         while(m.find()) s = p.toString();
         EChecker.messageToUser.info(EChecker.SOURCE_CLASS, Utilit.toUTF("Строка для передачи в парсер:\n"), s + "\n");
         this.mailS = getPOP3MessagesMap();
      }

      if(subj.toLowerCase().contains("play")){
         BiConsumer<String, String> biConsumer = (x, y) -> messageToUser.info(SOURCE_CLASS, x, y);
         cM.forEach(biConsumer);
      }
      return mailS;
   }

   /**
    {@link #call()} ; {@link #run()}
    Получает сообщения из REG

    @return {@link Map} с сообщениями на сервере.
    */
   private Map<String, String> getPOP3MessagesMap() {
      InitProperties initProperties = new DbProperties("mailP");
      Properties mailP = initProperties.getProps();
      Properties authP = new DbProperties("SimpleEmailBinchess").getProps();
      Session chkSess = Session.getDefaultInstance(mailP);
      String host = mailP.getProperty("host");
      String user = authP.getProperty("userName");
      String password = authP.getProperty("pass");
      mailS = new ConcurrentHashMap<>();
      try{
         Store store = chkSess.getStore("pop3s");
         store.connect(host, user, password);
         Folder inBox = store.getFolder("Inbox");
         inBox.open(Folder.READ_ONLY);
         Message[] mailSMessages = inBox.getMessages();

         for(Message mailSMessage : mailSMessages){
            File file = new File("mes\\" + mailSMessage.getMessageNumber() + ".eem");
            InputStream inputStreamM = mailSMessage.getInputStream();
            byte[] bytes = inputStreamM.readAllBytes();
            String msg = LocalDateTime.now() + "\n" + mailSMessage.getSentDate().toString() + "\nFrom STREAM-bytes is: " + bytes.length + "\n" + new String(bytes);
            String key = "Message number " + mailSMessage.getMessageNumber() + "_" + System.currentTimeMillis() + ".\n\n" + "SUBJECT : " + mailSMessage.getSubject() + ";";
            mailS.put(key, msg);
            FileUtils.writeStringToFile(file, key + "\n MESSAGE: " + msg, "UTF-8");
         }

      }
      catch(IOException | NoSuchElementException | MessagingException e){
         EChecker.messageToUser.out("EChecker_116", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         EChecker.messageToUser.errorAlert("EChecker", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return mailS;
   }

   /**
    When an object implementing interface <code>Runnable</code> is used
    to create a thread, starting the thread causes the object'GETTOME
    <code>run</code> method to be called in that separately executing
    thread.
    <p>
    The general contract of the method <code>run</code> is that it may
    take any action whatsoever.

    @see Thread#run()
    */
   @Override
   public void run() {
      EChecker.rcpt.add("143500@gmail.com");
      Map<String, String> map = getPOP3MessagesMap();
      String s = map.keySet().toString();
      if(s.toLowerCase().contains(ConstantsFor.GETTOME)) getUrlAddress(s);
      if(subj.toLowerCase().contains("play")) messageToUser.infoNoTitles(map.toString());

   }

   /**
    {@link #run()}
    Парсит {@link ConstantsFor#GETTOME} строку.
    {@link #sendResultToDatabase(String)}

    @param getToMeSting строка из почтового сообщения.
    @see ESender#sendURL(URL)
    */
   private void getUrlAddress(String getToMeSting) {
      String[] sS = getToMeSting.split(ConstantsFor.GETTOME);
      URL url = null;
      StringBuilder sb = new StringBuilder();
      char[] chars = sS[1].toCharArray();
      for(int i = 0; i < 30; i++){
         Character c = chars[i];
         int i1 = c.toString().compareTo("/");
         if(i1!=0) sb.append(chars[i]);
      }
      try{
         url = new URL(sb.toString());
         try(InputStream inputStream = url.openStream()){
            byte[] reads = inputStream.readAllBytes();
            getToMeSting = new String(reads, "UTF-8");
            EChecker.messageToUser.infoNoTitles(getToMeSting);
         }
      }
      catch(IOException e){
         new ESender(EChecker.rcpt, new Date().toString(), e.getMessage() + "\n" + getToMeSting);
         EChecker.messageToUser.out("EChecker_141", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nEChecker.run, and ID (lineNum) is 129").getBytes());
      }
      new ESender(EChecker.rcpt, new Date().toString(), "" + "\n" + getToMeSting).sendURL(url);
      sendResultToDatabase(getToMeSting);
   }

   /**
    Отправка результатов парсинга в БД

    @param urlParseResult {@link #getUrlAddress(String)}
    @see EChecker#dataConnectTo
    */
   private void sendResultToDatabase(String urlParseResult) {
      String sql = "insert into rez (rez, pc) values (?,?)";
      try(Connection connection = EChecker.dataConnectTo.getDataSource().getConnection();
          PreparedStatement ps = connection.prepareStatement(sql)){
         ps.setString(1, urlParseResult);
         ps.setString(2, EChecker.SOURCE_CLASS);
         ps.executeUpdate();
      }
      catch(SQLException e){
         EChecker.messageToUser.out("EChecker_143", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nEChecker.sendResultToDatabase, and ID (lineNum) is 143").getBytes());
      }

   }
}