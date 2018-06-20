package ru.vachok.pbem.chess;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;


/**
 * <b>Стартовый</b>
 * <p>
 * <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>
 *
 * @since 19.06.2018 (21:29)
 */
class StartMePChess {
    
    /**
     Class Simple Name
     */
    private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();

   /**Общение с пользователем.
     {@link MessageToUser}
     */
    private static MessageToUser messageToUser = new MessageCons();

   /**
    * <b>Точка входа.</b>
    *
    * @param args null
    * @see MessageToUser сообщения для юзера.
    * @see Utilit#checkTime() Utilit#checkTime()
    */
   public static void main(String[] args) {
      String helloThere = ConstantsFor.toUTF(new Utilit().checkTime());
        messageToUser.info(SOURCE_CLASS, "main ID 16", helloThere);
    }
}