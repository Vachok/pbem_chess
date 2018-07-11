package ru.vachok.pbem.chess;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.pbem.chess.board.GamesPosBegin;
import ru.vachok.pbem.chess.board.PosinionNow;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.ftpclient.FTPPeriodicChecker;
import ru.vachok.pbem.chess.utilitar.Utilit;
import ru.vachok.pbem.chess.vrtx.VrtClientJDBC;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.vachok.pbem.chess.utilitar.Utilit.toUTF;


/**
 * <b>Стартовый</b>
 * <p>
 * <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>
 *
 * @since 19.06.2018 (21:29)
 */
class StartMePChess {

   /**
    * Class Simple Name
    */
   private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();

   /**
    * Общение с пользователем.
    * {@link MessageToUser}
    */
   private static MessageToUser messageToUser = new MessageCons();

   /**
    * {@link VrtClientJDBC}
    */
   private static VrtClientJDBC vrtClientJDBC = new VrtClientJDBC();

   private static List<String> rcpt = new ArrayList<>();

   private static Properties properties = new Properties(new DbProperties(SOURCE_CLASS).getProps());


   /**
    * <b>Точка входа.</b>
    *
    * @param args null
    * @see Utilit#checkTime() Utilit#checkTime()Utilit#checkTime()
    */
   public static void main(String[] args) {
      noFX();
   }

   /**
    * 1.1 Запуск приложения без GUI {@link #main(String[])}
    * 1.1.4 {@link #doNext(Integer)}
    */
   private static void noFX() {
      messageToUser.info(SOURCE_CLASS, properties.toString(), toUTF(new Utilit().checkTime()));
      Scanner scanner = new Scanner(System.in);
      Integer userAnswer = 0;
      Map<Integer, String> names = StartScheduled.Services.getNames();
      messageToUser.infoNoTitles(toUTF("Введите имя сервиса:\n" + names.toString().replaceAll(", ", "\n")));
      while(scanner.hasNextInt()){
         userAnswer = scanner.nextInt();
         doNext(userAnswer);
      }
   }

   /**1.1.4 {@link #noFX()} Запустить основные действия.
    * @param userAnswer ответ пользователя на вопрос что запускать.
    * @see StartScheduled
    */
   private static void doNext(Integer userAnswer) {
      if(userAnswer==3){
         Runnable runnable = new StartScheduled(new FTPPeriodicChecker(), 90);
         runnable.run();
      }
      if(userAnswer==2){
         Runnable runnable = new StartScheduled();
         runnable.run();
      }
      if(userAnswer==1){
         Runnable runnable = new GamesPosBegin();
         Callable<Map<Integer, String>> posinionNow = PosinionNow.getInstance();
         ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
         executorService.execute(runnable);
         Future<Map<Integer, String>> mapFuture = executorService.submit(posinionNow);
         try{
            String s = mapFuture.get().toString();
            messageToUser.infoNoTitles(s);
            rcpt.add("143500@gmail.com");
            rcpt.add("olga-barchi@yandex.ru");
            rcpt.add("o.barchuk84@gmail.com");
            ESender.sendM(rcpt, "Play WITH ME... " + System.currentTimeMillis(), s.replaceAll(", ", "\n"));
         }
         catch(InterruptedException | ExecutionException e){
            messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         }
      }
      if(userAnswer==0) System.exit(0);
      String s = "mailToString";
      String s1 = vrtClientJDBC.toString();
      if(s.toLowerCase().contains("moving:")){
         Pattern p = Pattern.compile("([\\w][\\d])-([\\w][\\d])");
         Matcher m = p.matcher(s);
         while(m.find()) s = m.group();
         messageToUser.confirm(SOURCE_CLASS, "The Move = " + s, "OK? " + s1);
      }
   }
}