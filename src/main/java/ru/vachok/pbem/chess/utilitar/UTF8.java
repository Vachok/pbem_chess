package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;


/**
 * @since 15.07.2018 (0:24)
 */
public class UTF8 implements DecoderEnc {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = UTF8.class.getSimpleName();

   private MessageToUser messageToUser = new MessageCons();

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

   @Override
   public String toAnotherFromBytes(byte[] strBytes) {
      try{
         return new String(strBytes, "UTF-8");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      throw new UnsupportedOperationException("...");
   }
}