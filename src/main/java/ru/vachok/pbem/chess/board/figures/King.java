package ru.vachok.pbem.chess.board.figures;


import ru.vachok.pbem.chess.board.ChessBoard;


/**
 * @since 27.06.2018 (7:45)
 */
public class King implements ChessBoard {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = King.class.getSimpleName();

   /**
    * Цена фигуры
    */
   private static final int PRICE_FOR_GAME = 10000;

   /**
    * {@link #PRICE_FOR_GAME}
    *
    * @return цена
    */
   static int getPriceForGame() {
      return PRICE_FOR_GAME;
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
}