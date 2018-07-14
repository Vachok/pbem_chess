package ru.vachok.pbem.chess;


import javafx.concurrent.Task;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.board.GamesPosBegin;
import ru.vachok.pbem.chess.board.PosinionNow;
import ru.vachok.pbem.chess.emails.EChecker;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.ftpclient.FtpHomeCamCheck;
import ru.vachok.pbem.chess.utilitar.Utilit;
import ru.vachok.pbem.chess.vrtx.VrtClientJDBC;

import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.vachok.pbem.chess.utilitar.Utilit.toUTF;


/**
 * <b>Стартовый консольный класс</b>
 * <p>
 * <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>
 *
 * @since 19.06.2018 (21:29)
 */
public class StartMePChess extends Task<Class<Void>> {

   /**
    * Class Simple Name
    */
   private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();

   /**
    */
   private static InitProperties initProperties = new DbProperties(SOURCE_CLASS);

   /**
    * Общение с пользователем.
    * {@link MessageToUser}
    */
   private static MessageToUser messageToUser = new MessageCons();

   /**
    * {@link VrtClientJDBC}
    */
   private static VrtClientJDBC vrtClientJDBC = new VrtClientJDBC();

   /**
    * Ответ юзера, для дальнейшей работы.
    */
   private Integer userAnswer;

   /**
    * Запуск новой партии. Создание таблицы в БД, присвоение ID {@link System#currentTimeMillis()} ,
    * отправка почты.
    *
    * @see GamesPosBegin
    */
   private Runnable oneNewParty = () -> {
      long l = System.currentTimeMillis();
      List<String> rcpt = new ArrayList<>();
      Callable<Long> partyID = () -> GamesPosBegin.getInst().call();
      Callable<Map<Integer, String>> positionNow = PosinionNow.getInstance(l);
      ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
      executorService.submit(partyID);
      Future<Map<Integer, String>> mapFuture = executorService.submit(positionNow);
      try{
         String s = mapFuture.get().toString();
         StartMePChess.messageToUser.infoNoTitles(s);
         rcpt.add("143500@gmail.com");
         rcpt.add("olga-barchi@yandex.ru");
         rcpt.add("o.barchuk84@gmail.com");
         ESender.sendM(rcpt, "Play WITH ME... " + l, s.replaceAll(", ", "\n"));
      }
      catch(InterruptedException | ExecutionException e){
         StartMePChess.messageToUser.errorAlert(StartMePChess.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
   };

   /**
    * Конструктор по-умолчанию.
    *
    * @param userAnswer что делать дальше. {@link #doNext(Integer)}
    */
   public StartMePChess(Integer userAnswer) {
      this.userAnswer = userAnswer;
   }

   /**
    * <b>PRIVATE</b>
    */
   private StartMePChess() {
   }

   /**
    * 1.Старт
    * 1.1 {@link #call()}
    */
   @Override
   public void run() {
      call();
   }

   /**
    * {@link #run()}
    *
    * @return {@link Void#TYPE}
    */
   @Override
   protected Class<Void> call() {
      doNext(userAnswer);
      return Void.TYPE;
   }

   /**
    * {@link FXApp#main(java.lang.String[])}
    * Консольная версия приложения.
    * <p>
    * <b><i>Задаёт юзеру вопрос.</i></b> Запускает
    * {@link #doNext(Integer)}
    *
    * @see FtpHomeCamCheck
    * @see StartScheduled
    * @see EChecker
    * @see VrtClientJDBC
    */
   static void noFX() {
      Properties properties = initProperties.getProps();
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

   /**
    * @return {@link #oneNewParty}
    */
   private Runnable getOneNewParty() {
      return oneNewParty;
   }

   /**
    * {@link #call()} ; {@link #noFX()}
    * Запускает что-либо в зависимости от выбора
    *
    * @param userAnswer ответ пользователя на вопрос что запускать.
    * @see StartScheduled
    * @see FtpHomeCamCheck
    * @see EChecker
    */
   static void doNext(Integer userAnswer) {
      if(userAnswer==3){
         Runnable runnable = new StartScheduled(new FtpHomeCamCheck(), 90);
         runnable.run();
      }
      if(userAnswer==2){
         Runnable runnable = new StartScheduled();
         runnable.run();
      }
      if(userAnswer==1){
         Runnable runnable = new StartMePChess().getOneNewParty();
         ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
         executorService.execute(runnable);
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