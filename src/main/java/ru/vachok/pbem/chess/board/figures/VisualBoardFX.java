package ru.vachok.pbem.chess.board.figures;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import ru.vachok.messenger.MessageFX;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.FXApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static ru.vachok.pbem.chess.utilitar.Utilit.toW1251;


/**
 * @since 13.07.2018 (1:27)
 */
public class VisualBoardFX implements Runnable {

   FXMLLoader loader = new FXMLLoader(getClass().getResource("VisualBoardFX.fxml"));

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = VisualBoardFX.class.getSimpleName();

   private final MessageToUser messageToUser = new MessageFX();

   /**
    * {@link FXApp}
    */
   private final Stage boardStage;

   @FXML
   private ImageView imageV;

   public VisualBoardFX(Stage boardStage) {
      this.boardStage = boardStage;
   }

   /**
    * When an object implementing interface <code>Runnable</code> is used
    * to create a thread, starting the thread causes the object's
    * <code>run</code> method to be called in that separately executing
    * thread.
    * <p>
    * The general contract of the method <code>run</code> is that it may
    * take any action whatsoever.
    *
    * @see Thread#run()
    */
   @Override
   public void run() {

      showStartBoard();
   }

   /**
    * Показывает стандартную доску и расположение фигур
    */
   private void showStartBoard() {
      try{
         Group group = loader.load();
         Scene scene = new Scene(group);
         boardStage.setScene(scene);
      }
      catch(IOException e){
         messageToUser.out(SOURCE_CLASS, Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n").getBytes());
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), toW1251("Смотри: \n") + new File(SOURCE_CLASS + ".prn").getAbsolutePath());
      }
      boardStage.setTitle(toW1251("Расположение фигур. Начало партии"));
      boardStage.setOnCloseRequest(event -> {
         Stage primStage = new FXApp().getPrimStage();
         primStage.toFront();
         primStage.setOpacity(1.0);
      });
      Image image = getImage();
      imageV.setImage(image);
      boardStage.showAndWait();
   }

   private Image getImage() {
      try(InputStream inputStream = new FileInputStream("G:\\My_Proj\\fl\\pbem_chess\\src\\main\\resources\\depositphotos_36903757-stock-illustration-chess-board-with-chess-pieces.jpg")){
         Image image = new Image(inputStream);
         return image;
      }
      catch(IOException e){
         messageToUser.out("VisualBoardFX_86", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
         messageToUser.errorAlert("VisualBoardFX", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      throw new NullPointerException("NO IMAGE 13.07.2018 (2:47)");
   }
}