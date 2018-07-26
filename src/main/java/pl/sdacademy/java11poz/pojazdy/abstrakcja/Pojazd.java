package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.Date;

public abstract class Pojazd {
	String nazwa;
	Date rokProdukcji;

	public void wypiszNazwe() {
		System.out.println("Pojazd:" + nazwa);
	}

	public abstract void poruszajSie();
}
