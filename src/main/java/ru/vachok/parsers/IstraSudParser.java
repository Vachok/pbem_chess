package ru.vachok.parsers;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.A161Mysql;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


public class IstraSudParser implements InternetSiteParser {

   private static final String SOURCE_CLASS = IstraSudParser.class.getSimpleName();

   private MessageToUser messageToUser = new MessageCons();

   private String month = "10";

   private Collection<URL> daysUrl = new ArrayList<>();

   @Override
   public void getUrl() {
      URL siteURL;
      for(int i = 0; i < 32; i++){
         if(i!=0){
            String day;
            if(i < 10){ day = "0" + i; }
            else{ day = i + ""; }
            try{
               siteURL = new URL(String.format("https://istra--mo.sudrf.ru/modules.php?name=sud_delo&srv_num=1&H_date=%s.%s.2018", day, month));
               daysUrl.add(siteURL);
            }
            catch(MalformedURLException e){messageToUser.errorAlert(IstraSudParser.SOURCE_CLASS, "err id 58", e.getMessage());}
         }
      }
      dnldSites();
   }

   @Override
   public void dnldSites() {
      messageToUser.infoNoTitles(daysUrl.toString().replaceAll(", ", "\n"));
      for(URL u : daysUrl){
         try(InputStream inputStream = u.openStream();){
            String s = new String(inputStream.readAllBytes(), ConstantsFor.W1251);
            messageToUser.info(IstraSudParser.SOURCE_CLASS, "URL added ", u.toString());
            File file = new File(month);
            FileUtils.writeStringToFile(file, s, "Windows-1251", true);
         }
         catch(IOException e){
            messageToUser.out("SiteParseTest_49", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
            messageToUser.errorAlert("IstraSudParser", e.getMessage(), Arrays.toString(e.getStackTrace()));
         }
      }
      docsParser();
   }

   @Override
   public void docsParser() {
      File fileLoc;
      String sql = "insert into sud (monthNum, stringval) values (?,?)";
      try(Connection c = new A161Mysql("testb").getDataSource().getConnection();
          PreparedStatement ps = c.prepareStatement(sql)){
         for(int i1 = 0; i1 < 11; i1++){
            fileLoc = new File("0" + i1);
            if(fileLoc.getName().contains("00")) continue;
            List<String> stringList1 = new LinkedList<>();
            try{
               stringList1 = FileUtils.readLines(fileLoc, "Windows-1251");
            }
            catch(IOException e){messageToUser.errorAlert(IstraSudParser.SOURCE_CLASS, "err id 81", e.getMessage());}
            for(String s : stringList1){
               ps.setString(1, fileLoc.getName());
               ps.setString(2, s);
               ps.executeUpdate();
            }
            Collections.sort(stringList1);
         }
      }
      catch(SQLException e){messageToUser.errorAlert(IstraSudParser.SOURCE_CLASS, "err id 90", e.getMessage());}
   }
}
// at 09.07.2018 (10:44)