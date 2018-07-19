package pl.sdacademy.java11poz.jadalnia;

import pl.sdacademy.java11poz.jadalnia.jedzenie.Kanapka;

public class JadalniaChlopskaImpl implements Jadalnia {

	@Override
	public Kanapka zrobKanapke() {
		// Implementacja metody ZrobKanapke,
		// która opisuje jak zrobić kanapkę
		return new Kanapka();// null to nic, czyli return null zwraca pustą
	}

}
