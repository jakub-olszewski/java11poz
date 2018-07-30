package pl.sdacademy.java11poz.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pl.sdacademy.java11poz.pojazdy.abstrakcja.Deskorolka;
import pl.sdacademy.java11poz.pojazdy.abstrakcja.Hulajnoga;
import pl.sdacademy.java11poz.pojazdy.abstrakcja.Pojazd;
import pl.sdacademy.java11poz.pojazdy.abstrakcja.Samochod;

public class Cwiczenie2 {

	public static void main(String[] args) {
		Pojazd deskorolka1 = new Deskorolka(4, "Kauczuk");
		Pojazd deskorolka2 = new Deskorolka(2, "Guma");
		Pojazd deskorolka3 = new Deskorolka(2, "Plastik");
		Pojazd deskorolka4 = new Deskorolka(2, "Brak");

		Pojazd juliaHulajnoga = new Hulajnoga(200, 150);
		Pojazd juliaSamochod = new Samochod(40, 3, 2);
		Pojazd samochod1 = new Samochod(34, 34, 25);
		Pojazd samochod2 = new Samochod(10, 12, 2);

		List<Pojazd> pojazdy = new ArrayList<Pojazd>();
		pojazdy.add(deskorolka1);
		pojazdy.add(deskorolka2);
		pojazdy.add(deskorolka3);
		pojazdy.add(deskorolka4);

		pojazdy.add(samochod1);
		pojazdy.add(samochod2);

		pojazdy.add(juliaHulajnoga);
		pojazdy.add(juliaSamochod);

		pojazdy.forEach(pojazd -> pojazd.wypiszNazwe());

		Collections.sort(pojazdy, new Comparator<Pojazd>() {

			@Override
			public int compare(Pojazd pojazd1, Pojazd pojazd2) {
				return pojazd1.getNazwa().compareTo(pojazd2.getNazwa());
			}
		});
		Comparator<Pojazd> sortPojazdyByName = (Pojazd pojazd1, Pojazd pojazd2) -> {
			return pojazd1.getNazwa().compareTo(pojazd2.getNazwa());
		};

		// sortowanie po nazwie z użyciem lambdy
		Collections.sort(pojazdy, sortPojazdyByName);

	}
}
