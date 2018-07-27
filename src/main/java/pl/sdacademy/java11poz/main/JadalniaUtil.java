package pl.sdacademy.java11poz.main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;

public class JadalniaUtil {
	protected final static Logger logger = Logger.getLogger(JadalniaUtil.class.getName()); // java.util.logging.Logger
	private Scanner skaner;

	public JadalniaUtil(Scanner skaner) {
		this.skaner = skaner;
	}

	public User nowyUzytkownik() {
		System.out.println("Wprowadź imie:");
		// pobieranie wprowadzonego nazwiska
		String imie = skaner.nextLine();

		System.out.println("Wprowadź nazwisko:");
		// pobieranie wprowadzonego nazwiska
		String nazwisko = skaner.nextLine();
		// TODO pobrac dane od uzytkownika i
		// dopowiednio uzupelnic zmienne
		User uzytkownik = new UserImpl(imie, nazwisko);
		logger.log(Level.SEVERE, uzytkownik.toString());
		return uzytkownik;
	}

	public int generujNumerZamowienia() {
		// TODO
		return 0;
	}

	public void wypiszMenu() {
		// wypisanie menu przy uzyciu loggera
		System.out.println("===============================");
		System.out.println("Witamy w jadalni :) ");
		System.out.println("---------------------");
		System.out.println("Menu:");
		System.out.println("1. Pizza Margarita");
		System.out.println("2. Pizza Poznanska");
		System.out.println("3. Pizza Krakowska");
		System.out.println("===============================");
		System.out.println("Wybór:");

	}

}
