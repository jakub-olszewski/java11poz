package pl.sdacademy.java11poz.figury.abstrakcja;

/**
 * klasa opisujaca kwadrat
 * @author trener
 *
 */
public class Kwadrat extends Figura {
	// pola
	float bok;
	float przekątna;

	/*
	 * metoda obliczajaca pole
	 */
	public void obliczPole() {
		this.pole = bok * bok;
	}

	/*
	 * konstruktor kwadratu
	 */
	public Kwadrat(float bok) {
		this.bok = bok;
	}

	double obliczPrzekatna() {
		return Math.sqrt(bok);
	}
}
