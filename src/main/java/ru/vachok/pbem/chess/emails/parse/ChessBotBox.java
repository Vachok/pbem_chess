package ru.vachok.pbem.chess.emails.parse;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DbProperties;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;

import javax.mail.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Работа с почтой ChessOnBoard.
 *
 * @since 17.07.2018 (20:11)
 */
public class ChessBotBox implements ParseMSG {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = ChessBotBox.class.getSimpleName();

   /**
    * chessBot
    * {@link DbProperties}
    */
   private final InitProperties initMailProperties = new DbProperties("chessBot");

   /**
    * {@link DbProperties} SimpleEmailBinchess
    */
   private final InitProperties initAUTHProperties = new DbProperties("SimpleEmailBinchess");

   /**
    * {@link MessageCons}
    */
   private final MessageToUser messageToUser = new MessageCons();

   private DecoderEnc decoderEnc = new UTF8();

   /**
    * @return {@link Message} массив сообщений из ящика.
    */
   @Override
   public Folder mailboxFolder(String folderName) {
      Session pop3sSession = Session.getInstance(initMailProperties.getProps());
      Properties authProperties = initAUTHProperties.getProps();
      String host = authProperties.getProperty("host");
      String user = authProperties.getProperty("userName");
      String password = authProperties.getProperty("pass");
      try{
         if(folderName.isEmpty()) folderName = "Inbox";
         Store store = pop3sSession.getStore("pop3s");
         store.connect(host, user, password);
         return store.getFolder(folderName);
      }
      catch(Exception e){
         messageToUser.out("ChessBotBox_39", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), "ChessBotBox.checkMessages_39");
      }
      decoderEnc = new UTF8();
      throw new NullPointerException(decoderEnc.toAnotherEnc("ЖЕСТиШЬ, ПАЦА!!"));
   }

   /**
    * @param toEmail {@link Message}, для отсылки SMTP.
    */
   @Override
   public void sendMessage(Message toEmail) {
      throw ConstantsFor.NOT_READY;
   }

   /**
    * Очистка ящика
    */
   @Override
   public void cleanMailbox() {
      throw ConstantsFor.NOT_READY;
   }

   @Override
   public FetchProfile fetchProfile() {
      FetchProfile fetchProfile = new FetchProfile();
      FetchProfile.Item[] items = fetchProfile.getItems();
      messageToUser.info("FETCHING...", Arrays.toString(fetchProfile.getHeaderNames()).replaceAll(", ", "\n"), Arrays.toString(items).replaceAll(", ", "\n"));
      return fetchProfile;
   }

   private Map<Date, String[]> asIsMetaData(Folder mbFolder) {
      Map<Date, String[]> metDataOfMSG = new ConcurrentHashMap<>();
      Message[] messages = null;
      try{ messages = mbFolder.getMessages();}
      catch(MessagingException e){
         messageToUser.out("ChessBotBox_71", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), "ChessBotBox.asIsMetaData_71");
      }
      for(Message message : messages){
         String[] metData;
         Date receivedDate;
         try{
            receivedDate = message.getReceivedDate();
            metData = new String[]{message.getContentType(), message.getDescription(), message.getDisposition()};
            metDataOfMSG.put(receivedDate, metData);
            messageToUser.info(SOURCE_CLASS, String.valueOf(receivedDate), Arrays.toString(metData));
         }
         catch(MessagingException e){ messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      }
      return metDataOfMSG;
   }
}