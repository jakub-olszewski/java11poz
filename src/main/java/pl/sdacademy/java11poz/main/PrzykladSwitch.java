/**
 * 
 */
package pl.sdacademy.java11poz.main;

import pl.sdacademy.java11poz.jadalnia.Miasto;
import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;

/**
 * @author trener
 *
 */
public class PrzykladSwitch {

	/**
	 * 
	 */
	public PrzykladSwitch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User joannaUser = new UserImpl("Joanna", "Nowak", Miasto.WARSZAWA);
		Miasto miastoUser = joannaUser.getMiasto();

		if (miastoUser == Miasto.POZNAN) {
			// warunek spelniony
			// jezeli warunek jest spelniony nie idziemy dalej
			System.out.println("User z Poznania");
		}
		// w przeciwnym wypadku jezeli miasto uzytkownika to Warszawa
		else if (miastoUser == Miasto.WARSZAWA) {
			// warunek nie spelniony
			// w przeciwny wypadku
			// jezeli warunek jest spelniony nie idziemy dalej
			System.out.println("Warszawiak");
		}
		// w przeciwnym wypadku jesli poprzednie warunki nie sa prawdziwe
		else {
			System.out.println("User nie wiem skąd");
		}

		char ocena = 'A';

		switch (ocena) {
		case 'A':
			System.out.println("Świetnie");
			// break;
		case 'B':
		case 'C':
			System.out.println("Dobrze");

			break;
		case 'D':
			System.out.println("Zdałeś!");
			break;
		case 'E':
			System.out.println("Będzie poprawka");
			break;
		default:
			break;
		}
	}

}
