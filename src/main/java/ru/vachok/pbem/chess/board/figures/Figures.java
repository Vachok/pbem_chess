package ru.vachok.pbem.chess.board.figures;


import ru.vachok.pbem.chess.board.GamesPosBegin;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;


/**
 * Набор стандартных параметров фигуры
 * Расширяет {@link Callable} и возвращает {@link Map}
 * где {@link Integer} это ID клетки в БД, а {@link String } - полное имя фигуры.
 *
 * @since 12.07.2018 (13:51)
 */
public interface Figures extends Callable<Map<Integer, String>> {

   /**
    * @return цена фигуры
    */
   int getPriceFor();

   /**
    * @param partyID {@link GamesPosBegin#PARTY_ID}
    * @param cF      - буква-координата
    * @param j       - цифра-координата
    * @return ID ячейки в БД.
    */
   int getCellID(long partyID, Character cF, Integer j);

   /**
    * @param cellID {@link Collection} интов - куда можно пойти этой фигурой
    */
   void calculateLegalMovies(Collection<String> cellID);

   /**
    * @param moveFromCellID откуда ходим
    * @param moveToCellID   куда ходим
    * @return ID и название текущего положения для фигуры
    */
   Map<Integer, String> currentMovie(int moveFromCellID, int moveToCellID);

   /**
    * @return состояние доски
    */
   Map<Integer, String> call();

   /**
    * @param color    цвет
    * @param position начальное положение (left|right)
    * @return имя фигуры
    */
   String getFullName(String color, String position);

}
