package ru.vachok.pbem.chess;


import java.time.LocalTime;


/**
 Полезные методы
 
 @since 19.06.2018 (21:43) */
public class Utilit {
    
    /**
     Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = Utilit.class.getSimpleName();
    
    String checkTime() {
        String s = ConstantsFor.toUTF("Доброго времени суток");
        if(LocalTime.now().isAfter(LocalTime.of(12, 0))) s = "Добрый день!";
        if(LocalTime.now().isBefore(LocalTime.of(12, 0))) s = "Добрый ночь!";
        return s;
    }
}
// at 