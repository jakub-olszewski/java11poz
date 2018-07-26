package pl.sdacademy.java11poz.figury.abstrakcja;

public class Prostokąt extends Figura {
	float podstawa;
	float wysokosc;

	public void obliczPole() {
		this.pole = podstawa * wysokosc;

	}

	public Prostokąt(float podstawa, float wysokosc) {
		this.podstawa = podstawa;
		this.wysokosc = wysokosc;
	}
}
