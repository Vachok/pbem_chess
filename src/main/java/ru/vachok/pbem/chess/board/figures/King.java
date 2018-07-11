package ru.vachok.pbem.chess.board.figures;


import ru.vachok.pbem.chess.board.ChessBoard;

import java.util.Map;


/**
 * @since 27.06.2018 (7:45)
 */
public class King implements ChessBoard {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = King.class.getSimpleName();

   /**
    * {@link FigPrices#PRICE_KING}
    *
    * @return ценность
    */
   static int getPriceForGame() {
      return FigPrices.PRICE_KING;
   }
   /**
    * Сделать ход
    */
   @Override
   public void makeMove() {

   }

   /**
    * "Съесть"
    */
   @Override
   public void takeFigure() {

   }

   /**
    * Рассчёт следующего хода.
    */
   @Override
   public void calculateNext() {

   }

   @Override
   public Map<Character, Integer> currentPos(String figureName, Map<Character, Integer> moveFromTo) {
      return null;
   }
}