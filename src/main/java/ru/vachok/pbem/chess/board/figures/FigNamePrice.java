package ru.vachok.pbem.chess.board.figures;


import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * "Цены" фигур
 *
 * @since 27.06.2018 (7:51)
 */
public enum FigNamePrice {
   /**
    * Ценность фигур
    */
   FIG_PRICES;

   /**
    * Цена фигуры Король {@link King}
    */
   public static final int PRICE_KING = 10000;

   /**
    * Цена фигуры Ферзь
    */
   public static final int PRICE_QUEEN = 9500;

   /**
    * Цена фигуры Ладья
    */
   public static final int PRICE_ROOK = 5000;

   /**
    * Цена фигуры Слон
    */
   public static final int PRICE_BISHOP = 3500;

   /**
    * Цена фигуры Конь
    */
   public static final int PRICE_KNIGHT = 3000;

   /**
    * Цена фигуры Пешка
    */
   public static final int PRICE_PAWN = 1000;

   private static final String SOURCE_CLASS = FigNamePrice.class.getSimpleName();

   private static long partyID;

   private static final DataConnectTo dataConnectTo = new RegRuMysql();

   public static void setPartyID(long partyID) {
      FigNamePrice.partyID = partyID;
   }

   public static String getKing(String color) {
      return color + "-king";
   }

   public static String getQueen(String color) {
      return color + "-queen";
   }

   public String getPawn(String color) {
      return color + "-pawn";
   }

   public String getRook(String color, String startPos) {
      return color + "-" + startPos + "-rook";
   }

   public String getKnight(String color, String startPos) {
      return color + "-" + startPos + "-knight";
   }

   public String getBishop(String color, String startPos) {
      return color + "-" + startPos + "-bishop";
   }

   static long getPartyID() {
      try(Connection c = dataConnectTo.getDefaultConnection("u0466446_chess");
          PreparedStatement p = c.prepareStatement("select partyid from chessid");
          ResultSet r = p.executeQuery()){
         while(r.next()){
            if(r.last()) partyID = r.getLong("partyid");
         }
      }
      catch(SQLException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, SOURCE_CLASS + "\n" + e.getMessage() + "\n\n\n" + Arrays.toString(e.getStackTrace()));
      }
      Logger.getLogger(SOURCE_CLASS).log(Level.INFO, MessageFormat.format("{0} is partyID", partyID));
      return partyID;
   }
}
