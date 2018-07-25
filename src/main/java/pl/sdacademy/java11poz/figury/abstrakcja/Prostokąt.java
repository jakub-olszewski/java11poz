package pl.sdacademy.java11poz.figury.abstrakcja;

public class Prostokąt {
	float podstawa;
	float wysokosc;

	float obliczPole() {
		return podstawa * wysokosc;

	}

	public Prostokąt(float podstawa, float wysokosc) {
		this.podstawa = podstawa;
		this.wysokosc = wysokosc;
	}
}
