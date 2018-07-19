package ru.vachok.pbem.chess.board;


import ru.vachok.messenger.MessageCons;
import ru.vachok.pbem.chess.emails.EChecker;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @since 12.07.2018 (1:39)
 */
public class PlayingChess implements Runnable {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = PlayingChess.class.getSimpleName();

   private final List<String> rcpt;

   private final long partyID;

   private MessageCons messageToUser = new MessageCons();


   public PlayingChess(List<String> rcpt, long partyID) {
      this.rcpt = rcpt;
      this.partyID = partyID;
   }

   @Override
   public void run() {
      chkMail();
   }

   private void chkMail() {
      Runnable eChRun = new EChecker("play");
      ExecutorService executorService1 = Executors.newSingleThreadScheduledExecutor();
      executorService1.execute(eChRun);
   }
}