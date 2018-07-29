package ru.vachok.pbem.chess.board;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.messenger.email.ESender;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.emails.MailMessages;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.SpeedRunActualize;
import ru.vachok.pbem.chess.utilitar.UserAns;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

import static ru.vachok.pbem.chess.utilitar.ConstantsFor.RCPT;


/**
 @since 24.07.2018 (15:02) */
public class MoveStarter implements Callable<Map<Integer, String>> {

   private static final String SOURCE_CLASS = MoveStarter.class.getSimpleName();

   /**
    <b>Singletone</b>
    */
   private static final MoveStarter ourInstance = new MoveStarter();

   /**
    {@link RegRuMysql}
    */
   private static final DataConnectTo DATA_CONNECT_TO = new RegRuMysql();

   /**
    {@link RegRuMysql#getDefaultConnection(String)} - {@code u0466446_chess}.
    */
   private static final Connection DEFAULT_CONNECTION = DATA_CONNECT_TO.getDefaultConnection("u0466446_chess");

   /**
    {@link MessageCons}
    */
   private static final MessageToUser messageToUser = new MessageCons();

   /**
    ID шахматной партии.
    */
   private static long partyID;

   /**
    Ячейка, с которой хочет ходить фигура
    */
   private static String from;

   /**
    Ячейка куда хочет пойти фигура
    */
   private static String to;


   /**
    <b>По-умолчанию</b>
    <p>
    ID = 1531526616031

    @return {@link #ourInstance}
    */
   public static MoveStarter getPositions() {
      MoveStarter.partyID = 1531526616031L;
      return ourInstance;
   }

   /**
    {@link #ourInstance}
    */
   private MoveStarter() {
   }

   /**
    Singletone

    @param partyID ID в базе.
    @return Instance этого класса.
    @see UserAns#GET_LAST_PARTY
    */
   public static MoveStarter getPositions(long partyID) {
      MoveStarter.partyID = partyID;
      return ourInstance;
   }

   /**
    Party ID - последний в БД.

    @param from {@link #from}
    @param to   {@link #to}
    @return {@link #ourInstance}
    */
   public static MoveStarter getPositions(String from, String to) {
      MoveStarter.from = from;
      MoveStarter.to = to;
      return ourInstance;
   }

   @Override
   public Map<Integer, String> call() {
      moveFigure();
      Map<Integer, String> bMap = new HashMap<>();
      String sql = String.format("select * from g_%d", partyID);
      try(PreparedStatement p = DEFAULT_CONNECTION.prepareStatement(sql);
          ResultSet r = p.executeQuery()){
         while(r.next()){
            int idchessboard = r.getInt("idchessboard");
            String state = r.getString("cellChar") + "-" + r.getInt("cellInt") + ": " + r.getString("standing") + " = " + r.getInt("price");
            bMap.put(idchessboard, state);
         }
      }
      catch(SQLException e){MoveStarter.messageToUser.errorAlert(MoveStarter.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
      return bMap;
   }

   public void moveFigure() {
      emailMove();
   }

   void calcLegalMovies(String makedMove) {
      throw ConstantsFor.NOT_READY;
   }

   private static void moveFigure(Address[] user, String from, String to) {
      new MailMessages(true).call();
      Set<Integer> cellIDs = ourInstance.call().keySet();
      Currents currents = new Currents("g_" + partyID);
      int figureCellIDFROM = currents.getFigureCellID(from);
      int figureCellIDTO = currents.getFigureCellID(to);
      messageToUser.info("MOVE FROM - TO", from + " " + figureCellIDFROM, to + " " + figureCellIDTO);
      for(Address s : user){
         RCPT.add(s.toString());
      }
      MessageToUser messageMail = new ESender(RCPT);
      messageMail.info("Play WITH ME... ", "" + partyID, cellIDs.toString() + "\n\n\n" + from + " - " + to + "\n" + figureCellIDFROM + " " + figureCellIDTO);
      ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
      executorService.schedule(ourInstance, 30, TimeUnit.SECONDS);
      messageToUser.info(SOURCE_CLASS, "DELAYING 30 SEC", executorService.toString());

      Thread.currentThread().interrupt();
   }

   private static void emailMove() {
      SpeedRunActualize speedRunActualize = new SpeedRunActualize();
      MailMessages mailMessages = new MailMessages();
      ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(2);
      ScheduledFuture<Message[]> schedule = executorService.schedule(mailMessages, 30, TimeUnit.SECONDS);
      try{
         Message[] messages = schedule.get();
         Address[] fromMail;
         for(Message m : messages){
            if(m.getSubject().toLowerCase().contains("play with me")){
               fromMail = m.getFrom();
               String s = Arrays.toString(fromMail);
               messageToUser.info(s, m.getSubject(), m.getContent().toString());
               MoveStarter.from = "e2";
               MoveStarter.to = "e4";
               moveFigure(fromMail, from, to);
            }
         }
         executorService.schedule(ourInstance, 30, TimeUnit.SECONDS);
         speedRunActualize.run();
         Thread.currentThread().interrupt();
      }
      catch(InterruptedException | ExecutionException | MessagingException | IOException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
   }
}
