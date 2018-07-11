package ru.vachok.pbem.chess.board.figures;


/**
 * "Цены" фигур
 *
 * @since 27.06.2018 (7:51)
 */
public enum FigPrices {
   FIG_PRICES;

   /**
    * {@link King}
    */
   public static final int FIG_KING_PRICE = King.getPriceForGame();
}
