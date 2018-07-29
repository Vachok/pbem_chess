package ru.vachok.pbem.chess.board;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;


/**
 @since 24.07.2018 (15:19) */
class Currents implements ChessOnBoard {


   private static final MessageToUser messageToUser = new MessageCons();

   private final List<String> rcpt = new ArrayList<>();

   private final Map<Integer, String> positMap;

   private final String boardName;
   private static final DecoderEnc DECODER_UTF = new UTF8();

   Currents(String boardName) {
      this.boardName = boardName;
      positMap = getCurrentBoardPositions(boardName);
      rcpt.add("143500@gmail.com");
   }

   public int getFigureCellID(String figName) {
      AtomicInteger figureCellID = new AtomicInteger();
      String positionsAsString = positMap.toString().replaceAll(", ", "\n");
      BiConsumer<Integer, String> searchForFigure = (x, y) -> {
         if(y.toLowerCase().contains(figName)) figureCellID.set(x);
      };
      positMap.forEach(searchForFigure);

      Long boardNameAsLong = Long.valueOf(boardName.replaceFirst("g_", ""));
      messageToUser.info("LONGS", "parse is ", "valueOf is "+boardNameAsLong);
      ESender.sendM(rcpt, getClass().getSimpleName()+"   Start this party is " +new Date(boardNameAsLong).toString(),
            DECODER_UTF.toAnotherEnc("Состояние доски на ")+
                  new Date()+"\n"+positionsAsString);
      int figCellID = figureCellID.intValue();
      messageToUser.info(getClass().getSimpleName(), boardName.replaceFirst("g_", "")+", ", DECODER_UTF.toAnotherEnc("Состояние доски на ")+new Date()
            + positionsAsString.replaceAll(", ", "\n"));
      return figCellID;
   }
}
