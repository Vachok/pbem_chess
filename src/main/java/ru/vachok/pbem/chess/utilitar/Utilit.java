package ru.vachok.pbem.chess.utilitar;



import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalTime;
import java.util.logging.Logger;

import static java.util.logging.Level.WARNING;


/**
 * Полезные методы
 *
 * @since 19.06.2018 (21:43)
 */
public class Utilit {
    /**
     Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = Utilit.class.getSimpleName();

    private static final Logger LOGGER = Logger.getLogger(SOURCE_CLASS);
    /**
     * Проверка доступности ПК.
     *
     * @return true - онлайн.
     */
    public boolean isA161OK() {
        InetAddress inetAddress;
        try{
            inetAddress = InetAddress.getByName("a161.eatmeat.ru");
            return inetAddress.isReachable(ConstantsFor.TIMEOUT_1000);
        }
        catch(IOException e){
            LOGGER.log(WARNING, "java.net.UnknownHostException is" + e.getMessage());
        }
        throw new NullPointerException("FUCK!");
    }

    /**
     * Строка приветствия.
     *
     * @return строка в зависимости от времени суток, возвращает разное приветствие.
     */
    public String checkTime() {
        String s = ConstantsFor.toUTF("Доброго времени суток");
        if(LocalTime.now().isAfter(LocalTime.of(12, 0))) s = "Добрый день!";
        if(LocalTime.now().isAfter(LocalTime.of(21, 0))) s = "Добрый вечер!";
        if(LocalTime.now().isBefore(LocalTime.of(9, 0))) s = "Доброй ночи!";
        if(LocalTime.now().isBefore(LocalTime.of(12, 0))) s = "Доброе утро!";
        return s;
    }
}