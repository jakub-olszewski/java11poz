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

				// pętla
				for (int i = 0; i < 100; i++) {
					System.out.println("+Runnable r1");
				}

				// stream
				// @formatter:off
				IntStream.
					range(0, 100).
					filter(i -> (i + 1) % 2 == 0).
					mapToObj(i -> i).
					collect(Collectors.toList());
				// @formatter:on

				System.out.println("Runnable r1 stop.");
			}
		};

		// implementacja z użyciem lambda
		Runnable wykonanieImpl2 = () -> {
			System.out.println("Runnable r2 run...");
			// implementacja sumy kwadratów dwóch kolejnych liczb od 0 do 100
			// 0 to będzie 0^2 + 1^2
			// 1 to będzie 1^2 + 2^2
			for (int i = 0; i < 100; i++) {
				System.out.println("-Runnable r2 ");
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
