package ru.vachok.pbem.chess.emails;


import javax.mail.Provider;


/**
 * Провайдеры электронной почты. Запрос через интерфейс.
 * <p>
 * Методы отдают настроенного провайдера.
 *
 * @since 21.06.2018 (15:54)
 */
public interface EmailsProviders {

   /**
    * @return провайдер Reg.Ru (chess)
    */
   Provider chessMail();
}
