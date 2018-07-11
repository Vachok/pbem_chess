package ru.vachok.pbem.chess.utilitar;

import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public interface MyEat {

    default Map<String, Double> fileRead() {
        String pathname = new Utilit().checkTime().split(" ")[1].replaceFirst("!", ".ini");
        try {
            pathname = new String(pathname.getBytes(), "UTF-8");
            pathname = "eat.ini";
        } catch (UnsupportedEncodingException e) {e.printStackTrace();
        }
        File dinnerFile = new File(pathname);
        Map<String, Double> namePriceMap = new HashMap<>();
        try {
            if (!dinnerFile.exists()) FileUtils.touch(dinnerFile);
            System.out.println(dinnerFile.getAbsolutePath());
            Object[] lines = FileUtils.readLines(dinnerFile, "UTF-8").toArray();
            for (Object line : lines) {
                String[] sS = line.toString().split("-");
                Double put = Double.parseDouble(sS[1]);
                namePriceMap.put(sS[0], put);
            }
        } catch (IOException e) {
            MessageToUser messageToUser = new MessageCons();
            messageToUser.out("EatMeat_16", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n") + "\nEatMeat.dinnerPrice, and ID (lineNum) is 16").getBytes());
        }
        return namePriceMap;
    }

    String showPit();

}
