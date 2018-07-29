package ru.vachok.pbem.chess.ftpclient;


import org.apache.commons.io.FileUtils;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.DecoderEnc;
import ru.vachok.pbem.chess.utilitar.UTF8;
import ru.vachok.pbem.chess.utilitar.Utilit;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;


/**
 @since 21.07.2018 (18:14) */
public class LocalFilesWorker implements Callable<String> {

   private static final File DIR_VID = new File("f:\\Video\\Captures\\IPCamera\\IV2405P_00626E6A45EA\\record\\");

   /**
    Simple Name класса, для поиска настроек
    */
   private static final String SOURCE_CLASS = LocalFilesWorker.class.getSimpleName();

   private static final InitProperties initProperties = new DBRegProperties(ConstantsFor.APP_NAME + SOURCE_CLASS);

   private final DecoderEnc decoderUTF = new UTF8();

   private final MessageToUser messageToUser = new MessageCons();

   @Override
   public String call() {
     return countFilesAndSizes();
   }

   private void txtMaker() {
      File[] videoFiles = DIR_VID.listFiles();
      Properties properties = initProperties.getProps();
      LinkedHashMap<String, File> filesWithNames = new LinkedHashMap<>();
      int length = videoFiles.length;
      Integer need = Integer.valueOf(properties.getProperty("need"));
      if(length >= need){
         for(int i = 0; i < need; i++){
            File vFile = videoFiles[i];
            String name = vFile.getName();
            filesWithNames.put(name, vFile);
         }
         txtWorker(filesWithNames);
      }
      else{
         messageToUser.info(SOURCE_CLASS, "num files : ", length + " - need " + (need - length));
      }

   }

   private void txtWorker(Map<String, File> filesWithNames) {
      File txtFile = new File(DIR_VID + "\\111new.txt");
      try{
         FileUtils.touch(txtFile);
      }
      catch(IOException e){
         messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
   }

   private String countFilesAndSizes() {
      if(Utilit.thisPCName().toLowerCase().contains("home"))
      {
      File[] localVidFilesFromFTP = DIR_VID.listFiles();
      int count = localVidFilesFromFTP.length;
      long size = 0;
      for(File f : localVidFilesFromFTP){
         size += f.length();
      }
      return size/ConstantsFor.MEGABYTE + decoderUTF.toAnotherEnc(" мегабайт в ")+count+decoderUTF.toAnotherEnc(" файлах на жестком диске.\n"+DIR_VID.getAbsolutePath());
   }else throw new UnsupportedOperationException(decoderUTF.toAnotherEnc("Это возможно только на домашнем ПК!"));}
}