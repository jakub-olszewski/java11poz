package pl.sdacademy.java11poz.pojazdy.abstrakcja;

public class Deskorolka {
	int liczbaKol;
	String rodzajKol;

	public void poruszajSie() {
		System.out.println("Jedzie deskorolka");
	}

	public void zatrzymajSie() {
		System.out.println("Zatrzymuje się deskorolka");
	}

	public Deskorolka(int liczbaKol, String rodzajKol) {
		super();
		this.liczbaKol = liczbaKol;
		this.rodzajKol = rodzajKol;
	}

}
