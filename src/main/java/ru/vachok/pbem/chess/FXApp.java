package ru.vachok.pbem.chess;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.fx.ControllerFXApp;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static javafx.application.Platform.exit;
import static ru.vachok.pbem.chess.utilitar.Utilit.toUTF;


/**FX Applicanion start.
 * Запуск с аргуметнтом -nofx запустит консольную версию.
 * @since 30.06.2018 (9:30)
 */
public class FXApp extends Application {

   private static final String SOURCE_CLASS = FXApp.class.getSimpleName();

   /**
    * TimeStamp старта приложения
    */
   private static final long TIME_START = System.currentTimeMillis();

   /**
    * Статичные сообщения. В консоль.
    */
   private static MessageToUser staticMess = new MessageCons();

   /**
    * Класс - консольная версия.
    */
   private static StartMePChess startMePChess = new StartMePChess();

   /**
    * Графические сообщения
    */
   private MessageToUser messageToUser = new MessageFX();

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
            else{ if(s.contains("nofx")) StartMePChess.noFX(); }

         }
      }
   }

   /** Старт главного экрана.
    * ru/vachok/pbem/chess/FXApp.fxml - FXML.
    * Так-же устанавливает действие при закрытии фрейма.
    * @see #setExit(Stage)
    * @param primaryStage {@link Stage}
    */
   @Override
   public void start(Stage primaryStage) {
      Group group;
      Scene sceneOne;
      try{
         group = FXMLLoader.load(getClass().getResource("FXApp.fxml"));
         sceneOne = new Scene(group);
         primaryStage.setScene(sceneOne);
      }
      catch(Exception e){
         FXApp.staticMess.out("FXApp_29", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         FXApp.staticMess.errorAlert("FXApp", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      primaryStage.show();
      FXApp.setExit(primaryStage);
   }

   /**Установка действий при закрытии фрейма.
    * Запуск {@link ControllerFXApp}
    *
    * @param primaryStage {@link #start(Stage)}
    */
   private static void setExit(Stage primaryStage) {
      primaryStage.setOnCloseRequest(event -> {
         primaryStage.setAlwaysOnTop(false);
         primaryStage.setOpacity(0.5);
         exit();
         staticMess.info(SOURCE_CLASS, toUTF("Отработано:"), TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - TIME_START) + " min");
         System.exit(0);
      });
      new ControllerFXApp().controlFX(primaryStage);
   }

   /**
    * Стартует новую партию.
    * {@link StartMePChess#getOneNewParty()}
    *
    * @param actionEvent нажатие на пункт меню.
    */
   @FXML
   private void newPartyAction(ActionEvent actionEvent) {
      FXApp.startMePChess = new StartMePChess();
      Runnable oneNewParty = FXApp.startMePChess.getOneNewParty();
      oneNewParty.run();
   }
}
