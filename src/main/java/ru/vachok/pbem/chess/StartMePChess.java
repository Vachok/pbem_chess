package ru.vachok.pbem.chess;


import javafx.concurrent.Task;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.anno.External;
import ru.vachok.pbem.chess.ftpclient.FtpHomeCamCheck;
import ru.vachok.pbem.chess.utilitar.*;
import ru.vachok.pbem.chess.vrtx.VrtClientJDBC;

import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 <b>Стартовый консольный класс</b>
 <p>
 <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>

 @since 19.06.2018 (21:29) */
public class StartMePChess extends Task<String> {


   /**
    Class Simple Name
    */
   private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();

   /**
    Общение с пользователем.
    {@link MessageToUser}
    */
   private static final MessageToUser messageToUser = new MessageCons();

   /**
    {@link UTF8}
    */
   private static final DecoderEnc UTF_8 = new UTF8();

   /**
    {@link VrtClientJDBC}
    */
   private static final VrtClientJDBC vrtClientJDBC = new VrtClientJDBC();

   /**
    */
   private static InitProperties initProperties = new DBRegProperties(ConstantsFor.APP_NAME + SOURCE_CLASS);

   /**
    Ответ юзера, для дальнейшей работы.
    */
   private final Integer userAnswer;


   /**
    Конструктор по-умолчанию.

    @param userAnswer что делать дальше. {@link #doNext(Integer)}
    */
   public StartMePChess(Integer userAnswer) {
      this.userAnswer = userAnswer;
      call();
   }

   /**
    <h3>PRIVATE</h3>
    {@link UnsupportedOperationException}
    */
   private StartMePChess() {
      throw new UnsupportedOperationException("25.07.2018 (9:28) " + SOURCE_CLASS + ".private constructor");
   }

   /**
    1.Старт
    1.1 {@link #call()}
    @see FXApp
    */
   @Override
   public void run() {
      Thread.currentThread().setName("StartMePChess.run");
      doNext(userAnswer);
   }

   /**
    {@link FXApp#main(java.lang.String[])}
    Консольная версия приложения.
    <p>
    <b><i>Задаёт юзеру вопрос.</i></b> Запускает :
    <p>
    .1 {@link Utilit#checkTime()}
    .2 {@link DecoderEnc#toAnotherEnc(String)}
    .3 same
    .4 {@link #doNext(Integer)}

    @see FtpHomeCamCheck
    @see StartScheduled
    */
   @External (from = "StartMePChess.initProperties")
   static void noFX() {
      @SuppressWarnings ("UnusedAssignment") Properties properties = new Properties();
      properties = initProperties.getProps();
      if(properties.isEmpty()){ initProperties = new FileProps(SOURCE_CLASS); }
      else{
         InitProperties fileInit = new FileProps(SOURCE_CLASS);
         fileInit.setProps(properties);
      }
      messageToUser.info(SOURCE_CLASS, properties.toString(), UTF_8.toAnotherEnc(new Utilit().checkTime()));
      Scanner scanner = new Scanner(System.in);
      Integer userAnswer;
      Map<Integer, String> names = StartScheduled.Services.getNames();
      messageToUser.infoNoTitles(UTF_8.toAnotherEnc("Введите имя сервиса:\n" + names.toString().replaceAll(", ", "\n")));
      while(scanner.hasNext()){
         userAnswer = scanner.nextInt();
         doNext(userAnswer);
      }
   }

   /**
    @return {@link #SOURCE_CLASS}
    */
   @Override
   protected String call() {
      return doNext(userAnswer);
   }

   /**
    <h2>Основное действие</h2>
    {@link #noFX()}, {@link FXApp#main(String[])}, {@link #run()}, {@link #call()}
    Запускает что-либо в зависимости от выбора
    <p>
    {@link #userAnswer} == 0, {@link System#exit(int)} <b>status 0</b>.
    {@link UserAns} - класс-стартер.

    @param userAnswer ответ пользователя на вопрос что запускать.
    */
   @SuppressWarnings ("FeatureEnvy")
   static String doNext(Integer userAnswer) {
      if(userAnswer==5) UserAns.ansFive();
      if(userAnswer==4) UserAns.ansFour();
      if(userAnswer==3) UserAns.ansThree();
      if(userAnswer==2) UserAns.ansTwo();
      if(userAnswer==1) UserAns.ansOne();
      if(userAnswer==0) System.exit(0);
      String s = "mailToString";
      String s1 = vrtClientJDBC.toString();
      if(s.toLowerCase().contains("moving:")){
         Pattern p = Pattern.compile("([\\w][\\d])-([\\w][\\d])");
         Matcher m = p.matcher(s);
         while(m.find()) s = m.group();
         messageToUser.confirm(SOURCE_CLASS, "The Move = " + s, "OK? " + s1);
      }
      return s;
   }
}