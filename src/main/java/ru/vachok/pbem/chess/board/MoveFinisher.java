package ru.vachok.pbem.chess.board;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Arrays;
import java.util.List;


/**
 * @since 12.07.2018 (1:39)
 */
public class MoveFinisher implements Runnable, MoveFigures {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = MoveFinisher.class.getSimpleName();

   /**
    {@link MessageCons}
    */
   private static final MessageToUser messageToUser = new MessageCons();

   /**
    ID партии
    */
   private static long partyID;

   /**
    Статичное соединение с БД.
    */
   private static Connection c;

   private static Savepoint savepointINIT;

   private static final MoveStarter moveStarter = MoveStarter.getPositions(partyID);

   /**
    {@link List} адресов "кому".
    */
   private final List<String> rcpt;

   static {
      DataConnectTo dataConnectTo = new RegRuMysql();
      MysqlDataSource mysqlDataSource = dataConnectTo.getDataSource();
      try{
         Connection connection = c = mysqlDataSource.getConnection();
         savepointINIT = connection.setSavepoint();
      }
      catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
   }

   public MoveFinisher(List<String> rcpt, long partyID) {
      this.rcpt = rcpt;
      MoveFinisher.partyID = partyID;

   }

   @Override
   public void run() {
      chkMail();
   }

   @Override
   public void moveFigure() {
      throw ConstantsFor.NOT_READY;
   }

   private void resSavePoint() {
      try{
         c.releaseSavepoint(savepointINIT);
         c.close();
      }
      catch(SQLException e){
         messageToUser.out("PlayingChess_85", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), "MoveFinisher.resSavePoint_85");
      }
   }

   private void chkMail() {
      throw ConstantsFor.NOT_READY;
   }
}