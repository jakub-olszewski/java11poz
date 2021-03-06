package pl.sdacademy.java11poz.pojazdy.abstrakcja;

import pl.sdacademy.java11poz.adnotacje.JavaTopic;

/**
 * Wersja bez abstrakcji i dziedziczenia
 * @author trener
 *
 */
@JavaTopic(decription = "Wykorzystanie typów generycznych", topic = "Typy generyczne")
public class Main {

	public static void main(String[] args) {
		ObslugaPojazdu<Pojazd> obsluga = new ObslugaPojazdu<>();

		Pojazd juliaHulajnoga = new Hulajnoga(200, 150);
		Pojazd juliaSamochod = new Samochod(40, 3, 2);
		Pojazd juliaDeskorolka = new Deskorolka(4, "Kauczuk");
		Deskorolka deskorolka = (Deskorolka) juliaDeskorolka;

		// przepisz przy uzyciu obsluga i wykorzystaniu metody dodajPojazd()
		obsluga.dodajPojazd(deskorolka);
		obsluga.dodajPojazd(juliaDeskorolka);
		obsluga.dodajPojazd(juliaHulajnoga);
		obsluga.dodajPojazd(juliaSamochod);

		obsluga.aktualizujWypiszPojazdy();

		// podaj ilość pojazdów - utworz metode w obsludze
		int iloscPojazdow = obsluga.zliczPojazdy();
		System.out.println("ilosc:" + iloscPojazdow);
		obsluga.sumaPojazdow();
	}

}
