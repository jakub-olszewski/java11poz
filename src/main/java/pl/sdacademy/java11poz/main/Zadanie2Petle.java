package pl.sdacademy.java11poz.main;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.MapaPozycjiZamowienia;
import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;

public class Zadanie2Petle {
	// utworzenie statycznego loggera
	protected final static Logger logger = Logger
			.getLogger(Zadanie2Petle.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		// TODO wyszukanie pozycji zamowienia po nazwie/kluczu

		// przeszukanie mapy w poszukiwaniu nazwy pozycji

		MapaPozycjiZamowienia mapaPozycji = new MapaPozycjiZamowienia();
		// setter/getter
		// pobralismy mape
		Map<String, PozycjaZamowienia> mapa = mapaPozycji.getPozycjeMapa();

		// kolekcja jakiś zbiór
		// wybrano metode value poniewaz tylko ona zwraca Collection
		Collection<PozycjaZamowienia> pozycjeZamowienia = mapa.values();

		// iterator ma metody:
		// hasNext() - czy istnieje nastepnik
		// next() - pobiera 'wagonik', i przeskakuje do następnego
		for (Iterator iterator = pozycjeZamowienia.iterator(); iterator.hasNext();) {
			PozycjaZamowienia pozycjaZamowienia = (PozycjaZamowienia) iterator.next();
		}

		String nazwaSzukana = "Mar";

		// : oznacza (in) czyli w/z
		for (PozycjaZamowienia pozycjaZamowienia : pozycjeZamowienia) {
			// pobranie nazwy i zwrocenie zamowienia zawiarajacego nazwe
			String nazwaPozycjiZamowienia = pozycjaZamowienia.getNazwa();
			if (nazwaPozycjiZamowienia.contains(nazwaSzukana)) {
				logger.log(Level.INFO, pozycjaZamowienia.toString());
			}

		}
	}

}
