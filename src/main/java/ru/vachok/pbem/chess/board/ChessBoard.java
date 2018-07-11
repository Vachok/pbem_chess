package ru.vachok.pbem.chess.board;


import java.util.Map;


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

   Map<Character, Integer> currentPos(String figureName, Map<Character, Integer> moveFromTo);
}
