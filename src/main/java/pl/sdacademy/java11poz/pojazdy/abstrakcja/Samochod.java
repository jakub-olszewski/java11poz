package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.Date;

public class Samochod {
	String nazwa;
	Date rokProdukcji;
	int zbiornikPaliwa;
	int liczbaDrzwi;
	int iloscMiejsc;

	public void poruszajSie() {
		System.out.println("Samochód porusza się");
	}

	public void zatrzymajSie() {
		System.out.println("Samochód zatrzymał się");
	}

	public Samochod(int zbiornikPaliwa, int liczbaDrzwi, int iloscMiejsc) {
		super();
		this.zbiornikPaliwa = zbiornikPaliwa;
		this.liczbaDrzwi = liczbaDrzwi;
		this.iloscMiejsc = iloscMiejsc;
	}
}
