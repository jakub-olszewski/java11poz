/**
 * 
 */
package pl.sdacademy.java11poz.main;

import pl.sdacademy.java11poz.jadalnia.Jadalnia;
import pl.sdacademy.java11poz.jadalnia.JadalniaChlopskaImpl;
import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;
import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;
import pl.sdacademy.java11poz.jadalnia.Zamowienie;

/**
 * @author trener
 *
 */
public class ProgramJadalnia {

	/**
	 * 
	 */
	public ProgramJadalnia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// uzytkownik jadalni i dane o nim
		User juliaUser = new UserImpl("Julia", "Kowalska");
		juliaUser.setWiek(18);
		juliaUser.toString(); // metoda 'toString' zwraca String czyli napis;

		/**
		 * Tworzenie jadalni
		 */
		Jadalnia jadalniaChlopska = new JadalniaChlopskaImpl();

		/**
		 * Notatka poczatek
		 */
		// boolean czyUserJestPelnoletni = jadalniaChlopska.czyPelnoletni(juliaUser);
		//
		// if (czyUserJestPelnoletni) {
		// System.out.println(juliaUser.pobierzImieINazwisko() + " jest pelnoletnia");
		// }
		//
		// if (jadalniaChlopska.czyPelnoletni(juliaUser)) {
		// System.out.println(juliaUser.pobierzImieINazwisko() + " jest pelnoletnia");
		// }
		/**
		 * Notatka koniec
		 */

		/**
		 * Tworzenie zamowienia dla Julii
		 */
		Zamowienie juliaZamowienie = new Zamowienie(1, 0);
		// liczba float potrzebuje dopisania literki 'f' na koncu liczby
		// np. 34.59f
		PozycjaZamowienia pizzaPozycjaZamowienia = new PozycjaZamowienia("Pizza", 34.59f);
		float sumaZamowienia = 0;
		sumaZamowienia += pizzaPozycjaZamowienia.getCena();
		String opisUzytkownika = juliaUser.toString();

		/**
		 * Wypisanie danych
		 */
		System.out.println(opisUzytkownika); // println wypisuje napis na konsoli,
												// gdzie napisem jest argument
		System.out.println("Suma zamowienia = " + sumaZamowienia);

		/**
		 * Konwersje typow
		 */
		// int sumaZamowieniaInt = 34.59;
		// konwersja jawne, ponieważ liczba float zostaje przypisana do
		// liczby całkowitej, w wyniku czego tracimy dane po przecinku
		int sumaZamowieniaInt = (int) sumaZamowienia;
		System.out.println("Suma zamowienia = " + sumaZamowieniaInt);
		// konwersja jawna, ponieważ liczba float podzielona przez 3
		// dalej jest floatem, a liczba sumaZamowieniaInt jest liczbą
		// całkowitą, w wyniku czego tracimy dane po przecinku
		sumaZamowieniaInt = (int) (sumaZamowienia / 3);
		// nie występuje konwersja, ponieważ sumaZamowienia
		// i sumaZamowieniaFloat są tego samego typu
		float sumaZamowieniaFloat = sumaZamowienia / 3;
		// konwersja niejawna, ponieważ sumaZamowienia jest floatem
		// i konwersja następuje bez utraty danych ponieważ double > float
		double sumaZamowieniaDouble = sumaZamowienia / 3;

		/**
		 * Instrukcja warunkowa
		 */
		// przed wykonaniem warunku należy ustalić wiek
		boolean warunek = juliaUser.getWiek() >= 18;// wiek >= 18
		// TODO zadanie sprawdz pelnoletnosc uzytkownika
		if (juliaUser.getWiek() >= 18) {
			// if (warunek) {

			// ten kod wykonuje się gdy warunek jest spełniony (jest prawdą)
			// wypisz jest pelnoletni
			System.out.println("Uzytkownik jest pelnoletni");
		}
		else {
			// ten kod wykonuje się gdy NIE JEST spełniony (jest fałszem)
			// wypisz nie jest pelnoletni
			System.out.println("Uzytkownik nie jest pelnoletni");
		}
	}

}
