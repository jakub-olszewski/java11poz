package pl.sdacademy.java11poz.jadalnia;

import java.util.HashSet;
import java.util.Set;

/**
 * Klasa opisujaca zamowienia zawierajaca pozycje zamowienia
 * 
 * @author trener
 *
 */
public class Zamowienie {

	/**
	 * Konstruktor dwu argumentowy
	 * 
	 * @param numerZamowienia to numer zamowienia
	 * @param suma wszystkich pozycji w zamowieniu
	 */
	public Zamowienie(int numerZamowienia, float suma) {
		this.numerZamowienia = numerZamowienia;
		this.suma = suma;
		// inicjalizacja interfejsu Set
		// HashSet to implementacja Set'a
		this.pozycje = new HashSet();
	}

	// pole numer zamowienia
	int numerZamowienia;

	// pole suma
	float suma;

	// zbiór pozycji zamowienia Set - to interfejs
	Set pozycje;

	public int getNumerZamowienia() {
		return numerZamowienia;
	}

	public void setNumerZamowienia(int numerZamowienia) {
		this.numerZamowienia = numerZamowienia;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

	/**
	 * metoda dododawania pozycji
	 * @param pozycja zamowienia
	 */
	public void dodajPozycje(PozycjaZamowienia pozycja) {
		pozycje.add(pozycja);

	}
}
