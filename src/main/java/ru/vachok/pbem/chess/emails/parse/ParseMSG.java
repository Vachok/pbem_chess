package ru.vachok.pbem.chess.emails.parse;


import javax.mail.FetchProfile;
import javax.mail.Folder;
import javax.mail.Message;


/**
 * Работа с полученными {@link Message} из почтового ящика.
 *
 * @since 17.07.2018 (20:05)
 */
public interface ParseMSG {

   /** Получить папку из ящика.
    * @param folderName имя папки. По-умолчанию - Inbox
    * @return папка.
    */
   Folder mailboxFolder(String folderName);

   /**
    * @param toEmail {@link Message}, для отсылки SMTP.
    */
   void sendMessage(Message toEmail);

   /**
    * Очистка ящика
    */
   void cleanMailbox();

   /**
    * @return {@link FetchProfile}
    */
   FetchProfile fetchProfile();
}
