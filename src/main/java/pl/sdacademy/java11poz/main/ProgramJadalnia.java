package pl.sdacademy.java11poz.main;

import java.util.InputMismatchException;
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

		Scanner skaner;
		while (true) {
			skaner = new Scanner(System.in);
			JadalniaUtil util = new JadalniaUtil(skaner);
			System.out.println("=============================================");
			System.out.println("====== W i t a m y   w   J a d a l n i ======");
			System.out.println("=============================================");

			// tworzymy zamowienie dla nowego uzytkownika
			User uzytkownik = util.nowyUzytkownik();

			// numer zamowienia to data bez separatorow

			int numerZamowienia = util.generujNumerZamowienia();
			Zamowienie zamowienie = new Zamowienie(numerZamowienia);
			int pozycja = 0;
			boolean warunekZakonczenia = true;
			while (warunekZakonczenia) {
				// start pętli
				// przedstawiamy menu
				util.wypiszMenu();
				// uzytkownik wybiera pozycje od 0 do 5
				// TODO 1 obsłużenie wyjątku podczas wpisania nie prawidłowej pozycji np
				// litery
				boolean warunekZakonczeniaPobieraniaPozycji = true;

				while (warunekZakonczeniaPobieraniaPozycji) {

					try {
						pozycja = skaner.nextInt();

						// TODO 2 walidacja liczba z zakresu od 0 do 5
						// uzycie operatorów matematycznych
						// instrukcja warunkowa
						boolean czyPozycjaIstniejeWZakresie = pozycja < 5 && pozycja >= 0;
						if (czyPozycjaIstniejeWZakresie) {
							warunekZakonczeniaPobieraniaPozycji = false;
						}
					}
					catch (InputMismatchException e) {
						System.out.println(
								"Nie prawidłowa pozycja! Proszę o wybranie pozycji 0-5");
						skaner = new Scanner(System.in);
					}
					// System.out.println("Dalsze działanie programu...");
				}

				// TODO 3 warunek zakonczenia - to wpisanie zera
				if (pozycja == 0) {// == porównanie , = równość
					warunekZakonczenia = false;
					break;
				}

				logger.log(Level.SEVERE, "Wybrana pozycja: " + pozycja);

				// tworzymy mape pozycji
				MapaPozycjiZamowienia pozycje = new MapaPozycjiZamowienia();
				// pobieramy wybrana pozycje z mapy
				PozycjaZamowienia pozycjaZamowienia = pozycje.getPozycjeMapa()
						.get(pozycja);
				logger.log(Level.SEVERE, "Wybrana pozycja z mapy: " + pozycjaZamowienia);

				// dodajemy wybraną pozycje do zamowienia
				zamowienie.dodajPozycje(pozycjaZamowienia);
				logger.log(Level.SEVERE,
						"ilosc pozycji: " + zamowienie.getPozycje().size());

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
			System.out.println("----------------------------");
			System.out.println(uzytkownik.pobierzImieINazwisko());
			System.out.println(uzytkownik.getDataLogowania());
			System.out.println(uzytkownik.getNumerTelefonu());
			System.out.printf("Do zapłaty   %.2f zł%n", suma);
			System.out.printf("Podatek 3%%   %.2f zł%n", (suma * .03));
			System.out.println("----------------------------");
			// skaner.close();
		}

		//
	}
}
