package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.concurrent.Callable;


/**
 * @since 15.07.2018 (0:24)
 */
public class UTF8 implements DecoderEnc, Callable<String> {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = UTF8.class.getSimpleName();

   private final MessageToUser messageToUser = new MessageCons();

   private String toDecode;

   private byte[] bytesDecoded;

   /**
    Конвертер в CP-1251.

    @param bytes
    @return нужная строка в нужной кодировке
    */
   @Override
   public String toAnotherEnc(byte[] bytes) {
      try{
         return new String(bytes, "UTF-8");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      throw new UnsupportedOperationException("...");
   }

   public UTF8() {

   }

   public UTF8(String toDecode) {
      this.toDecode = toDecode;
   }

   public UTF8(byte[] bytesDecoded) {
      this.bytesDecoded = bytesDecoded;
   }

   /**
    * {@link #UTF8(String)}
    * 1. Запуск
    * {@link #toAnotherEnc(String)}
    *
    * @return computed result
    */
   @Override
   public String call() {
      String retString = "";
      if(bytesDecoded.length > 1){ retString = new String(bytesDecoded); }
      else{ retString = toDecode; }

      return toAnotherEnc(retString);
   }

   /**
    * @param stringForDecode нужная строка в начальной кодировке
    * @return строка в нужной кодировке.
    */
   @Override
   public String toAnotherEnc(String stringForDecode) {
      try{
         return new String(stringForDecode.getBytes(), "UTF-8");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      throw new UnsupportedOperationException("...");
   }
}