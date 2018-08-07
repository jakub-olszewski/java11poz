package pl.sdacademy.java11poz.hotel;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		// TODO zadanie 1
		// operatory += && || ! != == < > >=
		// wypisali tabliczke mnożenia przez 3
		// pętli lub stream
		// print
		// i++ to jest to samo co i=i+1;
		// tabliczkaMnozeniaPrzez3Wersja1();
		tabliczkaMnozeniaPrzez3Wersja2();
		// tabliczkaMnozeniaPrzez3Wersja3();

		// TODO zadanie 2
		// zrob metode tabliczkaMnozeniaPrzez(int liczba)
		// zrzuć wyjątek gdy liczba mniejsza od zero
		// IllegalArgumentException

		// TODO zadanie 3
		// pobieranie znaku z klawiary (konsoli)
		// następnie wypisanie tabliczki mnożenia
	}

	private static void tabliczkaMnozeniaPrzez3Wersja3() {
		// @formatter:off
		IntStream.
			rangeClosed(0, 10). // 0,1,2,3,...
			map(x -> x * 3). // 0,3,6,9,...
			forEach(System.out::println);// wypisujemy

		// @formatter:on
	}

	private static void tabliczkaMnozeniaPrzez3Wersja2() {
		for (int i = 1; i <= 10; i++) {
			PrettyPrinter.wypiszTabliczke(i, 3);
		}
	}

	private static void tabliczkaMnozeniaPrzez3Wersja1() {
		for (int i = 3; i < 100; i++) {
			boolean mnozeniePrzezTrzy = i % 3 == 0;
			if (mnozeniePrzezTrzy) {
				PrettyPrinter.wypiszTabliczke(i, 3);
			}
		}
	}
}
