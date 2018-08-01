package ru.vachok.pbem.chess.anno;


/**
 <h1>Внешние зависимости</h1>
 */
public @interface External {

   boolean isWithoutStart() default true;

   String from();
}
