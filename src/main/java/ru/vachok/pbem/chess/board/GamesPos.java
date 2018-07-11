package ru.vachok.pbem.chess.board;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Позиции и ходы
 *
 * @since 27.06.2018 (7:46)
 */
public class GamesPos {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = GamesPos.class.getSimpleName();

   /**
    * "Рисунок" доски
    */
   private static final Map<Character, Integer> boardCell = new ConcurrentHashMap<>();

   /**
    * @return {@link ConcurrentHashMap} с "голой" доской
    */
   public static Map<Character, Integer> getBoardCell() {
      return boardCell;
   }
}