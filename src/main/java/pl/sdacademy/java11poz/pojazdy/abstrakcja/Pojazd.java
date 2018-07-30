package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.Date;

public abstract class Pojazd {
	String nazwa;
	Date rokProdukcji;

	public void wypiszNazwe() {
		System.out.println("Pojazd:" + nazwa);
	}

	public abstract void poruszajSie();

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}
