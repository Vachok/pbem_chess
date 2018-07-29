package ru.vachok.pbem.chess.board;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.messenger.email.ESender;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.FXApp;
import ru.vachok.pbem.chess.StartMePChess;
import ru.vachok.pbem.chess.board.figures.FigNamePrice;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.UserAns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import static ru.vachok.pbem.chess.board.figures.FigNamePrice.getKing;
import static ru.vachok.pbem.chess.board.figures.FigNamePrice.getQueen;
import static ru.vachok.pbem.chess.utilitar.ConstantsFor.MY_EMAIL;
import static ru.vachok.pbem.chess.utilitar.ConstantsFor.RCPT;


/**
 Позиции и ходы
 @since 27.06.2018 (7:46)
 */
public class PartyNewIDParty implements Runnable, ChessOnBoard {

   /**
    Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = PartyNewIDParty.class.getSimpleName();

   /**
    "Рисунок" доски
    */
   private static final Map<Integer, String> BOARD_CELLS = new ConcurrentHashMap<>();

   /**
    {@link System#currentTimeMillis()}
    */
   private static final Long NEW_PARTY_ID = System.currentTimeMillis();

   /**
    {@link #NEW_PARTY_ID} с префиксом {@code g_}
    */
   private static final String BOARD_NAME = "g_" + NEW_PARTY_ID;

   /**
    {@link MessageCons}
    */
   private static final MessageToUser messageToUser = new MessageCons();

   /**
    {@link RegRuMysql}
    */
   private static final DataConnectTo REG_RU_MYSQL = new RegRuMysql();

   /**
    * {@link RegRuMysql#getDefaultConnection(String)} БД - {@code u0466446_chess}
    */
   private static final Connection DEFAULT_CONNECTION = REG_RU_MYSQL.getDefaultConnection("u0466446_chess");

   /**
    {@link DBRegProperties}
    */
   private static final InitProperties DB_REG_PROPERTIES = new DBRegProperties(ConstantsFor.APP_NAME + SOURCE_CLASS);

   /**<b>Singletone</b>
    {@link StartMePChess}, {@link FXApp}

    @see UserAns#GET_LAST_PARTY
    @return new Instance
    */
   public static PartyNewIDParty getInst() {
      return new PartyNewIDParty();
   }

   /**
    Призавтно. Singletone
    */
   private PartyNewIDParty() {
   }

   /**
    1. Start.
    .1 {@link #nBoardInDB()}
    .2 {@link #insFig(String)}
    .3 {@link #insFig(String)}
    .4 {@link #setNewPartyIdtoDB()}
    */
   @Override
   public void run() {
      FigNamePrice.setPartyID(PartyNewIDParty.NEW_PARTY_ID);
      Properties props = DB_REG_PROPERTIES.getProps();
      props.setProperty("partyid", NEW_PARTY_ID.toString());
      new FileProps(SOURCE_CLASS).setProps(props);
      new DBRegProperties(ConstantsFor.APP_NAME + SOURCE_CLASS).setProps(props);
      nBoardInDB();
      insFig(ConstantsFor.BLACK);
      insFig("white");
      setNewPartyIdtoDB();
   }

   /**<b>Создаёт новую таблицу и новую партию</b>.
    <p>
    Таблица с именем {@link #BOARD_NAME} в БД <i>u0466446_chess</i>
    */
   private static void nBoardInDB() {
      REG_RU_MYSQL.getSavepoint(DEFAULT_CONNECTION);

      Collection<Character> characterCollection = new LinkedHashSet<>();
      for(Integer i = 1; i < 9; i++){
         characterCollection.add("aabcdefgh".charAt(i));
      }
      String sqlTr = String.format("CREATE TABLE %s (idchessboard int(11) NOT NULL AUTO_INCREMENT, cellChar varchar(1) NOT NULL, cellInt int(11) NOT NULL, standing varchar(100) DEFAULT NULL, price int(11) DEFAULT NULL, TimeSets datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, partyID varchar(100) DEFAULT ?, PRIMARY KEY (idchessboard), UNIQUE KEY idx_chessboard_cellChar_cellInt (cellChar,cellInt)) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8", BOARD_NAME);
      String sql = String.format("insert into %s (cellChar, cellInt) values (?,?)", BOARD_NAME);
      try(PreparedStatement preparedStatementT = DEFAULT_CONNECTION.prepareStatement(sqlTr)){
         preparedStatementT.setString(1, BOARD_NAME);
         preparedStatementT.executeUpdate();
      }
      catch(SQLException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }

      try(PreparedStatement preparedStatement = DEFAULT_CONNECTION.prepareStatement(sql)){
         for(Character c : characterCollection){
            for(Integer i = 1; i < 9; i++){
               preparedStatement.setString(1, c.toString());
               preparedStatement.setInt(2, i);
               preparedStatement.executeUpdate();
            }
         }
      }
      catch(SQLException e){
         REG_RU_MYSQL.setSavepoint(DEFAULT_CONNECTION);
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      messageToUser.infoNoTitles(BOARD_CELLS.toString());
   }

   /**<b>Отправка partyid в базу.</b>
    0. {@link #run()}
    @see Currents

    */
   private static void setNewPartyIdtoDB() {
      try(PreparedStatement p = DEFAULT_CONNECTION.prepareStatement("insert into chessid (partyid) values (?)")){
         p.setLong(1, NEW_PARTY_ID);
         p.executeUpdate();
      }
      catch(SQLException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      RCPT.add(MY_EMAIL);
      MessageToUser em = new ESender(RCPT);
      em.info("Play with me!", NEW_PARTY_ID + "", new Currents("g_"
            + NEW_PARTY_ID).getCurrentBoardPositions("white-queen") + "");
   }

   /**
    Расставляет фигуры
    {@link #boardCellGet(Character, Integer)}
    {@link #boardCellSet(String, int, int)}

    @param color какого цвета фигуру ставим
    */
   private static void insFig(String color) {
      long startSt = System.currentTimeMillis();
      int inte = 1;
      if(color.equalsIgnoreCase(ConstantsFor.BLACK)) inte = 8;
      int idCell = boardCellGet("a".charAt(0), inte);
      String figure = color + "-left-rook";
      boardCellSet(figure, FigNamePrice.PRICE_ROOK, idCell);
      idCell = boardCellGet("b".charAt(0), inte);
      figure = color + "-left-knight";
      boardCellSet(figure, FigNamePrice.PRICE_KNIGHT, idCell);
      idCell = boardCellGet("c".charAt(0), inte);
      figure = color + "-left-bishop";
      boardCellSet(figure, FigNamePrice.PRICE_BISHOP, idCell);
      idCell = boardCellGet("d".charAt(0), inte);
      figure = getKing(color);
      boardCellSet(figure, FigNamePrice.PRICE_KING, idCell);
      idCell = boardCellGet("e".charAt(0), inte);
      figure = getQueen(color);
      boardCellSet(figure, FigNamePrice.PRICE_QUEEN, idCell);
      idCell = boardCellGet("f".charAt(0), inte);
      figure = color + "-right-bishop";
      boardCellSet(figure, FigNamePrice.PRICE_BISHOP, idCell);
      idCell = boardCellGet("g".charAt(0), inte);
      figure = color + "-right-knight";
      boardCellSet(figure, FigNamePrice.PRICE_KNIGHT, idCell);
      idCell = boardCellGet("h".charAt(0), inte);
      figure = color + "-right-rook";
      boardCellSet(figure, FigNamePrice.PRICE_ROOK, idCell);
      for(int i = 0; i < 8; i++){
         int inteP = 2;
         if(color.equalsIgnoreCase(ConstantsFor.BLACK)) inteP = 7;
         idCell = boardCellGet("abcdefgh".charAt(i), inteP);
         figure = color + "-pawn";
         boardCellSet(figure, FigNamePrice.PRICE_PAWN, idCell);
      }
      messageToUser.info(SOURCE_CLASS, "time spend", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startSt) + " sec");
   }

   /**<b>Цифровой ID ячейки шахматрой доски.</b>
    <p>
    Как порядковый номер, при добавлении.
    @param cF буква-координата
    @param j  цифра-координата
    @return ID ячейки.
    */
   private static int boardCellGet(Character cF, Integer j) {
      String sql = String.format("select * from %s", BOARD_NAME);
      int id = 0;
      try(Connection con = REG_RU_MYSQL.getDefaultConnection("u0466446_chess");
          PreparedStatement preparedStatement = con.prepareStatement(sql);
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
      catch(SQLException e){
         REG_RU_MYSQL.setSavepoint(DEFAULT_CONNECTION);
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      return id;
   }

   /**<b>Setter</b>
    Для ячеек
    {@link #insFig(String)}

    @param figure   {@link FigNamePrice}
    @param figPrice {@link FigNamePrice}
    @param idCell   {@link }
    */
   private static void boardCellSet(String figure, int figPrice, int idCell) {
      String sql = String.format("update %s set standing = ?, price = ? where idchessboard = ?", BOARD_NAME);
      try(
            PreparedStatement preparedStatement = DEFAULT_CONNECTION.prepareStatement(sql)){
         preparedStatement.setString(1, figure);
         preparedStatement.setInt(2, figPrice);
         preparedStatement.setInt(3, idCell);
         preparedStatement.executeUpdate();
      }
      catch(SQLException e){

         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      messageToUser.info("cell ", idCell + " set.", figure + " = " + figPrice);
   }
}