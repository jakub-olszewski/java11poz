package pl.sdacademy.java11poz.figury;

public class Trapez {
	float podstawa1;
	float podstawa2;
	float wysokosc;

	public Trapez(float podstawa1, float podstawa2, float wysokosc) {
		this.podstawa1 = podstawa1;
		this.podstawa2 = podstawa2;
		this.wysokosc = wysokosc;
	}

	float obliczPole() {
		return ((podstawa1 + podstawa2) * wysokosc) / 2;
	}
}
