package pl.sdacademy.java11poz.adnotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JavaTopic {

	public enum Level {
		LOW, MEDIUM, HIGH
	}

	// priorytet
	Level priority() default Level.MEDIUM;

	// tagi
	String[] tags() default "";

	// tytul
	String topic();

	// opis
	String decription();

	// autor
	String createdBy() default "Jakub Olszewski";
}
