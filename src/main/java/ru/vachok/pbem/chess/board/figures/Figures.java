package ru.vachok.pbem.chess.board.figures;


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

   //todo 14.07.2018 (3:22) DOC
   int getCellID(long partyID);

   /**
    * @param cellID {@link Collection} интов - куда можно пойти этойц фигурой
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
