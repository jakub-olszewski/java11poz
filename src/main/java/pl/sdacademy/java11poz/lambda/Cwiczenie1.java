package pl.sdacademy.java11poz.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.main.PetlaFor2;

public class Cwiczenie1 {
	// utworzenie statycznego loggera
	protected final static Logger logger = Logger.getLogger(PetlaFor2.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] pozycje = { "pizza1", "napoj8", "makaron3" };
		List<String> pozycjeLista = Arrays.asList(pozycje);
		for (String pozycja : pozycje) {
			logowaniePozycji(pozycja);
		}

		// z uzyciem lambda
		pozycjeLista.forEach((pozycja) -> logowaniePozycji(pozycja));

		/**
		 * Sortowanie pozycji bez użycia lambdy
		 */
		Arrays.sort(pozycje, new Comparator<String>() {

			@Override
			public int compare(String pozycja1, String pozycja2) {
				return pozycja1.compareTo(pozycja2);
			}
		});

		/**
		 * Sortowanie z użyciem lambdy
		 */
		Comparator<String> sortByName = (String pozycja1, String pozycja2) -> pozycja1
				.compareTo(pozycja2);
		Arrays.sort(pozycje, sortByName);

		List<String> pozycjePoSortowaniu = Arrays.asList(pozycje);

		pozycjePoSortowaniu.forEach(pozycja -> System.out.println(pozycja));
	}

	private static void logowaniePozycji(String pozycja) {
		logger.log(Level.INFO, "Przetwarzam element: " + pozycja);
	}

}
