package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.ArrayList;
import java.util.List;

public class ObslugaPojazdu<T extends Pojazd> {

	List<T> pojazdy = new ArrayList<T>();

	public ObslugaPojazdu() {
	}

	public void wypiszIPoruszajSie(int pozycja) {
		Pojazd pojazdZListy = pojazdy.get(pozycja);
		pojazdZListy.wypiszNazwe();
		pojazdZListy.poruszajSie();
	}

	public void dodajPojazd(T pojazd) {
		pojazdy.add(pojazd);
	}

	public void aktualizujPojazd(Pojazd pojazd) {
		// TODO Auto-generated method stub

	}

	public void wypiszIPoruszajSie(Pojazd pojazd) {
		// TODO Auto-generated method stub

	}

	public void aktualizujWypiszPojazdy() {
		obsluga.pojazdy.stream().forEach(pojazd -> {
			obsluga.aktualizujPojazd(pojazd);
			obsluga.wypiszIPoruszajSie(pojazd);
		});
	}

}
