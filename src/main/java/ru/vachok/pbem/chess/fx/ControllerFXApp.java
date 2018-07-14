package ru.vachok.pbem.chess.fx;


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
   private MessageToUser messageToUser = new MessageFX();

   /**
    * Точка входа в класс.
    *
    *
    * @param primStage {@link FXApp}
    */
   public void controlFX(Stage primStage) {
      primStage.setTitle("HELLO");
      this.controlStage = primStage;
      controlStage.show();
   }

   /**
    * Стартует новую партию.
    * // todo 12.07.2018 (16:00)

    */
   private void newParty() {
      throw new UnsupportedOperationException("Not ready yet 12.07.2018 (16:00)");
   }
}