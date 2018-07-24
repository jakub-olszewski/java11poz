package pl.sdacademy.java11poz.jadalnia;

import java.util.HashMap;
import java.util.Map;

/**
 * jest to klasa zawierająca mapę nazwy grupy(:napoje, pizze, makarony) i numeru pozycji
 * @author trener
 *
 */
public class MapaPozycjiZamowienia {
	// deklaracja zmiennej pozycjaMap przy użyciu interfejsu Map
	Map<String, PozycjaZamowienia> pozycjeMapa;

	/**
	 * konstruktor tworzący mapę pozycji
	 */
	public MapaPozycjiZamowienia() {
		// inicjalizacja mapyPozycji
		this.pozycjeMapa = new HashMap<String, PozycjaZamowienia>();
		// zmiennaMapa.put(klucz, wartość);
		pozycjeMapa.put("pizza1", new PozycjaZamowienia("Pizza Margarita", 15.50f));
		pozycjeMapa.put("pizza2", new PozycjaZamowienia("Pizza Poznańska", 17.50f));
		pozycjeMapa.put("pizza3", new PozycjaZamowienia("Pizza Krakowska", 20.50f));

	}

	public PozycjaZamowienia pobierzPozycje(String kluczPozycji) {
		return pozycjeMapa.get(kluczPozycji);
	}

}
