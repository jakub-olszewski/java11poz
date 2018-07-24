package pl.sdacademy.java11poz.jadalnia;

import java.util.HashMap;
import java.util.Map;

/**
 * jest to klasa zawierająca mapę nazwy grupy(:napoje, pizze, makarony) i numeru pozycji
 * @author trener
 *
 */
public class MapaPozycjiZamowienia {
	Map pozycje;

	public MapaPozycjiZamowienia() {
		this.pozycje = new HashMap();
		pozycje.put("pizza1", new PozycjaZamowienia("Pizza Margarita", 15.50f));
		pozycje.put("pizza2", new PozycjaZamowienia("Pizza Poznańska", 17.50f));
		pozycje.put("pizza3", new PozycjaZamowienia("Pizza Krakowska", 20.50f));

	}

}
