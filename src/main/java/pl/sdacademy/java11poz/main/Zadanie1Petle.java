package pl.sdacademy.java11poz.main;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
				"Irena", "Emil", "Robert", "Milena" };//

		// for (String imie : imiona) {
		// if (czyImieZawieraLitereA(imie)) {
		// logger.log(Level.INFO, "Przetwarzam element: " + imie);
		// }
		//
		// }
		List<String> listaImion = Arrays.asList(imiona);
		listaImion.stream().forEach(imie -> {
			if (czyImieZawieraLitereA(imie)) {
				logger.log(Level.INFO, "Przetwarzam element: " + imie);
			}
		});

		// for (int i = 0; i < imiona.length; i++) {
		// // i+1 poniewaz indeks zaczyna sie od zera
		// // % modulo oznacza reszte z dzielenia przez 2
		// // == relacja równości
		// // = przypisanie
		// if ((i + 1) % 2 == 0) {
		// String imie = imiona[i];
		// // imie zawiera litere a
		// // imie.contains('a')
		// }
		// }
		// @formatter:off
		List<String> coDrugieImieLista = IntStream.
				range(0, imiona.length).
				filter(i -> (i + 1) % 2 == 0).
				mapToObj(i -> imiona[i]).
				collect(Collectors.toList());
		
		coDrugieImieLista.
			stream().
			forEach(System.out::println);
// @formatter:on

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
