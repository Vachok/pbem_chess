package ru.vachok.pbem.chess.emails;



import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import javax.mail.Authenticator;


/**Аутентификация для <i>SMTP</i>-соединения.
 * @see EChecker
 * @since 20.06.2018 (16:22)
 */
class DSRes extends Authenticator {

   private static final MessageToUser messageToUser = new MessageCons();
   @Override
   protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
      messageToUser.infoNoTitles("YO");
      return new javax.mail.PasswordAuthentication("bot@chess.vachok.ru", "S15cQFO8kk50FKj");
   }
}