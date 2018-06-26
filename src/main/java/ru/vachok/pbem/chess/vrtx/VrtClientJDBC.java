package ru.vachok.pbem.chess.vrtx;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLClient;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import static io.vertx.core.Vertx.vertx;


/**
 * @since 27.06.2018 (1:09)
 */
public class VrtClientJDBC extends AbstractVerticle {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = VrtClientJDBC.class.getSimpleName();

   private InitProperties initProperties = new DbProperties("dbreg");

   private MessageToUser messageToUser = new MessageCons();

   public void showSomething() {
      initProperties.getProps();
      Map<String, String> mapA = new ConcurrentHashMap<>();
      JDBCClient jdbcClient = vJDBCx();
      String sql = "select * from properties";
      Properties properties = initProperties.getProps();
      SQLClient query = jdbcClient.query(sql, event -> {
         try{
            Context orCreateContext = getVertx().getOrCreateContext();
            Object property = orCreateContext.get("srv");
            messageToUser.infoNoTitles(property.toString());
            String value = property.toString();
            mapA.put("srv", value);
         }
         catch(Exception e){
            properties.setProperty("e", e.getMessage());
         }
      });
      query.close();
      messageToUser.infoNoTitles(mapA.toString());
   }

   public JDBCClient vJDBCx() {
      Properties properties = initProperties.getProps();
      final JDBCClient jdbcClient = JDBCClient.createShared(vertx(), new JsonObject()
            .put("url", properties.getProperty("srv"))
            .put("driver_class", properties.getProperty("driver"))
            .put("max_pool_size", 10)
            .put(properties.getProperty("user"), "RO")
            .put("password", properties.getProperty("password")));
      initProperties = new FileProps(SOURCE_CLASS);
      initProperties.setProps(properties);
      return jdbcClient;
   }
}