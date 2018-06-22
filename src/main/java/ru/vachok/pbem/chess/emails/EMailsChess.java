package ru.vachok.pbem.chess.emails;


import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Работа с эл. почтой.
 <p>
 <i>В рамках этой игры.</i>
 *
 * @since 20.06.2018 (14:38)
 */
public interface EMailsChess {

   /**Отправить сообщение электронной почты.
    *
    * @param recep адреса электронной почты <b>To</b>.
    * @param msg сообщение, для отправки.
    * @return статус. true = удача.
    */
   boolean sendMail(List<String> recep, String subj, String msg);

   /**Мапа вида
    <p>
    {@code ЗАГОЛОВОК - СООБЩЕНИЕ}
    * @return сообщения построчно
    */
   ConcurrentHashMap<String, String> chkMails();
}
