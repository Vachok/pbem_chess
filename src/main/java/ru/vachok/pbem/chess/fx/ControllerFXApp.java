package ru.vachok.pbem.chess.fx;


import javafx.stage.Stage;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;


public class ControllerFXApp {

   private static final String SOURCE_CLASS = ControllerFXApp.class.getSimpleName();

   private static Stage controlStage;

   private MessageToUser messageToUser = new MessageFX();

   public void controlFX(Stage primStage) {
      primStage.setTitle("HELLO");
      ControllerFXApp.controlStage = primStage;
   }

   private void newParty() {
      throw new UnsupportedOperationException("Not ready yet");
   }
}
// at 12.07.2018 (10:21)