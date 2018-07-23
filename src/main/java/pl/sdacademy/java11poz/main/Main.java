/**
 * 
 */
package pl.sdacademy.java11poz.main;

import pl.sdacademy.java11poz.jadalnia.Jadalnia;
import pl.sdacademy.java11poz.jadalnia.JadalniaChlopskaImpl;
import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;
import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;
import pl.sdacademy.java11poz.jadalnia.jedzenie.Kanapka;
import pl.sdacademy.java11poz.pojazdy.Rower;

/**
 * @author trener
 *
 */
public class Main {

	/**
	 * to jest komentarz wystepujacy na poczatku metody/konstruktora
	 */
	public Main() {
		// to jest komentarz wystepujacy w bloku kodu - miedzy klamerkami
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello !"); // ten kod wypisuje napis Hello ! na konsole
		System.out.println(Math.PI); // ten kod wypisuje liczbe PI na konsole

		int liczba; // deklaracja zmiennej
		liczba = 5; // inicjlizacja zmiennej
		int liczbaOsob = 15; // deklaracja i inicjalizacja jednocześnie
		int liczbaDrzwiWSamochodzie = 0;
		System.out.println("liczba " + liczbaDrzwiWSamochodzie);
		wypiszArgumentMetody(10);
		System.out.println("5 + 3");
		System.out.println(5 + 3);

		int a = 5;
		int b = 6;
		int c = 1;

		System.out.println("suma trzech liczb wynosi " + sumaLiczb(a, b, c));
		System.out.println("suma trzech liczb wynosi " + sumaLiczb(sumaLiczb(a, b), c));
		// dopisac komentarze

		// TypZmiennej nazwaZmiennej = wartość
		Rower mateuszRower = new Rower();
		Rower juliaRower = new Rower("niebieski");
		Rower agaRower = new Rower("nazwa");
		agaRower.czyJestNaStanie();// wywołanie metody czy jest na stanie na obiekcie
		// agaRower

		// TypZmiennej - Jadalnia
		// nazwaZmiennej - jadalniaChlopskaWPoznaniu to zmienna zawierajaca
		// zbior metod z interfejsu Jadalnia
		Jadalnia jadalniaChlopskaWPoznaniu = new JadalniaChlopskaImpl();
		// w lini ponizej ze zbioru metod z interfejsu Jadalnia
		// wykonujemy metode zrobKanapka
		jadalniaChlopskaWPoznaniu.zrobKanapke().wypiszSklad();
		jadalniaChlopskaWPoznaniu.zrobKanapke().wypiszSklad();
		Kanapka kanapkaZSalata = new Kanapka();
		Kanapka kanapkaZSalataZJadalni = jadalniaChlopskaWPoznaniu.zrobKanapke();
		kanapkaZSalataZJadalni.wypiszSklad();
		kanapkaZSalataZJadalni.wypiszSklad();
		kanapkaZSalataZJadalni.wypiszSklad();

		User adaUser = new UserImpl("Ada", "Kowalska");
		adaUser.setWiek(29);
		adaUser.wypiszImieINazwisko();

		System.out.println(adaUser.getWiek());

		// wykorzystujac zmienne oraz metode sumaLiczb
		// wypisz sume zamowienia
		float sumaWszystkichPozycji = 0;
		PozycjaZamowienia pozycja1 = new PozycjaZamowienia("Pizza margaritta", 16);
		float cenaPoz1 = pozycja1.getCena();
		// dwie linie poniżej przypisują tą samą wartość do sumy wszystkich pozycji
		sumaWszystkichPozycji += cenaPoz1;
		// sumaWszystkichPozycji = sumaWszystkichPozycji + cenaPoz1;

		PozycjaZamowienia pozycja2 = new PozycjaZamowienia("Sprite 250ml", 6);
		float cenaPoz2 = pozycja2.getCena();
		sumaWszystkichPozycji += cenaPoz2;
		PozycjaZamowienia pozycja3 = new PozycjaZamowienia("Sprite 250ml", 6);
		float cenaPoz3 = pozycja3.getCena();
		sumaWszystkichPozycji += cenaPoz3;
		System.out.println("Suma wynosi: " + sumaCen(cenaPoz1, cenaPoz2, cenaPoz3));

		System.out.println("Suma wynosi: " + sumaWszystkichPozycji);

	}

	// return wystepuje gdy mamy metodę ktora zwraca np int
	// w przypadku void nie powinno byc return
	public static void wypiszArgumentMetody(int argument) {
		System.out.println(argument + " to jest argument metody.");
	}

	public static int sumaLiczb(int a, int b, int c) {
		return a + b + c;
	}

	public static int sumaLiczb(int a, int b) {
		return a + b;
	}

	public static float sumaCen(float a, float b, float c) {
		return a + b + c;
	}

}
