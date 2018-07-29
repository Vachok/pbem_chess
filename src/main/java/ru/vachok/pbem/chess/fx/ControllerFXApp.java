package ru.vachok.pbem.chess.fx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.FXApp;


/**
 * "Разгрузочный" класс для {@link FXApp}
 *
 * @since 12.07.2018 (10:21)
 */
public class ControllerFXApp {

   private static final String SOURCE_CLASS = ControllerFXApp.class.getSimpleName();
   /**
    * {@link FXApp#setExit(Stage)}
    */
   private Stage controlStage;

   /**
    * Графические сообщения.
    *
    * @see MessageFX
    */
   private final MessageToUser messageToUser = new MessageFX();

   public ControllerFXApp(FXMLLoader loader) {
      loader.setController(this);
      loader.setRoot(this);
   }

   /**
    * Точка входа в класс.
    *
    *
    * @param primStage {@link FXApp}
    */
   public void controlFX(Stage primStage) {
      primStage.setTitle("HELLO");
   }

   @FXML
   private void speedDBAction(ActionEvent actionEvent){
      FileChooser torqueCSVfChooser = new FileChooser();
      torqueCSVfChooser.setTitle("Выберите лог CSV");
      torqueCSVfChooser.showOpenDialog(controlStage);
   }

}