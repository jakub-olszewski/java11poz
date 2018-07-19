package pl.sdacademy.java11poz.jadalnia;

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
	 * @param numerZamowienia
	 *            to numer zamowienia
	 * @param suma
	 *            wszystkich pozycji w zamowieniu
	 */
	public Zamowienie(int numerZamowienia, float suma) {
		this.numerZamowienia = numerZamowienia;
		this.suma = suma;
	}

	// pole numer zamowienia
	int numerZamowienia;

	// pole suma
	float suma;

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

}
