package pl.sdacademy.java11poz.main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
			pozycja = Integer.parseInt(skaner.nextLine());
			logger.log(Level.SEVERE, "Wybrana pozycja: " + pozycja);
			// uzytkownik wybiera pozycje
			// dodajemy wybraną pozycje do zamowienia
			// warunek zakonczenia - słowo "dziekuje"
		}
		// koniec pętli
		// wypisanie rachunku
		skaner.close();

	}
}
