package pl.sdacademy.java11poz.figury.abstrakcja;

public class Trapez extends Figura {
	float podstawa1;
	float podstawa2;
	float wysokosc;

	public Trapez(float podstawa1, float podstawa2, float wysokosc) {
		this.podstawa1 = podstawa1;
		this.podstawa2 = podstawa2;
		this.wysokosc = wysokosc;
	}

	public void obliczPole() {
		this.pole = ((podstawa1 + podstawa2) * wysokosc) / 2;
	}
}
