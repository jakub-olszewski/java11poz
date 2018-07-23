/**
 * 
 */
package pl.sdacademy.java11poz.main;

import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;

/**
 * @author trener
 *
 */
public class Tablice {

	/**
	 * 
	 */
	public Tablice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PozycjaZamowienia[] pozycjeWZamowieniu = new PozycjaZamowienia[10];
		PozycjaZamowienia noweZamowienie = new PozycjaZamowienia("Pizza", 12.99f);
		pozycjeWZamowieniu[2] = noweZamowienie;
		System.out.println(pozycjeWZamowieniu[0]);
		// używając metody toString znajdującej się w pozycji zamówienia możemy wypisać
		// opis pozycji w sposób czytelny a nie używając domyślnej metody toString
		// wypisującej adres obiektu w pamięci
		System.out.println(pozycjeWZamowieniu[2]);

		// TODO utworz tablice liczb double

		// TODO utworz tablice miast

	}

}
