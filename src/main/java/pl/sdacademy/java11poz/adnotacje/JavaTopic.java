package pl.sdacademy.java11poz.adnotacje;

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
