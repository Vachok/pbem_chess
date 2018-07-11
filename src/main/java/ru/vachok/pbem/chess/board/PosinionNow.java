package ru.vachok.pbem.chess.board;

import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

public class PosinionNow {
    private static MessageToUser messageToUser = new MessageCons();
    private static PosinionNow ourInstance = new PosinionNow();

    public static PosinionNow getInstance() {
        return ourInstance;
    }

    private PosinionNow() {

    }
    public void moveFig (String figMove){
        String[] mvFromTo =figMove.split("-");
        messageToUser.info("Moving. From - To: ", mvFromTo[0], mvFromTo[1]);

    }
}
