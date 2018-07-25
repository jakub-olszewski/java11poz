package pl.sdacademy.java11poz.jadalnia;

import java.util.HashMap;
import java.util.Map;

/**
 * jest to klasa zawierająca mapę nazwy grupy(:napoje, pizze, makarony) i numeru pozycji
 * </br>
 * Klasa zawiera mape klucz wartość </br>
 * * klucz grupa i numer pozycji z menu </br>
 * * wartosc obiekt PozycjaZamowienia
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
		// put wstaw wartość
		pozycjeMapa.put("napoj2", new PozycjaZamowienia("Napoj Piwo Tyskie", 10.50f));
		pozycjeMapa.put("pizza1", new PozycjaZamowienia("Pizza Margarita", 15.50f));
		pozycjeMapa.put("pizza3", new PozycjaZamowienia("Pizza Krakowska", 20.50f));
		pozycjeMapa.put("napoj1", new PozycjaZamowienia("Napoj Pepsi Cola", 2.50f));
		pozycjeMapa.put("pizza2", new PozycjaZamowienia("Pizza Poznańska", 17.50f));

	}

	/**
	 * Metoda pobiera pozycje zamowienia
	 * @param kluczPozycji grupa + numer z listy
	 * @return Pozycja zamowienia
	 */
	public PozycjaZamowienia pobierzPozycje(String kluczPozycji) {
		// get pobiera pozycje po kluczu pozycji
		return pozycjeMapa.get(kluczPozycji);
	}

	public Map<String, PozycjaZamowienia> getPozycjeMapa() {
		return pozycjeMapa;
	}

	public void setPozycjeMapa(Map<String, PozycjaZamowienia> pozycjeMapa) {
		this.pozycjeMapa = pozycjeMapa;
	}

}
