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
		// TODO Auto-generated method stub
		User juliaUser = new UserImpl("Julia", "Kowalska");
		juliaUser.toString(); // metoda 'toString' zwraca String czyli napis;
		Jadalnia jadalniaChlopska = new JadalniaChlopskaImpl();
		Zamowienie juliaZamowienie = new Zamowienie(1, 0);
		// liczba float potrzebuje dopisania literki 'f' na koncu liczby
		// np. 34.59f
		PozycjaZamowienia pizzaPozycjaZamowienia = new PozycjaZamowienia("Pizza", 34.59f);
		float sumaZamowienia = 0;
		sumaZamowienia += pizzaPozycjaZamowienia.getCena();
		String opisUzytkownika = juliaUser.toString();
		System.out.println(opisUzytkownika); // println wypisuje napis na konsoli,
												// gdzie napisem jest argument
		System.out.println("Suma zamowienia = " + sumaZamowienia);
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

		boolean warunek = false;// wiek >= 18
		juliaUser.setWiek(17);
		// TODO zadanie sprawdz pelnoletnosc uzytkownika
		if (warunek) {
			// wypisz jest pelnoletni
		}
		else {
			// wypisz nie jest pelnoletni
		}
	}

}
