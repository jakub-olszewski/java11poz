package pl.sdacademy.java11poz.pojazdy;

public class Hulajnoga {

	float dlugosc;
	float wysokosc;

	public Hulajnoga(float dlugosc, float wysokosc) {
		super();
		this.dlugosc = dlugosc;
		this.wysokosc = wysokosc;
	}

	public void poruszajSie() {
		System.out.println("Hulajnoga porusza się");
	}

	public void zatrzymajSie() {
		System.out.println("Hulajnoga zatrzymała się");
	}
}
