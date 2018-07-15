package ru.vachok.pbem.chess;


import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.*;
import ru.vachok.pbem.chess.board.ChessParty;
import ru.vachok.pbem.chess.board.GamesPosBegin;
import ru.vachok.pbem.chess.board.figures.VisualBoardFX;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.ftpclient.HomePCFilesCheck;
import ru.vachok.pbem.chess.fx.ControllerFXApp;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;

import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.*;

import static javafx.application.Platform.exit;
import static ru.vachok.pbem.chess.utilitar.Utilit.toUTF;


/**
 * FX Applicanion start.
 * Запуск с аргуметнтом -nofx запустит консольную версию.
 *
 * @since 30.06.2018 (9:30)
 */
public class FXApp extends Application {

   /**
    * Текст, выводимый в главное окно программы.
    */
   @FXML
   public TextArea textF;

   private static final String SOURCE_CLASS = FXApp.class.getSimpleName();

   /**
    * TimeStamp старта приложения
    */
   private static final long TIME_START = System.currentTimeMillis();

   /**
    * Запуск трёх трэдов.
    */
   private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(3);

   private static final ScheduledExecutorService EXECUTOR_SERVICE_S = new ScheduledThreadPoolExecutor(1);

   /**
    * Графические сообщения
    */
   private static MessageToUser messageToUser = new MessageFX();

   /**
    * Лист получателей e-mail
    *
    * @see ESender
    */
   private static List<String> rcpt = new ArrayList<>();

   /**
    * Главный кадр.
    */
   private static Stage primStage;

   /**
    * Статичные сообщения. В консоль.
    */
   private static MessageToUser staticMess = new MessageCons();

   /**
    * {@link UTF8}
    */
   private DecoderEnc decoderEnc = new UTF8();

   /**
    * @deprecated
    */
   @Deprecated (since = "15.07.2018 (10:50)", forRemoval = true)
   private Runnable r = () -> {
      Task<Void> theDo = new Task<Void>() {

         @Override
         protected Void call() {
            StartMePChess startMePChess = new StartMePChess(3);
            textF.appendText(decoderEnc.toAnotherEnc("Стартует периодическая проверка FTP.\nПока это всЁ"));
            EXECUTOR_SERVICE.submit(startMePChess);
            textF.appendText(EXECUTOR_SERVICE.toString());
            return null;
         }
      };
      EXECUTOR_SERVICE.execute(theDo);
      try{
         theDo.get();
      }
      catch(InterruptedException | ExecutionException e){
         messageToUser.out("FXApp_104", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), "FXApp.lambda_104");
         Thread.currentThread().interrupt();
      }
   };

   /**
    * Пункт меню - Новая партия
    */
   @FXML
   private MenuItem newParty;

   /**
    * @return {@link #primStage}
    */
   public Stage getPrimStage() {
      return primStage;
   }

   /**
    * 1. Запуск 1.1-1.4 в зависимости от полученного аргумента.
    * 1.1 {@link StartMePChess#doNext}
    * 1.2
    * 1.3
    * 1.4 {@link StartMePChess#noFX()}
    * Если агрументв нет, стартуем FX App {@link #start(Stage)}
    *
    * @param args аргументы
    */
   public static void main(String[] args) {
      staticMess.info(SOURCE_CLASS, Arrays.toString(args), "id 25");
      if(args.length <= 0){
         launch(args);
      }
      else{
         for(String s : args){
            if(s.contains("1")) StartMePChess.doNext(1);
            if(s.contains("2")) StartMePChess.doNext(2);
            if(s.contains("3")){ StartMePChess.doNext(3); }
            else{ StartMePChess.noFX(); }

         }
      }
   }

   /**
    * Старт главного экрана.
    * ru/vachok/pbem/chess/FXApp.fxml - FXML.
    * Так-же устанавливает действие при закрытии фрейма.
    *
    * @param primaryStage {@link Stage}
    * @see #setExit(Stage)
    */
   @Override
   public void start(Stage primaryStage) {
      Scene sceneOne;
      try{
         Group group = FXMLLoader.load(getClass().getResource("FXApp.fxml"));
         sceneOne = new Scene(group);
         primaryStage.setScene(sceneOne);
      }
      catch(Exception e){
         FXApp.staticMess.out("FXApp_29", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         FXApp.staticMess.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      primaryStage.show();
      setExit(primaryStage);
   }

   /**
    * Установка действий при закрытии фрейма.
    *
    * @param primaryStage {@link #start(Stage)}
    */
   private static void setExit(Stage primaryStage) {
      FXApp.primStage = primaryStage;
      primaryStage.setOnCloseRequest(event -> {
         primaryStage.setAlwaysOnTop(false);
         primaryStage.setOpacity(0.5);
         exit();
         staticMess.info(SOURCE_CLASS, toUTF("Отработано:"), TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - TIME_START) + " min");
         System.exit(0);
      });
   }

   /**
    * Парсит {@link ChessParty#partyID} из {@link DbProperties#getProps()} по-имени {@link GamesPosBegin}
    * Если не смог - пытается взять из {@link FileProps}
    * Если и это не получилось, идёт снова в {@link DbProperties}, но со-своим именем. {@link #SOURCE_CLASS}
    * <p>
    * После выгреба информации, отправляет 2 письма.
    * <p><b>
    * rcpt.add("143500@gmail.com");
    * rcpt.add("olga-barchi@yandex.ru");</b>
    * <p>
    * Запуск {@link ControllerFXApp} с новым фреймом.
    *
    * @param actionEvent menu click
    * @see ESender
    */
   @FXML
   private void loadPartyAct(ActionEvent actionEvent) {
      Future<?> submit = EXECUTOR_SERVICE_S.submit(new HomePCFilesCheck());
      Object homePCCheckTask = null;
      try{
         homePCCheckTask = submit.get();
      }
      catch(ExecutionException | InterruptedException e){
         messageToUser.out("FXApp_210", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), "FXApp.loadPartyAct_210");
         Thread.currentThread().interrupt();
      }
      InitProperties initProperties = new DbProperties(GamesPosBegin.class.getSimpleName());
      Properties properties = initProperties.getProps();
      Long partyID = Long.parseLong(properties.getProperty("partyid"));
      if(homePCCheckTask!=null){
         textF.appendText(MessageFormat.format("{0}\n{1} is Party ID.\n{2}{3}\n{4}{5}{6}{7}{8}", homePCCheckTask.toString(), partyID, decoderEnc.toAnotherEnc("Партия начата: "), new Date(partyID), decoderEnc.toAnotherEnc("Программа стартовала: "), TIME_START, decoderEnc.toAnotherEnc(". Разница с началом партии аж: "), TimeUnit.MILLISECONDS.toHours(TIME_START - partyID), decoderEnc.toAnotherEnc(" часов.\n")));
      }
      List<String> col = new ArrayList<>();
      col.add("idchessboard");
      col.add("cellChar");
      col.add("cellInt");
      col.add("standing");
      initProperties = new DbProperties(SOURCE_CLASS);
      initProperties.delProps();
      DBaseFactory dBaseFactory = new DBaseFactory.Builder(new RegRuMysql(), "select * from chessboard" + partyID, col, true).build();
      try{
         Map<String, Object> call = dBaseFactory.call();
         rcpt.add("143500@gmail.com");
         rcpt.add("olga-barchi@yandex.ru");
         initProperties.setProps(properties);
         ESender eSender = new ESender(rcpt, "Playing party ID " + partyID, call.toString().replaceAll(", ", "\n"));

         EXECUTOR_SERVICE.execute(eSender);
      }
      catch(Exception e){
         messageToUser.out("FXApp_155", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ").replaceAll("ru.vachok", ">>>>>>>>>ru.vachok")).getBytes());
         messageToUser.errorAlert("FXApp", e.getMessage(), "FXApp.sendFigMoves_155");
      }
      ControllerFXApp controllerFXApp = new ControllerFXApp();
      controllerFXApp.controlFX(new Stage());
   }

   @FXML
   private void sendFigMoves(ActionEvent actionEvent) {
      //todo 14.07.2018 (12:07)
      throw new UnsupportedOperationException("14.07.2018 (11:47)");
   }

   /**
    * Создаёт партию с новым ID
    *
    * @param actionEvent menu click
    * @see StartMePChess#call()
    */
   @FXML
   private void newPartyAction(ActionEvent actionEvent) {
      Task<? extends Class<Void>> startMePChess = new StartMePChess(1);
      try{
         (( StartMePChess ) startMePChess).call();
      }
      catch(Exception e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      double progress = startMePChess.getProgress();
      textF.appendText("Progress :" + "\n" + progress);
   }

   /**
    * Показать шахматную доску.
    *
    * @param actionEvent menu click
    */
   @FXML
   private void showBoard(ActionEvent actionEvent) {
      VisualBoardFX visualBoardFX = new VisualBoardFX(new Stage());
      primStage.setOpacity(0.1);
      primStage.toBack();
      visualBoardFX.run();

   }
}
