package pl.sdacademy.java11poz.pojazdy.abstrakcja;

public class Samochod extends Pojazd {
	int zbiornikPaliwa;
	int liczbaDrzwi;
	int iloscMiejsc;
	// String nazwa;
	// Date rokProdukcji;

	// public void wypiszNazwe() {
	// System.out.println("Pojazd:" + nazwa);
	// }

	public void poruszajSie() {
		System.out.println("Samochód porusza się");
	}

	public void zatrzymajSie() {
		System.out.println("Samochód zatrzymał się");
	}

	public Samochod(int zbiornikPaliwa, int liczbaDrzwi, int iloscMiejsc) {
		this.nazwa = "Samochod";
		this.zbiornikPaliwa = zbiornikPaliwa;
		this.liczbaDrzwi = liczbaDrzwi;
		this.iloscMiejsc = iloscMiejsc;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
}
