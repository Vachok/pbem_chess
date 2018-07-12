package ru.vachok.pbem.chess.board.figures;


import ru.vachok.pbem.chess.board.ChessParty;

import java.util.Collection;
import java.util.Map;


/**
 * @since 27.06.2018 (7:45)
 */
public class King implements Figures {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = King.class.getSimpleName();

   private static final long PARTY_ID = FigNamePrice.getPartyID();

   private static final int FIG_PRICE = FigNamePrice.PRICE_KING;


   /**
    * @return цена фигуры
    */
   @Override
   public int getPriceFor() {
      return King.FIG_PRICE;
   }

   /**
    * @param partyID
    * @return int, idchessboard из базы
    */
   @Override
   public int getCellID(long partyID) {
      ChessParty chessParty = ChessParty.getInstance(partyID);
      int cellID = chessParty.getCellID("e".charAt(0), 4);
      return cellID;
   }

   /**
    * @param cellID {@link Collection} интов - куда можно пойти этойц фигурой
    */
   @Override
   public void calculateLegalMovies(Collection<String> cellID) {

   }

   /**
    * @param moveFromCellID откуда ходим
    * @param moveToCellID   куда ходим
    * @return ID и название текущего положения фигуры
    */
   @Override
   public Map<Integer, String> currentMovie(int moveFromCellID, int moveToCellID) {
      return null;
   }

   /**
    * @return состояние доски
    */
   @Override
   public Map<Integer, String> call() {
      return null;
   }

   /**
    * @param color    цвет
    * @param position начальное положение (left|right)
    * @return имя фигуры
    */
   @Override
   public String getFullName(String color, String position) {
      return null;
   }
}