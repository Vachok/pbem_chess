package ru.vachok.pbem.chess.emails;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.mysqlandprops.RegRuMysql;
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
 * Проверка почтового ящика.
 *
 * @see EMailsChess
 * @since 20.06.2018 (11:43)
 */
public class EChecker implements Runnable, Callable<Map<String, String>> {

    /**
     * Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = EChecker.class.getSimpleName();

    private static MessageToUser messageToUser = new MessageCons();

    private static DataConnectTo dataConnectTo = new RegRuMysql();

    private static List<String> rcpt = new ArrayList<>();

    private Map<String, String> mailS = new ConcurrentHashMap<>();

   private String subj;

   public EChecker(String subj) {
      this.subj = subj;
   }

    @Override
    public Map<String, String> call() {
        Map<String, String> cM = letParty();
        String s = cM.toString();
        EChecker.messageToUser.infoNoTitles(Utilit.toUTF(s));
       if(subj.toLowerCase().contains("gettome:")){
            Pattern p = Pattern.compile("^(gettome:).*[,]");
            Matcher m = p.matcher(s);
            while(m.find()) s = p.toString();
            EChecker.messageToUser.info(EChecker.SOURCE_CLASS, Utilit.toUTF("Строка для передачи в парсер:\n"), s + "\n");
            this.mailS = letParty();
        }

       if(subj.toLowerCase().contains("play")){
          BiConsumer<String, String> biConsumer = (x, y) -> {
             messageToUser.info(SOURCE_CLASS, x, y);
          };
          cM.forEach(biConsumer);
       }
        return mailS;
    }

    /**
     * Создаёт {@link Map} заголовки - base64 mail
     */
    private Map<String, String> letParty() {
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
            notifyAll();
        }
        notifyAll();
        return mailS;
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
        EChecker.rcpt.add("143500@gmail.com");
        Map<String, String> map = letParty();
        String s = map.keySet().toString();
        if(s.toLowerCase().contains("gettome:")) getUrlAddress(s);
       if(subj.toLowerCase().contains("play")) messageToUser.infoNoTitles(map.toString());

    }

    private void getUrlAddress(String mesgInString) {
        String[] sS = mesgInString.split("gettome:");
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
                mesgInString = new String(reads, "UTF-8");
                EChecker.messageToUser.infoNoTitles(mesgInString);
            }
        }
        catch(IOException e){
            new ESender(EChecker.rcpt, new Date().toString(), e.getMessage() + "\n" + mesgInString);
            EChecker.messageToUser.out("EChecker_141", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nEChecker.run, and ID (lineNum) is 129").getBytes());
        }
        new ESender(EChecker.rcpt, new Date().toString(), "" + "\n" + mesgInString).sendMail(url);
        sendResultToDatabase(mesgInString);
    }

    private void sendResultToDatabase(String rez) {
        String sql = "insert into rez (rez, pc) values (?,?)";
        try(Connection connection = EChecker.dataConnectTo.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, rez);
            ps.setString(2, EChecker.SOURCE_CLASS);
            ps.executeUpdate();
        }
        catch(SQLException e){
            EChecker.messageToUser.out("EChecker_143", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nEChecker.sendResultToDatabase, and ID (lineNum) is 143").getBytes());
        }

    }
}