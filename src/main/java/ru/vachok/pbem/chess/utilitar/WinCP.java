package ru.vachok.pbem.chess.utilitar;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;


/**
 * @since 15.07.2018 (0:24)
 */
public class WinCP implements DecoderEnc {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = WinCP.class.getSimpleName();

   private MessageToUser messageToUser = new MessageCons();

   @Override
   public String toAnotherEnc(String stringForDecode) {
      try{
         return new String(stringForDecode.getBytes(), "Windows-1251");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      throw new UnsupportedOperationException("...");
   }

   @Override
   public String toAnotherFromBytes(byte[] strBytes) {
      try{
         return new String(strBytes, "Windows-1251");
      }
      catch(UnsupportedEncodingException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      throw new UnsupportedOperationException("...");
   }
}