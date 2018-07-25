package pl.sdacademy.java11poz.pojazdy.abstrakcja;

/**
 * Deskorolka rozszerza/dziedziczy pola oraz metody po klasie Pojazdy </br>
 * uwaga zakomentowane linie sa czesciami powtarzajacymi sie z klasa Pojazdy
 * @author trener
 *
 */
public class Deskorolka extends Pojazd {
	// String nazwa;
	// Date rokProdukcji;
	int liczbaKol;
	String rodzajKol;

	// public void wypiszNazwe() {
	// System.out.println("Pojazd:" + nazwa);
	// }

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

	public String getNazwa() {
		return nazwa;
	}

	public void juliaDeskorolka(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}
