package pl.sdacademy.java11poz.main;

import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.MapaPozycjiZamowienia;
import pl.sdacademy.java11poz.jadalnia.PozycjaZamowienia;
import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.Zamowienie;

public class ProgramJadalnia {
	protected final static Logger logger = Logger
			.getLogger(ProgramJadalnia.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		JadalniaUtil util = new JadalniaUtil(skaner);
		// tworzymy zamowienie dla nowego uzytkownika
		User uzytkownik = util.nowyUzytkownik();

		// numer zamowienia to data bez separatorow

		int numerZamowienia = util.generujNumerZamowienia();
		Zamowienie zamowienie = new Zamowienie(numerZamowienia);
		int pozycja;
		boolean warunekZakonczenia = true;
		while (warunekZakonczenia) {
			// start pętli
			// przedstawiamy menu
			util.wypiszMenu();
			// uzytkownik wybiera pozycje od 0 do 5
			// TODO 1 obsłużenie wyjątku podczas wpisania nie prawidłowej pozycji np
			// litery
			pozycja = skaner.nextInt();
			// TODO 2 walidacja liczba z zakresu od 0 do 5

			// TODO 3 warunek zakonczenia - to wpisanie zera
			if ("Dziękuje".equals(pozycja)) {
				warunekZakonczenia = false;
				break;
			}
			logger.log(Level.SEVERE, "Wybrana pozycja: " + pozycja);

			// tworzymy mape pozycji
			MapaPozycjiZamowienia pozycje = new MapaPozycjiZamowienia();
			// pobieramy wybrana pozycje z mapy
			PozycjaZamowienia pozycjaZamowienia = pozycje.getPozycjeMapa().get(pozycja);
			logger.log(Level.SEVERE, "Wybrana pozycja z mapy: " + pozycjaZamowienia);

			// dodajemy wybraną pozycje do zamowienia
			zamowienie.dodajPozycje(pozycjaZamowienia);

		}
		// koniec pętli
		// wypisanie rachunku

		float suma = 0;
		// uzywajac for'a sumujemy ceny pozycji i przypisujemy do zmiennej suma
		Set<PozycjaZamowienia> pozycjeZamowienia = zamowienie.getPozycje();
		for (PozycjaZamowienia pozycjaZamowienia : pozycjeZamowienia) {
			float cena = pozycjaZamowienia.getCena();
			suma += cena;
			// suma += pozycjaZamowienia.getCena();// to samo co wyżeji
		}

		System.out.println("Do zapłaty:" + suma);
		skaner.close();
	}
}
