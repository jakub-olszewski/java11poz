package pl.sdacademy.java11poz.pojazdy;

import java.util.Date;

public class Deskorolka {
	String nazwa;
	Date rokProdukcji;
	int liczbaKol;
	String rodzajKol;

	public void wypiszNazwe() {
		System.out.println("Pojazd:" + nazwa);
	}

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
