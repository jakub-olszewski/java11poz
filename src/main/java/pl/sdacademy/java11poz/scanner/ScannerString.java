package pl.sdacademy.java11poz.scanner;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
		String napis = "ala ma kota";
		Scanner skaner = new Scanner(napis);
		// skaner.useDelimiter(","); zamiast spacji mozna uzyc np przecinka

		// pobiera obecny 'ala' i przechodzi do kolejnego 'ma'
		System.out.println(skaner.next());

		// pobiera obecny 'ma' i przechodzi do kolejnego 'kota'
		System.out.println(skaner.next());

		// pobiera obecny 'kota' i nie przechodzi do kolejnego, ponieważ jest koniec
		System.out.println(skaner.next());

		/**
		 * wypisanie w petli powtarzajacychsie linii
		 */
		Scanner skaner2 = new Scanner(napis);
		System.out.println("=== petla for ===");
		for (int i = 0; i < 3; i++) {
			System.out.println(skaner2.next());
		}

		//
		Scanner skaner3 = new Scanner(napis);
		// skaner3.hasNext(); czy jest nastepny
		// petla while
		System.out.println("=== petla while ===");

		while (skaner3.hasNext()) {// dopóki skaner3 ma nastepnika
			System.out.println(skaner3.next());// wypisz obecny przejdz do nastepnego
		}

		skaner.close();

	}

}
