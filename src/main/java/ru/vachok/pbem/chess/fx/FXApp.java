package ru.vachok.pbem.chess.fx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;

import java.util.Arrays;


/**
 * @since 30.06.2018 (9:30)
 */
public class FXApp extends Application {

   private static MessageToUser messageToUser = new MessageFX();

   public static void main(String[] args) {
      launch(args);
   }

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
         MessageToUser msuCon = new MessageCons();
         msuCon.out("FXApp_29", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         msuCon.errorAlert("FXApp", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      primaryStage.show();
   }
}
