package ru.vachok.pbem.chess;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.emails.EChecker;
import ru.vachok.pbem.chess.emails.ESender;
import ru.vachok.pbem.chess.emails.MailWorksLocal;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;
import ru.vachok.pbem.chess.vrtx.VrtClientJDBC;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static ru.vachok.pbem.chess.utilitar.Utilit.toUTF;


/**
 * <b>Стартовый</b>
 * <p>
 * <a href="http://chess.vachok.ru/" target=_blank>Gradle SCAN</a>
 *
 * @since 19.06.2018 (21:29)
 */
class StartMePChess {

   /**
    * Class Simple Name
    */
   private static final String SOURCE_CLASS = StartMePChess.class.getSimpleName();

   /**
    * Лист адресатов, если надо отправить.
    */
   private static final List<String> RCPT = new ArrayList<>();

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
   public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
      ExecutorService executorService = Executors.newSingleThreadExecutor();
      Object callOBJ = new Object();
      String helloThere = toUTF(new Utilit().checkTime());
      messageToUser.info(SOURCE_CLASS, "main ID 16", helloThere);
      Runnable mapA = new EChecker();
      executorService.submit(mapA);
      RCPT.add("143500@gmail.com");
      String s = callOBJ.toString();
      if(s.toLowerCase().contains("gettome:")){
         Pattern p = Pattern.compile("chess.vachok.ru");
         Matcher m = p.matcher(s);
         while(m.find()) s = p.toString();
         new ESender().sendMe(s);
      }
      else{
         vtrGo();
         Utilit.exitWitnClean(ConstantsFor.WARN);
      }
   }

   private static void vtrGo() {
      VrtClientJDBC vrtClientJDBC = new VrtClientJDBC();
      vrtClientJDBC.showSomething();
      File file = new File("VrtClientJDBC.properties");
      String fileStr = file.getAbsolutePath();
      if(file.exists()){
         try{
            fileStr = FileUtils.readFileToString(file, "UTF-8");
         }
         catch(IOException e){
            messageToUser.out("StartMePChess_90", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", " ")).getBytes());
            messageToUser.errorAlert("StartMePChess", e.getMessage(), Arrays.toString(e.getStackTrace()));
         }
      }
      boolean eChecker = new EChecker().sendMail(RCPT, SOURCE_CLASS + " now " + new Date(), fileStr);
      messageToUser.info(SOURCE_CLASS, "mail is ", eChecker + " " + new Date());
   }

   private static void mapMail(Map<String, String> callOBJ) {
      Map<String, String> call = callOBJ;
      try{
         boolean isDone = call!=null && (( Future ) call).isDone();
         String s = call!=null? call.toString(): null;
         messageToUser.infoNoTitles(s);
         if(Objects.requireNonNull(s).toLowerCase().contains("sendtome")){
            boolean b = new EChecker().sendMail(RCPT, System.currentTimeMillis() + " " + isDone, s);
            if(b){ messageToUser.errorAlert("Utilit", "exitWitnClean", "0"); }
         }
         else{ new MailWorksLocal(call);}
      }
      catch(NullPointerException e){
         messageToUser.out("StartMePChess_61", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("StartMePChess", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }
}