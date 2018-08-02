/**
 * 
 */
package pl.sdacademy.java11poz.main;

import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;
import pl.sdacademy.java11poz.jadalnia.enums.Miasto;

/**
 * @author trener
 *
 */
public class Tablice {

	/**
	 * 
	 */
	public Tablice() {
		//
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//

		PozycjaZamowienia[] pozycjeWZamowieniu = new PozycjaZamowienia[10];
		PozycjaZamowienia noweZamowienie = new PozycjaZamowienia("Pizza", 12.99f);
		pozycjeWZamowieniu[2] = noweZamowienie;

		pozycjeWZamowieniu[3] = new PozycjaZamowienia("cola", 2.99f);

		System.out.println(pozycjeWZamowieniu[0]);
		// używając metody toString znajdującej się w pozycji zamówienia możemy wypisać
		// opis pozycji w sposób czytelny a nie używając domyślnej metody toString
		// wypisującej adres obiektu w pamięci
		System.out.println(pozycjeWZamowieniu[2]);

		// utworz tablice liczb double
		double[] tablicaLiczb = new double[10];

		// przypisanie wartosci do pozycji w tablicy
		// nazwaTablicy[index]=wartosc;
		tablicaLiczb[2] = 5;

		// wypisanie
		System.out.println(tablicaLiczb[2]);

		// utworz tablice miast
		// indeks podczas tworzenia 10
		// daje na 10 pozycji od 0 do 9
		Miasto[] tablicaMiast = new Miasto[10];

		// 10 pozycja jest poza zakresem
		tablicaMiast[10] = Miasto.POZNAN;
		System.out.println(tablicaMiast[10]);

		// W i Zorro ?

	}

}
