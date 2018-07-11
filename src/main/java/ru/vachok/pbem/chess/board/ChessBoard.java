package ru.vachok.pbem.chess.board;


/**
 * Шахматная доска.
 * <p>
 * Взаимодействие.
 *
 * @since 27.06.2018 (7:41)
 */
public interface ChessBoard {

   /**
    * Сделать ход
    */
   void makeMove();

   /**
    * "Съесть"
    */
   void takeFigure();

   /**
    * Рассчёт следующего хода.
    */
   void calculateNext();
}
