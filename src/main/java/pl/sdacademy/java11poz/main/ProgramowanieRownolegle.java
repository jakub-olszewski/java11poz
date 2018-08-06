package pl.sdacademy.java11poz.main;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgramowanieRownolegle {

	public static void main(String[] args) {

		// runnable to implementacja wykonania akcji przez wątek
		// implementacja bez uzycia lambda
		Runnable wykonanieImpl = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable r1 run...");
				// dla chętnych użycie stream i filter
				// implementacja podzielności przez 2 i 5 liczb od 0 do 100

				// wypisz liczby od 0 do 100
				for (int index = 0; index < 100000; index++) {
					System.out.println("+Runnable r1 " + index);
				}
				// index w skrócie literka 'i'

				// pętla
				for (int i = 0; i < 100; i++) {
					boolean podzielnePrzezDwa = i % 2 == 0;
					boolean podzielnePrzezPiec = i % 5 == 0;

					boolean warunek = podzielnePrzezDwa && podzielnePrzezPiec;// && - i ||
																				// - lub
					// boolean warunek = i % 2 == 0 && i % 5 == 0;

					// spelnienie warunku
					if (warunek) {
						// wypisanie liczby spelniajacej warunek
						System.out.println("+Runnable r1 liczba : " + i);

					}
				}

				// stream dla chętnych do dokończenia
				// @formatter:off
				IntStream.
					range(0, 100).
					filter(i -> i % 2 == 0 && i % 5 == 0).
					mapToObj(i -> i).
					collect(Collectors.toList());
				// @formatter:on

				System.out.println("Runnable r1 stop.");
			}
		};

		// implementacja z użyciem lambda () -> { //blok kodu }
		Runnable wykonanieImpl2 = () -> {
			System.out.println("Runnable r2 run...");
			// implementacja sumy kwadratów dwóch kolejnych liczb od 0 do 100
			// i=0 to będzie 0^2 + 1^2
			// i=1 to będzie 1^2 + 2^2
			// i=2 to będzie 2^2 + 3^2
			// wzór ogólny dla kazdego i będzie i^2 + (i+1)^2
			// petla start i=0 konczy sie gdy i<10000 a krok wykonania jednego przejscia
			// i+1
			for (int i = 0; i < 100000; i++) {
				int obliczenie = i ^ 2 + (i + 1) ^ 2;// ^ - potęga
				System.out.println("-Runnable r2 " + obliczenie);
			}
			System.out.println("Runnable r2 stop.");
		};

		// wątek wykonuje implementacje z argumentu wykonanieImpl
		Thread watek = new Thread(wykonanieImpl);
		Thread watek2 = new Thread(wykonanieImpl2);

		// uruchomienie wątku
		watek.start();
		watek2.start();

	}

}
