package pl.sdacademy.java11poz.lambda;

import java.util.Arrays;
import java.util.List;

public class Cwiczenie3 {

	public static void main(String[] args) {

		// liste imion
		List<String> imiona = Arrays.asList("Anna", "Robert", "Tomasz", "Mateusz",
				"Natalia", "Monika");

		// uzywajac stream filtrujemy zawiejace litere 'a'
		// oraz wypisujemy
		System.out.println("===============");
		imiona.stream().filter(imie -> imie.contains("a"))
				.filter(imie -> imie.startsWith("A"))
				.forEach(imie -> System.out.println(imie));
		System.out.println("===============");

		// rozne sposoby zapisu
		imiona.stream().forEach(PrettyPrint::print);
		// to samo co powyzej zapisane w inny sposob
		imiona.stream().forEach(text -> {
			System.out.println("Element: " + text);
		});
	}

}
