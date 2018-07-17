package ru.vachok.pbem.chess.emails.parse;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Arrays;
import java.util.Properties;


/**
 * Работа с почтой Chess.
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
   private InitProperties initMailProperties = new DbProperties("chessBot");

   /**
    * {@link DbProperties} SimpleEmailBinchess
    */
   private InitProperties initAUTHProperties = new DbProperties("SimpleEmailBinchess");

   /**
    * {@link MessageCons}
    */
   private MessageToUser messageToUser = new MessageCons();

   /**
    * @return {@link Message} массив сообщений из ящика.
    */
   @Override
   public Message[] checkMessages() {
      Session pop3sSession = Session.getInstance(initMailProperties.getProps());
      Properties authProperties = initAUTHProperties.getProps();

      String host = authProperties.getProperty("host");
      String user = authProperties.getProperty("userName");
      String password = authProperties.getProperty("pass");
      try{
         Store store = pop3sSession.getStore("pop3s");
      }
      catch(Exception e){
         messageToUser.out("ChessBotBox_39", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), "ChessBotBox.checkMessages_39");
      }
      return null;
   }

   /**
    * @param toEmail {@link Message}, для отсылки SMTP.
    */
   @Override
   public void sendMessage(Message toEmail) {

   }

   /**
    * Очистка ящика
    */
   @Override
   public void cleanMailbox() {

   }
}