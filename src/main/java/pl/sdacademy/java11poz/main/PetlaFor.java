package pl.sdacademy.java11poz.main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program do testowania petli for
 * @author trener
 *
 */
public class PetlaFor {
	// utworzenie statycznego loggera
	protected final static Logger logger = Logger.getLogger(PetlaFor.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		// utworz tablice liczb::float 6 elementow

		float[] tablicaLiczb = { 99f, 45f, 101f, 78f, 32f, 6f };

		for (float x : tablicaLiczb) {
			logger.log(Level.INFO, "Przetwarzam element: " + x);
			if (x > 100) {
				break; // przerwanie pętli
			}
		}
		// petla for z wykorzystaniem zmiennej pomocnicznej "i"
		// i skrot od słowa index
		// for (inicjalizacja zmiennej pomocniczej; warunek kontynuacji; skok/kropka)
		// i++ -> i + 1
		for (int i = 0; i < tablicaLiczb.length; i++) {
			float f = tablicaLiczb[i];

		}
		// uzywajac petli for wypisz elementy tablicy
		logger.log(Level.INFO, "Przetwarzam {} elementów  " + tablicaLiczb.length);

	}

}
