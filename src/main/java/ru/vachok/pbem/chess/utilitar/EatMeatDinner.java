package ru.vachok.pbem.chess.utilitar;

import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.pbem.chess.emails.EChecker;
import ru.vachok.pbem.chess.emails.ESender;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
    private void sendDB(Map<String,Double> npMap) throws MalformedURLException, UnsupportedEncodingException {
        //todo VERTX 26.06.2018 (17:06)
        sendMail();
    }
    public void sendMail()  {
        EChecker eChecker = new EChecker();
        List<String> rcpt = new ArrayList<>();
        String s = showPit().replaceAll(", ", "\n");
        s=s.replaceAll("}  ", "\n");
        rcpt.add("ikudryashov@velkomfood.ru");
        rcpt.add("dpetrov@velkomfood.ru");
        eChecker.sendMail(rcpt, "Eat/ZaPit", s);
    }
}
// at 26.06.2018 (14:56)