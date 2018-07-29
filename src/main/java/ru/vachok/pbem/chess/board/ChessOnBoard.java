package ru.vachok.pbem.chess.board;


import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 Шахматная доска.
 <p>
 Взаимодействие.

 @since 27.06.2018 (7:41) */
public interface ChessOnBoard {

   /**
    @return текущее положение на доске.
    */
   default Map<Integer, String> getCurrentBoardPositions(String boardName) {
      Map<Integer, String> curPositions = new ConcurrentHashMap<>();
      DataConnectTo dataConnectTo = new RegRuMysql();
      Connection dfCon = dataConnectTo.getDefaultConnection("u0466446_chess");
      try(PreparedStatement p = dfCon.prepareStatement(String.format("select * from %s", boardName))){
         try(ResultSet rs = p.executeQuery()){
            while(rs.next()){
               String s = rs.getString("cellChar") + rs.getInt("cellInt") + ":" + rs.getString("standing");
               int cellId = rs.getInt("idchessboard");
               curPositions.put(cellId, s);
            }
         }
      }
      catch(SQLException e){
         Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
      }
      return curPositions;
   }
}
