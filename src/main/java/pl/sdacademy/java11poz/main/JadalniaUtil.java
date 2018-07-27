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
		logger.log(Level.INFO, "Wprowadź imie:");
		// pobieranie wprowadzonego nazwiska
		String imie = skaner.nextLine();

		logger.log(Level.INFO, "Wprowadź nazwisko:");
		// pobieranie wprowadzonego nazwiska
		String nazwisko = skaner.nextLine();
		// TODO pobrac dane od uzytkownika i
		// dopowiednio uzupelnic zmienne
		User uzytkownik = new UserImpl(imie, nazwisko);
		logger.log(Level.SEVERE, uzytkownik.toString());
		return uzytkownik;
	}

}
