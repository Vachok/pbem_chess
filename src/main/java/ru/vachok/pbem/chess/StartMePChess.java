package ru.vachok.pbem.chess;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;


/**
 <b>Стартовый</b>
 <p>
 <a href="https://scans.gradle.com/s/xkqf7fgmvie3q" target=_blank>Gradle SCAN</a>
 
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
        String helloThere = new Utilit().checkTime();
        messageToUser.info(SOURCE_CLASS, "main ID 16", ConstantsFor.toUTF(helloThere));
    }
}