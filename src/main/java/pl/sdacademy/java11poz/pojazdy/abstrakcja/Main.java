package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import java.util.ArrayList;
import java.util.List;

/**
 * Wersja bez abstrakcji i dziedziczenia
 * @author trener
 *
 */
public class Main {

	public static void main(String[] args) {

		Pojazd juliaDeskorolka = new Deskorolka(4, "Kauczuk");
		Pojazd juliaHulajnoga = new Hulajnoga(200, 150);
		Pojazd juliaSamochod = new Samochod(40, 3, 2);

		List<Pojazd> pojazdy = new ArrayList<Pojazd>();
		pojazdy.add(juliaDeskorolka);
		pojazdy.add(juliaHulajnoga);
		pojazdy.add(juliaSamochod);

		for (Pojazd pojazd : pojazdy) {
			pojazd.wypiszNazwe();
			pojazd.poruszajSie();
		}

		// juliaDeskorolka.poruszajSie();
		juliaDeskorolka.wypiszNazwe();

		int liczbaInt = 5;

		double liczbaDouble = (double) liczbaInt;
		// rzutowanie
		Deskorolka deskorolka = (Deskorolka) juliaDeskorolka;
		// po przypisaniu Pojazd<Deskorolka możemy wykonywać metody z Deskorolka
		deskorolka.poruszajSie();// wymuszenie
		deskorolka.zatrzymajSie();

		// juliaHulajnoga.poruszajSie();
		// juliaSamochod.poruszajSie();

	}
}
