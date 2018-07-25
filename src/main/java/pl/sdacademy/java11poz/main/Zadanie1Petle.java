package pl.sdacademy.java11poz.main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Wypisz parzyste elementy utworzonej wcześniej tablicy zawierającą liczby</br>
 * Wypisz elementy utworzonej wcześniej tablicy zawierającą imiona na literę ‚a’
 * 
 * @author trener
 *
 */
public class Zadanie1Petle {

	// utworzenie statycznego loggera
	protected final static Logger logger = Logger
			.getLogger(Zadanie1Petle.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {

		String[] imiona = { "Anton", "Antonina", "Julia", "Jarek", "Mateusz", "Tomasz",
				"Irena", "Emil", "Robert", "Milena" };// TODO dopisz imiona

		for (String imie : imiona) {
			if (czyImieZawieraLitereA(imie)) {
				logger.log(Level.INFO, "Przetwarzam element: " + imie);
			}

		}

		for (int i = 0; i < imiona.length; i++) {
			// i+1 poniewaz indeks zaczyna sie od zera
			// % modulo oznacza reszte z dzielenia przez 2
			// == relacja równości
			// = przypisanie
			if ((i + 1) % 2 == 0) {
				String imie = imiona[i];
				// imie zawiera litere a
				// imie.contains('a')
			}

		}
		// uzywajac petli wypisz parzyste pozycje indeksu

		/**
		 * wypisz imiona zawierajace litere 'a'a
		 */
	}

	/**
	 * Metoda sprawdza czy imie zawiera litere "a"(litera "a" zostala wybrana losowo)
	 * @param imie
	 * @return
	 */
	private static boolean czyImieZawieraLitereA(String imie) {
		return imie.contains("a") || imie.contains("A");
	}
}
