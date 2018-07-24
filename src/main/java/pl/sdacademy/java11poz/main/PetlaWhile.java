package pl.sdacademy.java11poz.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PetlaWhile {

	// utworzenie statycznego loggera
	protected final static Logger logger = Logger.getLogger(PetlaFor.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		// TODO utworz tablice liczb::float 6 elementow

		float[] tablicaLiczb = { 99f, 45f, 101f, 78f, 32f, 6f };

		// TODO wypisz elementy wykorzystujac petle while
		// warunek liczba < 100

		int index = 0;// stan poczatkowy indeksu tablicy od 0 do długości tablicy czyli 6
		float liczba = tablicaLiczb[index];

		boolean warunek = true;// liczba mniejsza niz 100
		while (warunek) {

			if (tablicaLiczb[index] < 100 || index > tablicaLiczb.length - 1) {
				logger.log(Level.INFO, tablicaLiczb[index] + "");

			}
			else {
				warunek = false;
			}
			index++;

			// if (index > tablicaLiczb.length - 1) {
			// warunek = false;
			// }

			// TODO zwieksz indeks
		}
	}

}
