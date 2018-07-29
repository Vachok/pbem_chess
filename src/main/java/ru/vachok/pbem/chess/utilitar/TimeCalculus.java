package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.DbProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


/**
 * Калькулятор времени
 *
 * @since 15.05.2018 (1:52)
 */
public class TimeCalculus {

   /**
    * Год рождения.
    */
   private static final int YEAR_OF_BIRTH = 1984;

   /**
    * Simple Name класса
    */
   private static final String SOURCE_CLASS = TimeCalculus.class.getSimpleName();

   /**
    * Взаимодействие с пользователем.
    *
    * @see MessageToUser
    */
   private static final MessageToUser messageToUser = new MessageCons();

   /**
    * {@link Properties}
    *
    * @see DbProperties
    */
   private InitProperties initProperties = new DBRegProperties(ConstantsFor.APP_NAME+SOURCE_CLASS);

   private final Properties properties = initProperties.getProps();


   /**
    * @return отсчёт часов от <b>07.01.1984 (02:00)</b>
    */
   @Override
   public String toString() {
      Long lastS = Long.parseLong(properties.getProperty("lasts"));
      Date dateLastS = new Date(lastS);
      String unixToHumanTime = System.currentTimeMillis() + " is " + new Date();
      Calendar calendar = new Calendar.Builder().setDate(YEAR_OF_BIRTH, 1, 7).build();
      Date date = calendar.getTime();
      long l1 = date.getTime() + TimeUnit.HOURS.toMillis(2);
      long myLivedAlready = System.currentTimeMillis() - l1;
      String myTime = l1 + " is " + new Date(l1);
      properties.setProperty("life", String.valueOf(myLivedAlready));
      properties.setProperty("birth", String.valueOf(l1));
      String timeRString = timeR();
      initProperties.setProps(properties);
      messageToUser.out(SOURCE_CLASS, (myTime + " is myTime " + TimeUnit.MILLISECONDS.toHours(myLivedAlready) + "\n" + unixToHumanTime).getBytes());
      initProperties = new FileProps(SOURCE_CLASS);
      initProperties.setProps(properties);
      return "\nWeek " + timeRString + "\n" + TimeUnit.MILLISECONDS.toHours(myLivedAlready) + " hrs already lived...( " + dateLastS + " or " + TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - dateLastS.getTime()) + " min)\n" + myTime + "\n" + unixToHumanTime;
   }

   /**
    * Таймер, до какого-либо события. Пока без настроек.
    * <p>
    * След. событие - полёт в Черногорию.
    *
    * @return кол-во минут
    */
   private String timeR() {
      long l = TimeUnit.DAYS.toMinutes(5);
      DayOfWeek fri = DayOfWeek.of(5);
      DayOfWeek dayOfWeekNow = LocalDate.now().getDayOfWeek();
      int i = fri.compareTo(dayOfWeekNow);

      LocalDateTime timerFor = LocalDateTime.of(2018, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth() + i, 17, 30, 0);
      long myI = LocalDateTime.now().until(timerFor, ChronoUnit.MINUTES);
      String s = myI + "";
      float perOfWeek = (( float ) myI / ( float ) l) * 100;
      s = s + " (" + perOfWeek + "%)";
      messageToUser.infoNoTitles(s);
      properties.setProperty("weekend", s);
      messageToUser.info(SOURCE_CLASS, "Initiator Props is ", initProperties.toString());
      return s;
   }
}
