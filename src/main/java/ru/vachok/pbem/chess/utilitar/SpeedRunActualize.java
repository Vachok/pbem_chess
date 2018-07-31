package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;
import ru.vachok.pbem.chess.FXApp;
import ru.vachok.pbem.chess.board.MoveStarter;
import ru.vachok.pbem.chess.emails.MailMessages;

import javax.mail.Message;
import javax.mail.MessagingException;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.concurrent.*;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 <b>Добавляет данные о ср. скорости в базу.</b>
 <p>
 В данной реализации из e-mail. {@link #run()}

 @see MoveStarter
 @see UserAns
 @see FXApp
 @since 27.07.2018 (21:15) */
public class SpeedRunActualize implements Runnable {

   private static final String SOURCE_CLASS = SpeedRunActualize.class.getSimpleName();

   private static final DataConnectTo DATA_CONNECT_TO = new RegRuMysql();

   private static final Connection DEF_CON = DATA_CONNECT_TO.getDefaultConnection("u0466446_liferpg");

   private final MessageToUser messageToUser = new MessageCons();

   /**
    0. Запуск
    .1 {@link #getMailMessages()}
    .2 {@link #checkDates(Map)}

    @see MailMessages
    */
   @Override
   public void run() {
      Thread.currentThread().setName("SpeedRunActualize.run");
      Map<Date, String> mailMessages = getMailMessages();
      messageToUser.infoNoTitles(mailMessages.toString());
      checkDates(mailMessages);
   }

   /**
    <h2>{@link Map}инг почты</h2>

    @return {@link Map} сообщений, с темой speed: , где ключ = {@link Date}, а значение сообщение, как {@link String}
    */
   private Map<Date, String> getMailMessages() {
      Callable<Message[]> mailCall = new MailMessages();
      ExecutorService executorService = Executors.newCachedThreadPool();
      Future<Message[]> submit = executorService.submit(mailCall);
      Map<Date, String> mailMessagesMap = new HashMap<>();
      try{
         Message[] mailMsg = submit.get();
         for(Message mail : mailMsg){
            if(mail.getSubject()!=null){
               if(mail.getSubject().toLowerCase().contains("speed:")){
                  mailMessagesMap.put(mail.getSentDate(), mail.getSubject().toLowerCase().replaceFirst("\\Qspeed:\\E", ""));
               }
               if(mail.getSubject().toLowerCase().contains("speed: ")){
                  mailMessagesMap.put(mail.getSentDate(), mail.getSubject().toLowerCase().replaceFirst("\\Qspeed:\\E", ""));
               }
            }
         }
         return mailMessagesMap;
      }
      catch(MessagingException | ExecutionException | InterruptedException e){
         messageToUser.errorAlert(SOURCE_CLASS, "ID - 80", e.getMessage());
         Thread.currentThread().interrupt();
      }
      throw new UnsupportedOperationException("27.07.2018 (16:33), ***************I CANT MAKE THIS ORDER, SORRY MAN! *********************" +
            "\n\n" + "*****************     ru.vachok.pbem.chess.utilitar.SpeedRunActualize.getMailMessages      ******************************");
   }

   /**
    <h2>Проверка наличия записей в БД</h2>
    {@link #sendSpeed(Map)}

    @param mailMessagesMap {@link #getMailMessages()}, проверенная по-датам.
    */
   private void checkDates(Map<Date, String> mailMessagesMap) {
      Set<Date> dates = mailMessagesMap.keySet();
      Map<Date, String> sendDB = new HashMap<>();
      DATA_CONNECT_TO.getSavepoint(DEF_CON);
      try(PreparedStatement p = DEF_CON.prepareStatement("select * from speed");
          ResultSet rs = p.executeQuery()){
         for(Date d : dates){
            while(rs.next()){
               Timestamp timeStamp = rs.getTimestamp("TimeStamp");
               long timeMessageSent = d.getTime();
               long timeInDB = timeStamp.getTime();
               long l = TimeUnit.MILLISECONDS.toHours(timeInDB - timeMessageSent);
               if(l <= 24){
                  messageToUser.infoNoTitles(l + " hrs");
                  sendDB.put(d, mailMessagesMap.get(d));
               }
            }
         }
         messageToUser.info(SOURCE_CLASS, "Map<Date, String> sendDB", sendDB.size() + ".");
         sendSpeed(sendDB);
      }
      catch(SQLException e){
         DATA_CONNECT_TO.setSavepoint(DEF_CON);
         messageToUser.errorAlert(SOURCE_CLASS, "ID - 58", e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()));
      }
   }

   /**
    <h2>Отправка в БД</h2>

    @param toDB {@link #checkDates(Map)} фильтрованный.
    @see MailMessages
    */
   private void sendSpeed(Map<Date, String> toDB) {
      messageToUser.infoNoTitles("StartMePChessOnBoardTest.sendSpeed");
      messageToUser.infoNoTitles("toDB = [" + toDB + "]");
      BiConsumer<Date, String> biConsumer = (x, y) -> {
         double avSpeed = Double.parseDouble(y.split(" ")[0]);
         Date dateL = x;
         Date time = Calendar.getInstance().getTime();
         int weekDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
         long i = TimeUnit.MILLISECONDS.toMinutes(time.getTime() - dateL.getTime());
         messageToUser.info("dateL.compareTo(time)", i + " ?", "insert into speed (Speed, Road, WeekDay, TimeSpend) values (?,?,?,?)");
         double timeSpend = 0.0;
         Integer road = Integer.valueOf(y.split(" ")[1]);
         if(road==1) timeSpend = (ConstantsFor.NRIGA / avSpeed) * 60;
         if(road==0) timeSpend = (ConstantsFor.A107 / avSpeed) * 60;
         try(PreparedStatement ps = DEF_CON.prepareStatement("insert into speed (Speed, Road, WeekDay, TimeSpend) values (?,?,?,?)");
             PreparedStatement p = DEF_CON.prepareStatement("SELECT speed.TimeStamp FROM u0466446_liferpg.speed order by idspeed desc limit 1;");
             ResultSet r = p.executeQuery()){
            long timeStampDB = 0;
            while(r.next()){
               if(r.last()){
                  long l = r.getTimestamp("TimeStamp").getTime();
                  timeStampDB = TimeUnit.MILLISECONDS.toMinutes(x.getTime() - l);
               }

            }
            ps.setDouble(1, avSpeed);
            messageToUser.infoNoTitles(avSpeed + "");

            ps.setInt(2, road);
            messageToUser.infoNoTitles(road + "");

            ps.setInt(3, weekDay);
            messageToUser.infoNoTitles(weekDay + "");

            ps.setDouble(4, timeSpend);
            messageToUser.infoNoTitles(timeSpend + "");
            long iL = (24 * 60);
            if(timeStampDB >= iL){ ps.executeUpdate(); }
            else{ throw new RejectedExecutionException("Transcended to small - " + timeStampDB + "/" + iL); }
         }
         catch(SQLException e){
            DATA_CONNECT_TO.setSavepoint(DEF_CON);
            messageToUser.errorAlert(SOURCE_CLASS, "ID - 110",
                  e.getMessage() + "\n\n" +
                        Arrays.toString(e.getStackTrace()).replaceAll(", ", " ").replace("{", "").replace("}", ""));
         }
      };
      toDB.forEach(biConsumer);
      new MailMessages(true).call();
   }

   /**
    <h2>Выборка среднего при езде по Бетонке.</h2>
    */
   public void byA107() {
      try(PreparedStatement ps = DEF_CON.prepareStatement("select * from speed where Road = 0");
          ResultSet r = ps.executeQuery()){
         /*107*/
         int ind = 0;
         double speedAv = 0.0;
         double timeAv = 0.0;
         while(r.next()){
            ind++;
            speedAv += r.getDouble("Speed");
            timeAv += r.getDouble("TimeSpend");
         }
         ConstantsFor.MESSAGE_LOG.info("Time and speed. byA107.", (speedAv / ind) + " speed", (timeAv / ind) + " time. Counter = " + ind);
         rigA();
      }
      catch(SQLException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, (SOURCE_CLASS + "\n" + e.getMessage() + "\n\n\n"
                                                                  + Arrays.toString(e.getStackTrace()).replaceAll(", ",
               "\n").replace("{", "").replace("}", "")));
      }
   }

   /**
    <h2>Выборка среднего при езде по Новориге.</h2>
    */
   private void rigA() {
      try(PreparedStatement ps1 = DEF_CON.prepareStatement("select * from speed where Road = 1");
          ResultSet r1 = ps1.executeQuery()){
         /*Riga*/
         double speedAv = 0.0;
         double timeAv = 0.0;
         int ind = 0;
         while(r1.next()){
            ind++;
            speedAv += r1.getDouble("Speed");
            timeAv += r1.getDouble("TimeSpend");
         }
         ConstantsFor.MESSAGE_LOG.info("Time and speed. NovoRiga.", (speedAv / ind) + " speed", (timeAv / ind) + " time. Counter = " + ind);
      }
      catch(SQLException e){
         Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, (SOURCE_CLASS + "\n" + e.getMessage() + "\n\n\n"
                                                                  + Arrays.toString(e.getStackTrace()).replaceAll(", ",
               "\n").replace("{", "").replace("}", "")));
      }
   }

}