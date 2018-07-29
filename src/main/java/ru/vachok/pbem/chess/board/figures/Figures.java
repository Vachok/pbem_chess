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

   /**
    * Коллекция возможных ходов для фигуры в данный момент.
    */
   Collection <Integer> calculateLegalMovies();

   /**
    * @return ID и название текущего положения для фигуры
    */
   Map<Integer, String> currentMovie();

   /**
    * @return состояние доски
    */
   Map<Integer, String> call();

   /**
    * @param color    цвет
    * @return имя фигуры
    */
   String getFullName(String color);

}
