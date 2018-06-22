package ru.vachok.pbem.chess;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.emails.EChecker;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static ru.vachok.pbem.chess.utilitar.Utilit.*;


/**
 * <b>Стартовый</b>
 * <p>
 * <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>
 *
 * @since 19.06.2018 (21:29)
 */
@SuppressWarnings ("FeatureEnvy")
class StartMePChess {

   /**
    * Class Simple Name
    */
   private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();

   private static List<String> rcpt = new ArrayList<>();

   /**
    * Общение с пользователем.
    * {@link MessageToUser}
    */
   private static MessageToUser messageToUser = new MessageCons();

   /**
    * <b>Точка входа.</b>
    *
    * @param args null
    * @see Utilit#checkTime() Utilit#checkTime()Utilit#checkTime()
    */
   public static void main(String[] args) {
      Object call = null;
      String helloThere = toUTF(new Utilit().checkTime());
      messageToUser.info(SOURCE_CLASS, "main ID 16", helloThere);
      Callable mapA = new EChecker();
      try{ call = Executors.newSingleThreadExecutor().submit(mapA); }
      catch(Exception e){
         messageToUser.out("StartMePChess_61", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("StartMePChess", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      rcpt.add("143500@gmail.com");
      try{
         boolean isDone = (( Future ) call).isDone();
         String s = (( Future ) call).get().toString();
         boolean b = new EChecker().sendMail(rcpt, System.currentTimeMillis() + " " + isDone, s);
         if(b){ Utilit.exitWitnClean(0); }
         else{ Utilit.exitWitnClean(63); }
      }
      catch(InterruptedException | ExecutionException | NullPointerException e){
         messageToUser.out("StartMePChess_61", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("StartMePChess", e.getMessage(), Arrays.toString(e.getStackTrace()));
         Thread.currentThread().interrupt();
      }
   }

   /**
    * Определяем дальнейшие действия.
    */
   private static void whatNextToDo() {
      String s;
      Scanner scanner = new Scanner(System.in);
      messageToUser.infoNoTitles(toUTF("Введите комманду. Или нажмите h, для вызова помощи."));
      try{ scanner.next();}

      catch(NoSuchElementException e){
         messageToUser.out("StartMePChess_52", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         exitWitnClean(58);
      }
      while(scanner.hasNext()){
         s = scanner.nextLine();
         switch(s){
            case "get":
               break;
            case "h":
               helpMe(SOURCE_CLASS);
               break;
            case "exit":
               exitWitnClean(63);
               break;
            default:
               exitWitnClean(ConstantsFor.OK.ordinal());
         }
      }
   }
}