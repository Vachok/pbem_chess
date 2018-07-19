package ru.vachok.pbem.chess.vrtx;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.jdbc.JDBCClient;
import io.vertx.ext.sql.SQLClient;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.FileProps;
import ru.vachok.mysqlandprops.InitProperties;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;


/** //todo 12.07.2018 (15:43)
 * @since 27.06.2018 (1:09)
 */
public class VrtClientJDBC extends AbstractVerticle {

    /**
     * Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = VrtClientJDBC.class.getSimpleName();

    private InitProperties initProperties = new DbProperties("dbreg");

    private MessageToUser messageToUser = new MessageCons();

    @Override
    public String toString() {
        return "VrtClientJDBC{" +
              "context=" + context +
              ", initProperties=" + initProperties +
              ", messageToUser=" + messageToUser +
              ", SOURCE_CLASS='" + VrtClientJDBC.SOURCE_CLASS + '\'' +
              ", vertx=" + vertx +
              '}';
    }

    public void showSomething() {
        initProperties.getProps();
        Map<String, String> mapA = new ConcurrentHashMap<>();
        SQLClient sqlClient = getSQLClient();
        String sql = "select * from chessboard";
        SQLClient query = sqlClient.query(sql, event -> {
            try {
                Context orCreateContext = getVertx().getOrCreateContext();
                Object property = orCreateContext.get("srv");
                messageToUser.infoNoTitles(property.toString());
                String value = property.toString();
                mapA.put("srv", value);
            } catch (Exception e) {
                messageToUser.out("VrtClientJDBC_49", (e.getMessage()+"\n\n"+Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") +"\nVrtClientJDBC.showSomething, and ID (lineNum) is 49").getBytes());
                Thread.currentThread().interrupt();
            }
        });
        query.close();
        messageToUser.infoNoTitles(mapA.toString() + "   " + this.context.toString());
    }

    private SQLClient getSQLClient() {
        return JDBCClient.createShared(Vertx.vertx(), configJSON());
    }

    private JsonObject configJSON() {
        Properties properties = new Properties();
        try {
            properties = initProperties.getProps();
        } catch (Exception e) {
            initProperties = new FileProps("dbreg");
            messageToUser.errorAlert("Json JDBC object: ", e.getMessage(), initProperties.toString());
        }
        return new JsonObject()
                .put("url", properties.getProperty("srv"))
                .put("driver_class", properties.getProperty("driver"))
                .put("user", properties.getProperty("user"))
                .put("password", properties.getProperty("password"))
                .put("max_pool_size", 30);
    }

}