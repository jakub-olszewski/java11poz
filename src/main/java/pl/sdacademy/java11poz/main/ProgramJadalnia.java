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

	}

}
