package ru.vachok.pbem.chess.emails.parse;


import javax.mail.Message;


/**
 * Работа с полученными {@link Message} из почтового ящика.
 *
 * @since 17.07.2018 (20:05)
 */
public interface ParseMSG {


   /**
    * @return {@link Message} массив сообщений из ящика.
    */
   Message[] checkMessages();

   /**
    * @param toEmail {@link Message}, для отсылки SMTP.
    */
   void sendMessage(Message toEmail);

   /**
    * Очистка ящика
    */
   void cleanMailbox();
}
