package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.board.MoveStarter;
import ru.vachok.pbem.chess.board.PartyNewIDParty;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.emails.MailMessages;
import ru.vachok.pbem.chess.ftpclient.FtpHomeCamCheck;

import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.WARNING;


/**
 Действия на ответ пользователя.

 @since 24.07.2018 (12:18) */
public class UserAns {

   /**
    <b>UserAns</b>
    */
   private static final String SOURCE_CLASS = UserAns.class.getSimpleName();

   /**
    {@link MessageCons}
    */
   private static final MessageToUser MESSAGE_TO_USER = new MessageCons();

   /**
    Запуск последней ID-партии из chessid. Создание таблицы в БД, присвоение ID {@link System#currentTimeMillis()} ,
    отправка почты. {@link #ansOne()}

    @see PartyNewIDParty
    */
   private static final Runnable GET_LAST_PARTY = () -> {
      long l = System.currentTimeMillis();
      List<String> rcpt = new ArrayList<>();
      long partyID = ESender.getPartyID();
      Callable<Map<Integer, String>> positionNow = MoveStarter.getPositions(partyID);
      ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
      Future<Map<Integer, String>> mapFuture = executorService.submit(positionNow);
      try{
         String s = mapFuture.get().toString();
         MESSAGE_TO_USER.infoNoTitles(s);
         rcpt.add("143500@gmail.com");
         rcpt.add("olga-barchi@yandex.ru");
         rcpt.add("o.barchuk84@gmail.com");
         ESender.sendM(rcpt, "Play WITH ME... " + partyID + " hrs:" + (TimeUnit.MILLISECONDS.toHours(l - partyID)), s.replaceAll(", ", "\n"));
      }
      catch(InterruptedException | ExecutionException e){
         MESSAGE_TO_USER.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
   };

   /**
    {@link Executor} фиксированный для 5и {@link Thread}
    */
   private static final ExecutorService FIXED_THREAD_POOL_5 = Executors.newFixedThreadPool(5);

   private UserAns() {
      throw new UnsupportedOperationException("24.07.2018 (15:39) ");
   }

   /**
    <h2>Проверка видеофайлов</h2>
    Как на ПК, так и на камере.
    {@link FtpHomeCamCheck#call()}

    @return {@link String} с инфо о положении дел с видосами.
    */
   public static String ansThree() {
      try{
         Callable<String> callToFTP = new FtpHomeCamCheck();
         ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
         ScheduledFuture<String> schedule = scheduledExecutorService.schedule(callToFTP, 60, TimeUnit.SECONDS);
         String s1 = schedule.get();
         MESSAGE_TO_USER.info(SOURCE_CLASS, "ans = 3", s1);
         return s1;
      }
      catch(InterruptedException | ExecutionException e){
         MESSAGE_TO_USER.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
      return ConstantsFor.UTF_8_ENC.toAnotherEnc("Нет ничего");
   }

   /**
    <h2>Новая партия</h2>
    {@link PartyNewIDParty}

    @see #FIXED_THREAD_POOL_5
    */
   public static void ansTwo() {
      Runnable rNewParty = PartyNewIDParty.getInst();
      FIXED_THREAD_POOL_5.execute(rNewParty);
   }

   /**
    Запускает лямбду.
    {@link #GET_LAST_PARTY}
    */
   public static void ansOne() {
      MoveStarter moveStarter = MoveStarter.getPositions();
      FIXED_THREAD_POOL_5.submit(moveStarter);
   }

   /**
    <h2>Очистка почтового ящика (4)</h2>

    @see MailMessages#MailMessages()
    */
   public static void ansFour() {
      FIXED_THREAD_POOL_5.execute(GET_LAST_PARTY);
      Callable<Message[]> mailMsgs = new MailMessages();
      Future<Message[]> submit = Executors.newSingleThreadExecutor().submit(mailMsgs);
      Message[] messages;
      try{
         messages = submit.get();
         for(Message m : messages){
            MESSAGE_TO_USER.info(Arrays.toString(m.getFrom()).replaceAll(", ", "\n"), m.getSubject(), m.getContent().toString());
         }
         ansFour(null);
      }
      catch(InterruptedException | ExecutionException | MessagingException | IOException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, String.format("%s%n%n%s", e.getMessage(), Arrays.toString(e.getStackTrace())));
         Thread.currentThread().interrupt();
      }

   }

   public static void ansFour(String s) throws ExecutionException, InterruptedException {

      MailMessages.Cleaner cleaner = new MailMessages.Cleaner(s);
      ExecutorService executorService = Executors.unconfigurableExecutorService(Executors.newSingleThreadExecutor());
      Future<Message[]> submit = executorService.submit(cleaner);
      Message[] messages = submit.get();
      Logger.getLogger(SOURCE_CLASS).log(WARNING, messages.length + " mails");
   }

   public static void ansFive() {

      Runnable r = new SpeedRunActualize();
      FIXED_THREAD_POOL_5.execute(r);
   }
}
