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
import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DBaseFactory;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.board.MoveMover;
import ru.vachok.pbem.chess.board.PartyNewIDParty;
import ru.vachok.pbem.chess.board.figures.VisualBoardFX;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.ftpclient.HomePCFilesCheck;
import ru.vachok.pbem.chess.fx.ControllerFXApp;
import ru.vachok.pbem.chess.utilitar.*;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.*;

import static javafx.application.Platform.exit;


/**
 FX Applicanion start.
 Запуск с аргуметнтом -nofx запустит консольную версию.

 @since 30.06.2018 (9:30) */
public class FXApp extends Application {

   private static final String SOURCE_CLASS = FXApp.class.getSimpleName();

   private static final FXMLLoader FXML_LOADER = new FXMLLoader();

   /**
    TimeStamp старта приложения
    */
   private static final long TIME_START = System.currentTimeMillis();

   /**
    Запуск трёх трэдов.
    */
   private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(3);

   private static final ScheduledExecutorService EXECUTOR_SERVICE_S = new ScheduledThreadPoolExecutor(1);

   /**
    {@link UTF8}
    */
   private static final DecoderEnc DECODER_UTF8 = new UTF8();

   /**
    Графические сообщения
    */
   private static final MessageToUser MESSAGE_FX = new MessageFX();

   /**
    Лист получателей e-mail

    @see ESender
    */
   private static final List<String> rcpt = new ArrayList<>();

   /**
    Статичные сообщения. В консоль.
    */
   private static final MessageToUser staticMess = new MessageCons();

   /**
    Главный кадр.
    */
   private static Stage primStage;

   /**
    Текст, выводимый в главное окно программы.
    */
   @FXML
   private TextArea textF;

   /**
    Пункт меню - Новая партия
    */
   @FXML
   private MenuItem newParty;

   /**
    @return {@link #primStage}
    */
   public Stage getPrimStage() {
      return FXApp.primStage;
   }

   /**
    {@link SpeedRunActualize}
    */
   private static final Runnable SPEED_RUN_ACTUALIZE = new SpeedRunActualize();

   /**
    Запуск {@link #SPEED_RUN_ACTUALIZE}
    */
   private static final ExecutorService UNCONFIGURABLE_EXECUTOR_SERVICE = Executors.unconfigurableExecutorService(Executors.newSingleThreadExecutor());
   /**
    1. Запуск 1.1-1.4 в зависимости от полученного аргумента.
    1.1 {@link StartMePChess#doNext}
    1.2
    1.3
    1.4 {@link StartMePChess#noFX()}
    Если агрументв нет, стартуем FX App {@link #start(Stage)}
    Так же создаёт, если нет, почтовую папку mail

    @param args аргументы
    */
   public static void main(String[] args) {
      staticMess.info(SOURCE_CLASS, Arrays.toString(args), "id 25");
      File file = createMailDir();
      staticMess.infoNoTitles(file.getAbsolutePath());
      if(args.length <= 0){
         launch(args);

      }
      else{
         for(String s : args){
            if(s.contains("1")) StartMePChess.doNext(1);
            if(s.contains("2")) StartMePChess.doNext(2);
            if(s.contains("3")){
               StartMePChess.doNext(3);
               if(s.contains("3")){
                  StartMePChess.doNext(4);
                  if(s.contains("3")){
                     StartMePChess.doNext(5);
                  }
                  else{
                     StartMePChess.noFX();
                  }
               }
            }
         }
      }
   }

   /**
    Создаёт, папку , если ее нету.

    @return папка mail
    */
   private static File createMailDir() {
      File mailDirectory = new File("mail\\");
      UNCONFIGURABLE_EXECUTOR_SERVICE.execute(SPEED_RUN_ACTUALIZE);
      if(!mailDirectory.exists()){
         try{
            FileUtils.forceMkdir(mailDirectory);
         }
         catch(IOException e){
            staticMess.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         }
      }
      return mailDirectory;
   }

   /**
    Старт главного экрана.
    ru/vachok/pbem/chess/FXApp.fxml - FXML.
    Так-же устанавливает действие при закрытии фрейма.

    @param primaryStage {@link Stage}
    @see #setExit(Stage)
    */
   @Override
   public void start(Stage primaryStage) {
      UNCONFIGURABLE_EXECUTOR_SERVICE.execute(SPEED_RUN_ACTUALIZE);
      Group root = new Group();
      FXML_LOADER.setRoot(root);
      FXML_LOADER.setController(root);
      Scene sceneOne;
      try{
         sceneOne = new Scene(root);
         primaryStage.setScene(sceneOne);
      }
      catch(Exception e){
         FXApp.staticMess.out("FXApp_29", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         FXApp.staticMess.errorAlert(FXApp.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      primaryStage.setTitle(DECODER_UTF8.toAnotherEnc(new Utilit().checkTime()));
      primaryStage.show();
      FXApp.setExit(primaryStage);
   }

   /**
    Установка действий при закрытии фрейма.

    @param primaryStage {@link #start(Stage)}
    */
   private static void setExit(Stage primaryStage) {
      FXApp.primStage = primaryStage;
      primaryStage.setOnCloseRequest(event -> {
         primaryStage.setAlwaysOnTop(false);
         primaryStage.setOpacity(0.5);
         exit();
         staticMess.info(SOURCE_CLASS, DECODER_UTF8.toAnotherEnc("Отработано:"), TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - TIME_START) + " min");
         System.exit(0);
      });
   }

   public void ftpChk(ActionEvent actionEvent) {
      Task<String> ftpS = new StartMePChess(3);
      try{
         MESSAGE_FX.infoNoTitles(ftpS.get());
      }
      catch(InterruptedException | ExecutionException e){
         MESSAGE_FX.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
   }

   /**
    Парсит {@link MoveMover#partyID} из {@link DBRegProperties#getProps()} по-имени {@link PartyNewIDParty}
    Если не смог - пытается взять из {@link FileProps}
    Если и это не получилось, идёт снова в {@link DBRegProperties}, но со-своим именем. {@link #SOURCE_CLASS}
    <p>
    После выгреба информации, отправляет 2 письма.
    <p><b>
    RCPT.add("143500@gmail.com");
    RCPT.add("olga-barchi@yandex.ru");</b>
    <p>
    Запуск {@link ControllerFXApp} с новым фреймом.

    @param actionEvent menu click
    @see ESender
    */
   @FXML
   private void loadPartyAct(ActionEvent actionEvent) {
      Future<?> submit = FXApp.EXECUTOR_SERVICE_S.submit(new HomePCFilesCheck());
      Object homePCCheckTask = null;
      try{
         homePCCheckTask = submit.get();
      }
      catch(ExecutionException | InterruptedException e){
         FXApp.MESSAGE_FX.out("FXApp_210", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         FXApp.MESSAGE_FX.errorAlert(FXApp.SOURCE_CLASS, e.getMessage(), "FXApp.loadPartyAct_210");
         Thread.currentThread().interrupt();
      }
      InitProperties initProperties = new DBRegProperties(ConstantsFor.APP_NAME + PartyNewIDParty.class.getSimpleName());
      Properties properties = initProperties.getProps();
      Long partyID = Long.parseLong(properties.getProperty("partyid"));
      if(homePCCheckTask!=null){
         textF.appendText(MessageFormat.format("{0}\n{1} is Party ID.\n{2}{3}\n{4}{5}{6}{7}{8}", homePCCheckTask, partyID, DECODER_UTF8.toAnotherEnc("Партия начата: "), new Date(partyID), DECODER_UTF8.toAnotherEnc("Программа стартовала: "), FXApp.TIME_START, DECODER_UTF8.toAnotherEnc(". Разница с началом партии аж: "), TimeUnit.MILLISECONDS.toHours(FXApp.TIME_START - partyID), DECODER_UTF8.toAnotherEnc(" часов.\n")));
      }
      List<String> col = new ArrayList<>();
      col.add("idchessboard");
      col.add("cellChar");
      col.add("cellInt");
      col.add("standing");
      initProperties = new DBRegProperties(ConstantsFor.APP_NAME + FXApp.SOURCE_CLASS);
      initProperties.delProps();
      DBaseFactory dBaseFactory = new DBaseFactory.Builder(new RegRuMysql(), "select * from chessboard" + partyID, col, true).build();
      try{
         Map<String, Object> call = dBaseFactory.call();
         FXApp.rcpt.add("143500@gmail.com");
         FXApp.rcpt.add("olga-barchi@yandex.ru");
         initProperties.setProps(properties);
         ESender eSender = new ESender(FXApp.rcpt, "Playing party ID " + partyID, call.toString().replaceAll(", ", "\n"));

         FXApp.EXECUTOR_SERVICE.execute(eSender);
      }
      catch(Exception e){
         FXApp.MESSAGE_FX.out("FXApp_155", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ").replaceAll("ru.vachok", ">>>>>>>>>ru.vachok")).getBytes());
         FXApp.MESSAGE_FX.errorAlert("FXApp", e.getMessage(), "FXApp.sendFigMoves_155");
      }
   }

   @FXML
   private void sendFigMoves(ActionEvent actionEvent) {
      throw ConstantsFor.NOT_READY;
   }

   /**
    Создаёт партию с новым ID

    @param actionEvent menu click
    @see StartMePChess#call()
    */
   @FXML
   private void newPartyAction(ActionEvent actionEvent) {
      Task<String> startMePChess = new StartMePChess(1);
      Future<?> future = Executors.newSingleThreadExecutor().submit(startMePChess);
      try{
         Object o = future.get();
         MESSAGE_FX.infoNoTitles(o.toString());
      }
      catch(Exception e){
         FXApp.MESSAGE_FX.errorAlert(FXApp.SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   /**
    Показать шахматную доску.

    @param actionEvent menu click
    */
   @FXML
   private void showBoard(ActionEvent actionEvent) {
      VisualBoardFX visualBoardFX = new VisualBoardFX(new Stage());
      FXApp.primStage.setOpacity(0.1);
      FXApp.primStage.toBack();
      visualBoardFX.run();

   }
}
