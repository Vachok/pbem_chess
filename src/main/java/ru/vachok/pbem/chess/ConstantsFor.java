package ru.vachok.pbem.chess;


import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;


/**
 @since 19.06.2018 (21:34) */
public enum ConstantsFor {
    ;
    
    /**
     Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = ConstantsFor.class.getSimpleName();
    
    /**
     @see Logger
     */
    private static final Logger LOGGER = Logger.getLogger(SOURCE_CLASS);
    /**
     Преобразование в <b>UTF-8</b>
     
     @param s строка для преобразования
     @return Windows-1251 {@link String }
     */
    public static String toUTF(String s) {
        try{
            return new String(s.getBytes(), "UTF-8");
        } catch(UnsupportedEncodingException e){
            LOGGER.throwing(SOURCE_CLASS, "java.io.UnsupportedEncodingException is", e);
        }
        return "Can't convert to UTF-8!";
    }
    /**
     Преобразование в <b>Windows-1251</b>
     
     @param s строка для преобразования
     @return Windows-1251 {@link String }
     */
    public static String toW1251(String s) {
        try{
            return new String(s.getBytes(), "Windows-1251");
        } catch(UnsupportedEncodingException e){
            LOGGER.throwing(SOURCE_CLASS, "java.io.UnsupportedEncodingException is", e);
        }
        return "Can't convert to Windows-1251!";
    }
    /**
     Преобразование в <b>UNICODE</b>
     
     @param s строка для преобразования
     @return UNICODE {@link String }
     */
    public static String toUnicode(String s) {
        try{
            return new String(s.getBytes(), "UNICODE");
        } catch(UnsupportedEncodingException e){
            LOGGER.throwing(SOURCE_CLASS, "java.io.UnsupportedEncodingException is", e);
        }
        return "Can't convert to UNICODE!";
    }
}