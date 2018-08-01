package pl.sdacademy.java11poz.adnotacje;

import java.lang.annotation.Annotation;

public class MainClass {

	/**
	 * Konstruktor MainClass
	 */
	public MainClass() {
		Class obj = this.getClass();

		if (obj.isAnnotationPresent(JavaTopic.class)) {

			Annotation annotacja = obj.getAnnotation(JavaTopic.class);
			JavaTopic javaTopic = (JavaTopic) annotacja;
			System.out.printf(
					"\n===========================================================================");
			System.out.printf("Topic: " + javaTopic.topic());
			System.out.printf("Description: " + javaTopic.decription());
			System.out.printf("Priority: " + javaTopic.priority());
			System.out.printf("CreatedBy: " + javaTopic.createdBy());
			System.out.printf("Tags: " + javaTopic.createdBy());

		}
	}
}
