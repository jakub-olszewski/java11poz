package pl.sdacademy.java11poz.pojazdy;

import java.util.ArrayList;
import java.util.List;

/**
 * Wersja bez abstrakcji i dziedziczenia
 * @author trener
 *
 */
public class Main {

	public static void main(String[] args) {

		Deskorolka juliaDeskorolka = new Deskorolka(4, "Kauczuk");
		juliaDeskorolka.setNazwa("juliaDeskorolka");
		Hulajnoga juliaHulajnoga = new Hulajnoga(200, 150);
		juliaHulajnoga.setNazwa("juliaHulajnoga");
		Samochod juliaSamochod = new Samochod(40, 3, 2);
		juliaSamochod.setNazwa("juliaSamochod");

		List listaDeskorolek = new ArrayList<>();
		List listaHulanoga = new ArrayList<>();
		List listaSamochod = new ArrayList<>();

		juliaDeskorolka.poruszajSie();
		juliaHulajnoga.poruszajSie();
		juliaSamochod.poruszajSie();

		juliaDeskorolka.poruszajSie();
		juliaHulajnoga.poruszajSie();
		juliaSamochod.poruszajSie();

	}
}
