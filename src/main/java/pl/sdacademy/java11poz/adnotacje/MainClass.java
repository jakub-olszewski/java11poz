package pl.sdacademy.java11poz.adnotacje;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

public abstract class MainClass {

	protected abstract void implementacjaProgramu();

	/**
	 * Konstruktor MainClass
	 */
	public MainClass() {
		Class obj = this.getClass();
		if (obj.isAnnotationPresent(JavaTopic.class)) {

			Annotation annotacja = obj.getAnnotation(JavaTopic.class);
			JavaTopic javaTopic = (JavaTopic) annotacja;
			System.out.printf(
					"===========================================================================");
			// %s oznacza String
			// %n oznacza new line
			System.out.printf("%nTopic: %s", javaTopic.topic());
			System.out.printf("%nDescription: %s", javaTopic.decription());
			System.out.printf("%nPriority: %s", javaTopic.priority());
			System.out.printf("%nCreatedBy: %s", javaTopic.createdBy());
			System.out.printf("%nTags: ");

			// zamien tablice na liste
			List<String> tagsList = Arrays.asList(javaTopic.tags());

			// wypisz tagi za pomocą stream()
			tagsList.stream().forEach(tag -> System.out.print(tag + ","));
			// wypisz tagi w czytelny sposób używając separatora

			System.out.printf(
					"\n===========================================================================%n%n");

		}
	}
}
