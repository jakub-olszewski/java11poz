package pl.sdacademy.java11poz.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PetlaFor2 {

	// utworzenie statycznego loggera
	protected final static Logger logger = Logger.getLogger(PetlaFor2.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		//

		String[] pozycje = { "pizza1", "napoj8", "makaron3" };

		for (String pozycja : pozycje) {
			logger.log(Level.INFO, "Przetwarzam element: " + pozycja);

		}

	}

}
