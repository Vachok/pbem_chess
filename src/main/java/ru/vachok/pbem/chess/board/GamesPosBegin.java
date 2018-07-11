package ru.vachok.pbem.chess.board;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.board.figures.FigPrices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Позиции и ходы
 *
 * @since 27.06.20inte8 (7:46)
 */
public class GamesPosBegin implements Runnable {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = GamesPosBegin.class.getSimpleName();

   /**
    * "Рисунок" доски
    */
   private static final Map<Integer, String> BOARD_CELLS = new ConcurrentHashMap<>();

   private static MessageToUser messageToUser = new MessageCons();

   /**
    * {@link RegRuMysql}
    */
   private static DataConnectTo dataConnectTo = new RegRuMysql();

   @Override
   public void run() {
      main();
   }

   private static void main() {
      nBoardInDB();
      insFig("white");
      insFig("black");
   }

   /**
    * Чистит таблицу chessboard, для новой партии.
    */
   private static void nBoardInDB() {
      Collection<Character> characterCollection = new LinkedHashSet<>();
      for(Integer i = 1; i < 9; i++){
         characterCollection.add("aabcdefgh".charAt(i));
      }
      MysqlDataSource mysqlDataSource = dataConnectTo.getDataSource();
      mysqlDataSource.setCreateDatabaseIfNotExist(true);
      String sqlTr = "TRUNCATE chessboard";
      String sql = "insert into chessboard (cellChar, cellInt) values (?,?)";
      try(Connection connection = mysqlDataSource.getConnection();
          PreparedStatement preparedStatementT = connection.prepareStatement(sqlTr);
          PreparedStatement preparedStatement = connection.prepareStatement(sql)){
         preparedStatementT.executeUpdate();
         for(Character c : characterCollection){
            for(Integer i = 1; i < 9; i++){
               preparedStatement.setString(1, c.toString());
               preparedStatement.setInt(2, i);
               preparedStatement.executeUpdate();
            }
         }
      }
      catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      messageToUser.infoNoTitles(BOARD_CELLS.toString());
   }

   /**
    * Расставляет белые
    *
    * @param color
    */
   private static void insFig(String color) {
      int inte = 1;
      if(color.equalsIgnoreCase("black")) inte = 8;
      int idCell = boardCellGet("a".charAt(0), inte);
      String figure = color + "-left-rook";
      boardCellSet(figure, FigPrices.PRICE_ROOK, idCell);
      idCell = boardCellGet("b".charAt(0), inte);
      figure = color + "-left-knight";
      boardCellSet(figure, FigPrices.PRICE_KNIGHT, idCell);
      idCell = boardCellGet("c".charAt(0), inte);
      figure = color + "-left-bishop";
      boardCellSet(figure, FigPrices.PRICE_BISHOP, idCell);
      idCell = boardCellGet("d".charAt(0), inte);
      figure = "king";
      boardCellSet(figure, FigPrices.PRICE_KING, idCell);
      idCell = boardCellGet("e".charAt(0), inte);
      figure = "qween";
      boardCellSet(figure, FigPrices.PRICE_QUEEN, idCell);
      idCell = boardCellGet("f".charAt(0), inte);
      figure = color + "-right-bishop";
      boardCellSet(figure, FigPrices.PRICE_BISHOP, idCell);
      idCell = boardCellGet("g".charAt(0), inte);
      figure = color + "-right-knight";
      boardCellSet(figure, FigPrices.PRICE_KNIGHT, idCell);
      idCell = boardCellGet("h".charAt(0), inte);
      figure = color + "-right-rook";
      boardCellSet(figure, FigPrices.PRICE_ROOK, idCell);
      for(int i = 0; i < 8; i++){
         int inteP = 2;
         if(color.equalsIgnoreCase("black")) inteP = 7;
         idCell = boardCellGet("abcdefgh".charAt(i), inteP);
         figure = color + "-pawn";
         boardCellSet(figure, FigPrices.PRICE_PAWN, idCell);
      }
   }

   /**
    * Берём состояние клетки по координатам.
    *
    * @param cF адрес клетки. char
    * @param j  адрес клетки int
    */
   public static int boardCellGet(Character cF, Integer j) {
      String sql = "select * from chessboard";
      int id = 0;
      try(Connection connection = dataConnectTo.getDataSource().getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement(sql);
          ResultSet resultSet = preparedStatement.executeQuery()){
         while(resultSet.next()){
            Integer i = resultSet.getInt("cellInt");
            String cString = resultSet.getString("cellChar");
            Character c = cString.charAt(0);
            String standing = resultSet.getString("standing");
            int cellPrice = resultSet.getInt("price");
            id = resultSet.getInt("idchessboard");
            if(i.equals(j) & c.equals(cF)){
               BOARD_CELLS.put(id, (c + "-" + i));
               messageToUser.info("ID " + id + ") Cell Standing is - ", (c.toString() + "-" + i.toString()), standing + " pr. " + cellPrice);
               break;
            }
         }
      }
      catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      return id;
   }

   public static void boardCellSet(String figure, int figPrice, int idCell) {
      String sql = "update chessboard set standing = ?, price = ? where idchessboard = ?";
      try(Connection connection = dataConnectTo.getDataSource().getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement(sql)){
         preparedStatement.setString(1, figure);
         preparedStatement.setInt(2, figPrice);
         preparedStatement.setInt(3, idCell);
         preparedStatement.executeUpdate();
      }
      catch(SQLException e){messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      messageToUser.info("cell ", idCell + " set.", figure + " = " + figPrice);
   }

}