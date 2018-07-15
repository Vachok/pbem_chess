package ru.vachok.pbem.chess.emails;


import java.util.List;


/**
 * Работа с эл. почтой.
 * <p>
 * <i>В рамках этой игры.</i>
 *
 * @since 20.06.2018 (14:38)
 */
public interface EMailsChess {

   /**
    * Отправить сообщение электронной почты.
    *
    * @param rcpt адреса электронной почты <b>To</b>.
    * @param msg   сообщение, для отправки.
    * @param subj тема
    * @return статус. true = удача.
    */
   boolean sendMail(List<String> rcpt, String subj, String msg);

   String checkMail();
}
