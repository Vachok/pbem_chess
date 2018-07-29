package ru.vachok.pbem.chess.board;


import ru.vachok.pbem.chess.utilitar.ConstantsFor;


/**
 @since 22.07.2018 (17:49) */
public interface MoveFigures {

   void moveFigure();

   default void sendMV(long partyID, char fromChar, int fromInt, char toChar, int toInt) {
      /*

      DataConnectTo dataConnectTo = new RegRuMysql();
      Savepoint savepoint = dataConnectTo.getSavepoint();
      ChessOnBoard chessBoard = new MoveFinisher();
      Connection c = dataConnectTo.getDefaultConnection("u0466446_chess");
      String sql = "update chessboard" + partyID + " set cellChar = " + toChar + ", cellInt = " + toInt + "  where idchessboard = " + cellId + ";";
      try(PreparedStatement p = c.prepareStatement(sql)){

      }catch(SQLException e){
         System.out.println(e.getMessage());
      }

      try(PreparedStatement preparedStatement = c.prepareStatement(sql)){
         preparedStatement.executeUpdate();
      }
      catch(SQLException e){
         dataConnectTo.resSavePoint(savepoint);
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

*/
      throw ConstantsFor.NOT_READY;
   }
}
