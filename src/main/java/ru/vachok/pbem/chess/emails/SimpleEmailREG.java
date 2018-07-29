package ru.vachok.pbem.chess.emails;


import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.DbProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;
import ru.vachok.pbem.chess.utilitar.ConstantsFor;
import ru.vachok.pbem.chess.utilitar.Utilit;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.io.Serializable;
import java.util.*;


/**
 * Шаблон простого электронного письма
 * Created by 14350 on 21.06.2018 19:07
 */
public class SimpleEmailREG extends Email implements Serializable {

   private static final long serialVersionUID = 2L;

   private InternetAddress fromWho;

   private boolean sslOn;

   private String msg;

   private String subj;

   private Collection<String> recep;

   private String hostNameM;

   private String userName;

   private String password;

   private transient MessageToUser messageToUser = new MessageCons();

   /**
    * Конструктор
    *
    * @param recep лист адресов To
    * @param subj  тема
    * @param msg   сообщение
    */
   SimpleEmailREG(Collection<String> recep, String subj, String msg) {
      InitProperties initProperties = new DBRegProperties("general-mailP");
      Properties mailP = initProperties.getProps();

      this.msg = msg;
      this.subj = subj;
      this.recep = recep;
      this.hostNameM = mailP.getProperty("host");
      this.sslOn = mailP.getProperty("ssl").equals("true");
      try{ this.fromWho = new InternetAddress(mailP.getProperty("From")); }
      catch(AddressException e){
         messageToUser.out("SimpleEmailBin_98", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("SimpleEmailREG", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }
      initProperties = new DBRegProperties("general-chess");
      mailP = initProperties.getProps();
      String u = mailP.getProperty("userName");
      String p = mailP.getProperty("pass");
      this.userName = u;
      this.password = p;

      messageToUser.info("chess", u, p);
      initProperties = new FileProps("chess");
      initProperties.setProps(mailP);
   }

   private SimpleEmailREG() {
   }

   /**
    * Готовое письмо.
    *
    * @return письмо, с заданными параметрами
    */
   SimpleEmail getMailBin() {
      Collection<InternetAddress> thisMessageFromArrayAddresses = new ArrayList<>();
      SimpleEmail simpleEmail = new SimpleEmail();
      try{
         thisMessageFromArrayAddresses.add(fromWho);
         for(String s : recep){
            simpleEmail.addTo(s);
         }
         simpleEmail.setSubject(subj);
         String charsetM = "UTF-8";
         simpleEmail.setCharset(charsetM);
         simpleEmail.setFrom(fromWho.getAddress());
         simpleEmail.setReplyTo(thisMessageFromArrayAddresses);
         simpleEmail.setMsg(msg);
         simpleEmail.setSSLOnConnect(sslOn);
         simpleEmail.setAuthentication(userName, password);
         simpleEmail.setSentDate(new Date());
         simpleEmail.setDebug(true);
         simpleEmail.setHostName(hostNameM);
      }
      catch(EmailException e){
         messageToUser = new MessageCons();
         messageToUser.out("SimpleMailBin_53", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
         messageToUser.errorAlert("SimpleEmailREG", e.getMessage(), Arrays.toString(e.getStackTrace()));
      }

      return simpleEmail;
   }

   /**
    * Define the content of the getMailBin. It should be overridden by the
    * subclasses.
    *
    * @param msg A String.
    * @return An Email.
    * @since 1.0
    */
   @Override
   public Email setMsg(String msg) {
      Utilit.exitWitnClean(ConstantsFor.BAD);
      throw new UnsupportedOperationException("Sorry...");
   }
}
