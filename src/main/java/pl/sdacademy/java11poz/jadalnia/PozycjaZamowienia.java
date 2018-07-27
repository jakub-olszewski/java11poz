package pl.sdacademy.java11poz.jadalnia;

public class PozycjaZamowienia {

	float cena;

	String nazwa;

	public PozycjaZamowienia(String nazwa, float cena) {

		this.nazwa = nazwa;
		this.cena = cena;
	}

	/*
	 * Metoda zwraca cene zamówienia
	 */
	public float getCena() {
		return cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	@Override
	public String toString() {
		return "PozycjaZamowienia [cena=" + cena + ", nazwa=" + nazwa + "]";
	}

}
