package ru.vachok.pbem.chess;


import ru.vachok.messenger.MessageTelnet;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.emails.EChecker;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.*;


/**
 * @since 28.06.2018 (10:24)
 */
public class StartScheduled implements Runnable {

   private static final String SOURCE_CLASS = StartScheduled.class.getSimpleName();

   /**
    * Планировщик на 30 потоков
    */
   private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(30);

   private static MessageToUser messageToUser = new MessageTelnet();

   private InitProperties initProperties = new DbProperties(SOURCE_CLASS);

   /**
    * Запускаемый поток
    */
   private Runnable runMe;

   /**
    * Задержка запуска
    */
   private long initial;

   /**
    * Пауза между заданиями
    */
   private long period;

   /**
    * Стоп, после кол-во минут
    */
   private int stopAfterMinutes;

   /**
    * Счетчик времени
    *
    * @see TimerClass
    */
   private Runnable counter;


   /**
    * Конструктор
    *
    * @param initial {@link #initial}
    * @param period  {@link #period}
    * @param i       {@link #stopAfterMinutes}
    */
   public StartScheduled(long initial, long period, int i) {
      this.initial = initial;
      this.period = period;
      this.stopAfterMinutes = i;
      checkPeriodically();
   }

   /**
    * Запуск планировщика.
    */
   private void checkPeriodically() {
      ScheduledFuture schedule = StartScheduled.SCHEDULED_EXECUTOR_SERVICE.scheduleWithFixedDelay(new EChecker(), initial, period, TimeUnit.SECONDS);
      ScheduledFuture count = SCHEDULED_EXECUTOR_SERVICE.scheduleWithFixedDelay(counter, initial, period, TimeUnit.SECONDS);
      try{
         count.get();
         schedule.get();
      }
      catch(Exception e){
         messageToUser.out("StartScheduled_96", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      Runnable canceler = () -> schedule.cancel(false);
      SCHEDULED_EXECUTOR_SERVICE.schedule(canceler, stopAfterMinutes, TimeUnit.MINUTES);

   }

   /**
    * Конструктор по-умолчанию.
    * <p>
    * Берет параметры из БД.
    *
    * @see DbProperties
    */
   public StartScheduled() {
      Properties properties = initProperties.getProps();
      this.stopAfterMinutes = Integer.parseInt(properties.getProperty("stopAfterMinutes"));
      this.period = Long.parseLong(properties.getProperty("period"));
      this.initial = Long.parseLong(properties.getProperty("initial"));
      this.counter = new TimerClass(runMe.toString(), period);
      checkPeriodically();
   }

   /**
    * Конструктор
    *
    * @param runnable {@link #runMe}
    * @param period   {@link #period}
    */
   public StartScheduled(Runnable runnable, long period) {
      this.runMe = runnable;
      this.period = period;
   }

   /**
    * @param timer true = запуск {@link TimerClass}
    */
   public StartScheduled(boolean timer) {
      if(timer){
         Thread thread = new TimerClass("20 sec...", 20);
         thread.start();
      }
      else{ throw new UnsupportedOperationException(SOURCE_CLASS + " id 112"); }
   }

   /**
    * 1. Запуск
    * 1.1 {@link #futureStart()}
    */
   @Override
   public void run() {
      Properties properties = initProperties.getProps();
      this.stopAfterMinutes = Integer.parseInt(properties.getProperty("stopAfterMinutes"));
      this.period = Long.parseLong(properties.getProperty("period"));
      this.initial = Long.parseLong(properties.getProperty("initial"));
      futureStart();
   }

   /**
    * 1.1 {@link #run()}
    * Запуск заданий {@link Future}
    */
   private void futureStart() {
      ScheduledFuture schedule = SCHEDULED_EXECUTOR_SERVICE.scheduleWithFixedDelay(runMe, initial, period, TimeUnit.SECONDS);
      Thread timeR = new TimerClass(runMe.toString(), initial, ( int ) period);
      timeR.start();
      try{
         schedule.get();
      }
      catch(InterruptedException | ExecutionException e){
         messageToUser.out("StartScheduled_105", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
   }

   /**Класс-таймер
    * @since 01.07.2018 (19:21)
    */
   class TimerClass extends Thread {

      private long timeFromInSeconds;

      private String processName;

      private long stopAfterInMin;

      TimerClass(String s, long period) {
         this.processName = s;
         this.timeFromInSeconds = period;
         this.stopAfterInMin = Long.parseLong(new DbProperties("StartScheduled").getProps().getProperty("stopAfterMinutes"));
      }

      TimerClass(String processName, long timeFromInSeconds, int stopAfterInMin) {
         this.timeFromInSeconds = timeFromInSeconds;
         this.processName = processName;
         this.stopAfterInMin = stopAfterInMin;
      }

      TimerClass(int timeFromInSeconds) {
         this.timeFromInSeconds = timeFromInSeconds;
      }

      @Override
      public void run() {

         theCounter();
      }

      void theCounter() {
         for(int i = 0; i < timeFromInSeconds; i++){
            try{
               String s = "SCHEDULED: " + processName + "\n init " + (timeFromInSeconds - i) + "sec. \nstop after " + (stopAfterInMin - TimeUnit.SECONDS.toMinutes(i)) + " min.";
               System.out.println(s);
               Thread.sleep(ConstantsFor.TIMEOUT_1000);
            }
            catch(InterruptedException e){
               Thread.currentThread().interrupt();
            }
         }
      }
   }

   /**Названия сервисов.
    * @see StartMePChess#noFX()
    * @since 21.06.2018 (19:22)
    */
   enum Services {
      EXIT,
      NEW_CHESS_BOARD,
      E_CHECKER,
      FTP_CHECKER;


      public static Map<Integer, String> getNames() {
         Map<Integer, String> servicesMap = new HashMap<>();
         servicesMap.put(NEW_CHESS_BOARD.ordinal(), NEW_CHESS_BOARD.name());
         servicesMap.put(E_CHECKER.ordinal(), E_CHECKER.name());
         servicesMap.put(FTP_CHECKER.ordinal(), FTP_CHECKER.name());
         return servicesMap;
      }
   }
}

