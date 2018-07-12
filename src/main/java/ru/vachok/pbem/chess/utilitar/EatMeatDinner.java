package ru.vachok.pbem.chess.utilitar;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @since 26.06.2018 (14:56)
 */
public class EatMeatDinner implements MyEat {

    @Override
    public String showPit() {
        new ConcurrentHashMap<>();
        Map<String, Double> npMap = fileRead();
        Collection<Double> values = npMap.values();
        Double sumD = 0.0;
        for (Double d:values){
            sumD+=d;
        }
        return npMap.toString()+"\n price is - "+sumD;
    }

    private void sendDB(Map<String, Double> npMap) {
        //todo VERTX 26.06.2018 (17:06)
        sendMail();
    }

    public void sendMail()  {
        List<String> rcpt = new ArrayList<>();
        String s = showPit().replaceAll(", ", "\n");
        s=s.replaceAll("}  ", "\n");
        rcpt.add("ikudryashov@velkomfood.ru");
    }
}
