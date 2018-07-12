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
    * ID текущей партии
    */
   void setPartyID(long partyID);

   /**
    * @return текущее положение на доске.
    */
   Map<Integer, String> currentBoardPositions();

   /**
    @param c координата буквенная
    @param i координата цифровая
     * @return ID ячейки
    */
   int getCellID(Character c, Integer i);
}
