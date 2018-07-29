package ru.vachok.pbem.chess.board.figures;


import java.util.ArrayList;
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

   private int currentCellID;

   private int wantCellId;
   King king;

   private King() {
      this.king = this;
   }

   public King getKing(){
      return king;
   }

   /**
    * @return цена фигуры
    */
   @Override
   public int getPriceFor() {
      return King.FIG_PRICE;
   }

   public static int getPriceForGame() {
      return 10000;
   }

   @Override
   public Collection<Integer>  calculateLegalMovies() {
      Collection<Integer> legalMovies = new ArrayList<>();
      //todo 25.07.2018 (12:56) Придумать как считать легальные ходы .

      return legalMovies;
   }

   /**
    * @return ID и название текущего положения фигуры
    */
   @Override
   public Map<Integer, String> currentMovie() {
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
    * @return имя фигуры
    */
   @Override
   public String getFullName(String color) {
      return color+"-king";
   }
}