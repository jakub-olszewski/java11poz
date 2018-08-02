package pl.sdacademy.java11poz.main;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.MapaPozycjiZamowienia;
import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;

public class Zadanie3Petle {
	// utworzenie statycznego loggera
	protected final static Logger logger = Logger
			.getLogger(Zadanie3Petle.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		// wyszukanie pozycji zamowienia po nazwie/kluczu
		logger.log(Level.INFO, "Napoje: ==================================");
		String nazwaSzukana = "Napoj";
		wyszukajPozycjeZamowieniaPoNazwie(nazwaSzukana);

		logger.log(Level.INFO, "Pizza's: ==================================");
		String nazwaSzukana2 = "Pizza";
		wyszukajPozycjeZamowieniaPoNazwie(nazwaSzukana2);

	}

	private static void wyszukajPozycjeZamowieniaPoNazwie(String nazwaSzukana) {
		// przeszukanie mapy w poszukiwaniu nazwy pozycji

		MapaPozycjiZamowienia mapaPozycji = new MapaPozycjiZamowienia();
		// setter/getter
		// pobralismy mape
		Map<String, PozycjaZamowienia> mapa = mapaPozycji.getPozycjeMapa();

		// kolekcja jakiś zbiór
		// wybrano metode value poniewaz tylko ona zwraca Collection
		Collection<PozycjaZamowienia> pozycjeZamowienia = mapa.values();

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
