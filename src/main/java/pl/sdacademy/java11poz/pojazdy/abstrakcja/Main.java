package pl.sdacademy.java11poz.pojazdy.abstrakcja;

/**
 * Wersja bez abstrakcji i dziedziczenia
 * @author trener
 *
 */
public class Main {

	public static void main(String[] args) {
		ObslugaPojazdu<Pojazd> obsluga = new ObslugaPojazdu<Pojazd>();

		Pojazd juliaHulajnoga = new Hulajnoga(200, 150);
		Pojazd juliaSamochod = new Samochod(40, 3, 2);
		Pojazd juliaDeskorolka = new Deskorolka(4, "Kauczuk");
		Deskorolka deskorolka = (Deskorolka) juliaDeskorolka;

		// przepisz przy uzyciu obsluga i wykorzystaniu metody dodajPojazd()
		pojazdy.add(juliaDeskorolka);
		pojazdy.add(juliaHulajnoga);
		pojazdy.add(juliaSamochod);

		// wykorzystaj stream stream
		for (Pojazd pojazd : pojazdy) {
			obsluga.aktualizujPojazd(pojazd);
			obsluga.wypiszIPoruszajSie();
		}

		// podaj ilość pojazdów - utworz metode w obsludze

	}
}
