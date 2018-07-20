package pl.sdacademy.java11poz.jadalnia;

import pl.sdacademy.java11poz.jadalnia.jedzenie.Kanapka;

public class JadalniaChlopskaImpl implements Jadalnia {

	@Override
	public Kanapka zrobKanapke() {
		// Implementacja metody ZrobKanapke,
		// która opisuje jak zrobić kanapkę
		return new Kanapka();// null to nic, czyli return null zwraca pustą
	}

	@Override
	public boolean czyPelnoletni(User uzytkownik) {

		// return zmienna (typ zmiennej zwracanej)
		int wiek = uzytkownik.getWiek();
		boolean czyPelnoletni = wiek >= 18;
		// wynik lini 21 jest taki sam jak 22;
		return czyPelnoletni;
		// return uzytkownik.getWiek() >=18;

	}

	/**
	 * Wersja krotka metody w jednej linijce
	 * @param uzytkownik
	 * @return
	 */
	public boolean czyPelnoletniWJednejLinii(User uzytkownik) {
		return uzytkownik.getWiek() >= 18;
	}

}
