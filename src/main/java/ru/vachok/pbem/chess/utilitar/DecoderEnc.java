package ru.vachok.pbem.chess.utilitar;


/**
 * интерфейс преобразования кодировок
 */
public interface DecoderEnc {

   /**
    * @param stringForDecode нужная строка в начальной кодировке
    * @return нужная строка в нужной кодировке
    */
   String toAnotherEnc(String stringForDecode);

   /**
    * @param strBytes нужная строка в виде байт
    * @return нужная строка в нужной кодировке
    */
   String toAnotherFromBytes(byte[] strBytes);
}
