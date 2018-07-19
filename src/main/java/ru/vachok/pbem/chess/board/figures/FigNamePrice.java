package ru.vachok.pbem.chess.board.figures;


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

   private static long partyID;

   static long getPartyID() {
      return partyID;
   }

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
}
