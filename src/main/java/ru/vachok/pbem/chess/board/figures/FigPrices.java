package ru.vachok.pbem.chess.board.figures;


/**
 * "Цены" фигур
 *
 * @since 27.06.2018 (7:51)
 */
public enum FigPrices {
   /**
    * Ценность фигур
    */
   FIG_PRICES;

   /**
    * Цена фигуры Король {@link King}
    */
   public static final int PRICE_KING = 10000;

   /**
    Цена фигуры Ферзь
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
}
