package ru.vachok.pbem.chess.ftpclient;


import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DbProperties;
import ru.vachok.mysqlandprops.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;

import java.io.File;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.Callable;


/**
 * Проверка файлов на локальном ПК
 *
 * @since 15.07.2018 (0:09)
 */
public class HomePCFilesCheck implements Callable<String> {

   /**
    * Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = HomePCFilesCheck.class.getSimpleName();

   /**
    * {@link MessageCons}
    */
   private MessageToUser messageToUser = new MessageCons();

   /**
    * {@link UTF8}
    */
   private DecoderEnc decoderEncEnc = new UTF8();

   /**
    * @see DbProperties
    */
   private InitProperties initProperties = new DbProperties(SOURCE_CLASS);

   /**
    * {@link #call()}
    *
    * @return "Размер файла " + f.getName() + f.length() / ConstantsFor.KILOBYTE + " Megabytes.\n" + "Всего: " + l / ConstantsFor.KILOBYTE;
    */
   private String getCheckLocalFiles() {
      Properties p = initProperties.getProps();
      File videoDir = new File(p.getProperty("ftppath"));
      File[] locVideoFiles = videoDir.listFiles();
      messageToUser.info(this.toString(), videoDir.getAbsolutePath(), Objects.requireNonNull(locVideoFiles).length + decoderEncEnc.toAnotherEnc(" кол-во файлов на компе."));
      long l = 0;
      for(File f : locVideoFiles){
         l = l + f.length();
         return "Размер файла " + f.getName() + f.length() / ConstantsFor.KILOBYTE + " Megabytes.\n" + "Всего: " + l / ConstantsFor.KILOBYTE;
      }
      throw new UnsupportedOperationException(SOURCE_CLASS);
   }

   /**
    * @return {@link #getCheckLocalFiles()}
    */
   @Override
   public String call() {
      return getCheckLocalFiles();
   }
}