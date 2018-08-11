package ru.vachok.pbem.chess.board;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.messenger.email.ESender;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static ru.vachok.pbem.chess.utilitar.ConstantsFor.RCPT;


public class MoveMover implements MoveFigures {

   private static final String SOURCE_CLASS = MoveMover.class.getSimpleName();

   private static final MoveMover ourInstance = new MoveMover();

   private static final MessageToUser messageToUser = new MessageCons();

   private long partyID;

   private String userTriedToMove;

   public Map<Integer, String> pos;

   private MoveMover() {

   }

   public MoveMover(long partyID, String userTriedToMove) {
      this.partyID = partyID;
      this.userTriedToMove = userTriedToMove;
   }

   public void setPartyID(long partyID) {
      this.partyID = partyID;
   }

   public void currentBoardPositions() {
      RCPT.add(ConstantsFor.MY_EMAIL);
      MessageToUser em = new ESender(RCPT);
      em.infoNoTitles(this.getClass().toGenericString());
   }

   public static MoveMover getInstance(long partyID, String userTriedToMove) {
      ourInstance.partyID = partyID;
      ourInstance.userTriedToMove = userTriedToMove;
      Map<Integer, String> positions = getPositions("select * from g_" + partyID + " where standing is not null");
      ourInstance.pos = positions;
      return ourInstance;
   }

   static Map<Integer, String> getPositions(String sql) {
      Map<Integer, String> currentPositions = new ConcurrentHashMap<>();
      DataConnectTo dataConnectTo = new RegRuMysql();
      try(Connection connection = dataConnectTo.getDefaultConnection("u0466446_chess");
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          ResultSet resultSet = preparedStatement.executeQuery();){
         while(resultSet.next()) currentPositions.put(resultSet.getInt("idchessboard"), resultSet.getString("standing"));
      }
      catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, "err id 31", e.getMessage());}
      throw new UnsupportedOperationException("Non Compliant!");
   }

   @Override
   public void moveFigure() {
      throw ConstantsFor.NOT_READY;
   }
}
