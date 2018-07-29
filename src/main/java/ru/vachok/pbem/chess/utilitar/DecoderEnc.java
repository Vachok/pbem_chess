package ru.vachok.pbem.chess.utilitar;


/**
 * интерфейс преобразования кодировок
 */
public interface DecoderEnc {

   /**Конвертер в UTF-8.
    * @param stringForDecode нужная строка в начальной кодировке
    * @return нужная строка в нужной кодировке
    */
   String toAnotherEnc(String stringForDecode);
   /**Конвертер в CP-1251.
    * @param bytes байты строки
    * @return нужная строка в нужной кодировке
    */
   String toAnotherEnc(byte[] bytes);

}
