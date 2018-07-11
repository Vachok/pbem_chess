package ru.vachok.pbem.chess.board;

import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;


public class PosinionNow implements Callable<Map<Integer, String>> {

    private static final String SOURCE_CLASS = PosinionNow.class.getSimpleName();

    private static MessageToUser messageToUser = new MessageCons();

    private static PosinionNow ourInstance = new PosinionNow();

    private static final DataConnectTo DATA_CONNECT_TO = new RegRuMysql();

    public static PosinionNow getInstance() {
        return ourInstance;
    }

    private PosinionNow() {

    }

    public void moveFig (String figMove){
        String[] mvFromTo =figMove.split("-");
        messageToUser.info("Moving. From - To: ", mvFromTo[0], mvFromTo[1]);

    }

    @Override
    public Map<Integer, String> call() {
        Map<Integer, String> bMap = new HashMap<>();
        String sql = "select * from chessboard";
        try(Connection c = DATA_CONNECT_TO.getDataSource().getConnection();
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet r = p.executeQuery()){
            while(r.next()){
                int idchessboard = r.getInt("idchessboard");
                String state = r.getString("cellChar") + "-" + r.getInt("cellInt") + ": " + r.getString("standing") + " = " + r.getInt("price");
                bMap.put(idchessboard, state);
            }
        }
        catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
        return bMap;
    }
}
