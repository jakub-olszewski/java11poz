package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.ArrayList;
import java.util.List;

public class ObslugaPojazdu<T extends Pojazd> {

	List<T> pojazdy = new ArrayList<T>();
	private int licznik;

	public ObslugaPojazdu() {
		licznik = 0;
	}

	public void wypiszIPoruszajSie(int pozycja) {
		Pojazd pojazdZListy = pojazdy.get(pozycja);
		pojazdZListy.wypiszNazwe();
		pojazdZListy.poruszajSie();
	}

	public void dodajPojazd(T pojazd) {
		pojazdy.add(pojazd);
		licznik++;
	}

	public void aktualizujPojazd(Pojazd pojazd) {
		//
	}

	public void wypiszIPoruszajSie(Pojazd pojazd) {
		pojazd.wypiszNazwe();
	}

	public void aktualizujWypiszPojazdy() {
		pojazdy.stream().forEach(pojazd -> {
			aktualizujPojazd(pojazd);
			wypiszIPoruszajSie(pojazd);
		});
	}

	public int zliczPojazdy() {
		return licznik;
	}

	/**
	 * Przykład problemu interacji należy wypisać kroki aby zrozumieć problem
	 * @return
	 */
	public int sumaPojazdow() {
		int suma = 0;

		for (int i = 0; i < pojazdy.size(); i++) {
			System.out.println("i=" + i);
			System.out.println("suma=" + (suma + i));
			System.out.println("--------------------");
			suma = suma + i;
		}

		// wywolania petli
		// 1. i=0 suma=0 | suma=0+0
		// 2. i=1 suma=0 | suma=0+1=1
		// 3. i=2 suma=1 | suma=1+2=3
		// 4. i=3 suma=3 | suma=3+3=6
		// 5. i=4 suma=6 | suma=4+6=10
		return suma;
	}

}
