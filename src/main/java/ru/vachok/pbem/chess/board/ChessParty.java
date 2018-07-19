package ru.vachok.pbem.chess.board;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ChessParty implements ChessBoard {

   private static final String SOURCE_CLASS = ChessParty.class.getSimpleName();

   private static ChessParty ourInstance = new ChessParty();

   private static MessageToUser messageToUser = new MessageCons();

   private long partyID;

   private ChessParty() {
   }

   @Override
   public void setPartyID(long partyID) {
      this.partyID = partyID;
   }

   /**
    * @return текущее положение на доске. ID ячейки - цена ячейки.
    */
   @Override
   public Map<Integer, String> currentBoardPositions() {
      Map<Integer, String> currentPositions = new ConcurrentHashMap<>();
      ResultSet r = ChessParty.getRS("select * from chessboard" + partyID);
      try{
         while(r.next()) currentPositions.put(r.getInt("idchessboard"), r.getString("standing"));
      }
      catch(SQLException e){ChessParty.messageToUser.errorAlert(ChessParty.SOURCE_CLASS, "err id 43", e.getMessage());}
      return currentPositions;
   }

   /**
    * @param c координата буквенная
    * @param i координата цифровая
    * @return ID ячейки
    */
   @Override
   public int getCellID(Character c, Integer i) {
      ResultSet resultSet = ChessParty.getRS("select * from chessboard" + partyID + " where cellInt = " + i);
      try{
         while(resultSet.next()){
            if(c.equals(resultSet.getString("cellChar").charAt(0))) return resultSet.getInt("idchessboard");
         }
      }
      catch(SQLException e){ChessParty.messageToUser.errorAlert(ChessParty.SOURCE_CLASS, "err id 61", e.getMessage());}
      throw new UnsupportedOperationException("NOT COMPLIANT " + ChessParty.SOURCE_CLASS + " ID 62");
   }

   private static ResultSet getRS(String sql) {
      DataConnectTo dataConnectTo = new RegRuMysql();
      try(Connection connection = dataConnectTo.getDataSource().getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          ResultSet resultSet = preparedStatement.executeQuery();){
         return resultSet;
      }
      catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, "err id 31", e.getMessage());}
      throw new UnsupportedOperationException("Non Compliant!");
   }

   public static ChessParty getInstance(long partyID) {
      return ourInstance;
   }
}
