package ru.vachok.pbem.chess.utilitar;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;


/**
 * Курс ЕВРО и Доллара США на сегоня.
 *
 * @since 04.05.2018 (14:35)
 */
public class KursToday implements Runnable {

   private static final String SOURCE_CLASS = "KursToday";

   /**
    * Размер массива, для хранения курсов.
    *
    * @see #parseFile()
    */
   private static final int ARRAY_LEN = 60;

   /**
    * {@link MessageToUser}
    */
   private static MessageToUser messageToUser = new MessageCons();

   private static InitProperties initPropertiesStat = new DbProperties(KursToday.class.getTypeName());

   /**
    * Скаченный файл с сервера.
    *
    * @see #getXmlFile()
    * @see #parseFile()
    */
   private File fileCbrRuRaw = new File("cbr.xml");

   /**
    * Отфильтрованный файл с курсами.
    */
   private File fileCurr = new File("curr.xml");

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
      getXmlFile();
   }

   /**
    * Скачивает страницу <code>https://www.cbr.ru/currency_base/daily.aspx?date_req="сегодняшняя дата"</code>.
    * <p>
    * Дату делает из 3х {@link Integer}, полученных из {@link MonthDay}, {@link YearMonth} {@link Year}.
    * В зависимости от числа, прибавляет в {@link URL} <code>0</code>.
    */
   private void getXmlFile() {
      int dayNow = MonthDay.now().getDayOfMonth();
      int yearMonth = YearMonth.now().getMonthValue();
      Year year = Year.now();

      String zero = "0";
      if(dayNow >= 10) zero = "";

      String dotZero = ".0";
      if(yearMonth >= 10) dotZero = ".";

      String dateTodayWithDots = zero + dayNow + dotZero + yearMonth + "." + year;
      try{
         URL url = new URL("https://www.cbr.ru/currency_base/daily.aspx?date_req=" + dateTodayWithDots);
         InputStream cbrInStream = url.openStream();
         FileUtils.copyInputStreamToFile(cbrInStream, fileCbrRuRaw);
         parseFile();
      }
      catch(Exception e){
         messageToUser.out("KursToday_103", (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.getXmlFile, and ID (lineNum) is 103").getBytes());
      }

   }

   /**
    * Парсит файл {@link #fileCbrRuRaw}.
    * <p>
    */
   private void parseFile() {
      String cbrRuString;
      String currencyAll = "";
      try{
         cbrRuString = FileUtils.readFileToString(fileCbrRuRaw, ConstantsFor.UTF_8);
         String[] filteredFile = Objects.requireNonNull(cbrRuString).split("</h2><table class=\"data\"><tbody><tr><th>");
         currencyAll = filteredFile[1];
      }
      catch(IOException e){
         messageToUser.out("KursToday_119", (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.parseFile, and ID (lineNum) is 119").getBytes());
      }
      currencyAll = currencyAll.replaceAll("<td>", "");
      currencyAll = currencyAll.replaceAll("</tr>", "");
      currencyAll = currencyAll.replaceAll("<tr>", "");
      currencyAll = currencyAll.replaceAll("</td>", "");
      String[] usdAndE = currencyAll.split("USD");
      char[] curDEChars = new char[ARRAY_LEN];
      try{ usdAndE[1].getChars(0, ARRAY_LEN, curDEChars, 0);}
      catch(ArrayIndexOutOfBoundsException e){
         messageToUser.errorAlert(SOURCE_CLASS, "parseFile ID 127", Utilit.toUTF("ПРОВЕРЬТЕ ВАШ ДОСТУП К СЕТКЕ!"));
      }
      Map<Integer, Character> characterConcurrentHashMap = new ConcurrentHashMap<>();
      for(int i = 0; i < ARRAY_LEN; i++){ characterConcurrentHashMap.put(i, curDEChars[i]); }
      BiConsumer<Integer, Character> integerCharacterBiConsumer = (x, y) -> {
         try{
            FileUtils.write(fileCurr, y.toString(), ConstantsFor.UTF_8, true);
         }
         catch(IOException e){
            messageToUser.out("KursToday_135", (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.parseFile, and ID (lineNum) is 135").getBytes());
         }
      };
      characterConcurrentHashMap.forEach(integerCharacterBiConsumer);
      parsingList();
   }

   /**
    * Находит курсы в {@link #fileCbrRuRaw}.
    * <p>
    * Построчно читает его в {@link List } <code>stringList</code>.
    * Парсит {@link Double} из него, через {@link Consumer} <code>stringConsumer</code>.
    * Первые 2 числа - курсы доллар и евро. Т.к. {@link #parseFile()}, уже произвёл очистку от "мусора".
    * <p>
    * Запускает {@link #sendToDataBase(Double, Double)}
    */
   private void parsingList() {
      List<String> stringList = null;
      try{stringList = FileUtils.readLines(fileCurr, ConstantsFor.UTF_8); }
      catch(IOException e){
         messageToUser.errorAlert(SOURCE_CLASS, "parsingList ID 144", e.getMessage());
      }
      List<Double> xFList = new ArrayList<>();
      Double usdCur;
      Double euroCur;
      Consumer<String> stringConsumer = x -> {
         x = x.replace(",", ".");
         try{
            Double d = Double.parseDouble(x);
            if(!d.isNaN() && d!=1.0 && d!=978.0 && d!=356.0){xFList.add(d);}
         }
         catch(NumberFormatException e){
            messageToUser.out("KursToday_163", (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.parsingList, and ID (lineNum) is 163").getBytes());
         }
      };
      for(String s : Objects.requireNonNull(stringList)){
         stringConsumer.accept(s);
      }
      try{
         List<Double> currency = new ArrayList<>();
         for(int i = 0; i < 2; i++){
            currency.add(xFList.get(i));
         }
         usdCur = Math.min(currency.get(0), currency.get(1));
         euroCur = Math.max(currency.get(0), currency.get(1));
         sendToDataBase(usdCur, euroCur);
      }
      catch(IndexOutOfBoundsException e){
         messageToUser.out(SOURCE_CLASS, (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.parsingList, and ID (lineNum) is 177").getBytes());
      }
   }

   /**
    * Отправляет курсы в БД на РЕГ.РУ
    * <p>
    * Схема <code>liferpg.rez</code>
    *
    * @param usdCur  курс доллара США.
    * @param euroCur курс ЕВРО.
    */
   private void sendToDataBase(Double usdCur, Double euroCur) {
      DataConnectTo dataConnectTo = new RegRuMysql();

      String sqlStr = "insert into u0466446_liferpg.rez (Timestamp, Rez, PC) values (?,?,?) ;";
      try(Connection connection = dataConnectTo.getDataSource().getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement(sqlStr)
      ){
         preparedStatement.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
         preparedStatement.setString(2, usdCur + " usd," + euroCur + " euro");
         preparedStatement.setString(3, "curr");
         preparedStatement.executeUpdate();
      }
      catch(Exception e){
         messageToUser.errorAlert(SOURCE_CLASS, "sendToDataBase ID 188", e.getMessage());
      }
      try{
         sendToProperties(usdCur, euroCur);
         FileUtils.forceDeleteOnExit(fileCbrRuRaw);
         FileUtils.forceDeleteOnExit(fileCurr);
      }
      catch(IOException e){
         messageToUser.out("KursToday_203", (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.sendToDataBase, and ID (lineNum) is 203").getBytes());
      }
   }

   /**
    * Выгрузка курсов в локальный файл. new {@link FileOutputStream}<code>(this.getClass().getTypeName() + ".properties"))</code>.
    *
    * @param usd  курс доллара
    * @param euro курс евро
    */
   private void sendToProperties(Double usd, Double euro) {
      Properties properties = initPropertiesStat.getProps();
      messageToUser.info(SOURCE_CLASS, "sendToProperties ID 214", properties.toString());
      if(properties.isEmpty()) properties = new Properties();
      properties.setProperty("USD", usd.toString());
      properties.setProperty("EURO", euro.toString());

      try(FileOutputStream fileOutputStream = new FileOutputStream(this.getClass().getTypeName() + ".properties")){
         String s = "Сегодня курсы такие...";
         properties.store(fileOutputStream, s);
      }
      catch(IOException e){
         messageToUser.out("KursToday_224", (Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nKursToday.sendToProperties, and ID (lineNum) is 224").getBytes());
      }

   }
}