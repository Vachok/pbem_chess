package ru.vachok.pbem.chess;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;


/**
 <b>Стартовый</b>
 <p>
 <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>
 
 @since 19.06.2018 (21:29) */
public class StartMePChess {
    
    /**
     Class Simple Name
     */
    private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();
    
    /**
     {@link MessageToUser}
     */
    private static MessageToUser messageToUser = new MessageCons();
    
    /**
     @param args null
     */
    public static void main(String[] args) {
        String helloThere = ConstantsFor.toUTF(new Utilit().checkTime());
        messageToUser.info(SOURCE_CLASS, "main ID 16", helloThere);
    }
}