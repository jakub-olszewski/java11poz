package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.Date;

public class Pojazdy {
	String nazwa;
	Date rokProdukcji;

	public void wypiszNazwe() {
		System.out.println("Pojazd:" + nazwa);
	}
}
