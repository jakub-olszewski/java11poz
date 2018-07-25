package pl.sdacademy.java11poz.pojazdy;

import java.util.Date;

public class Samochod {
	int iloscMiejsc;
	int liczbaDrzwi;
	String nazwa;
	Date rokProdukcji;
	int zbiornikPaliwa;

	public Samochod(int zbiornikPaliwa, int liczbaDrzwi, int iloscMiejsc) {
		super();
		this.zbiornikPaliwa = zbiornikPaliwa;
		this.liczbaDrzwi = liczbaDrzwi;
		this.iloscMiejsc = iloscMiejsc;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void poruszajSie() {
		System.out.println("Samochód porusza się");
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void wypiszNazwe() {
		System.out.println("Pojazd:" + nazwa);
	}

	public void zatrzymajSie() {
		System.out.println("Samochód zatrzymał się");
	}
}
