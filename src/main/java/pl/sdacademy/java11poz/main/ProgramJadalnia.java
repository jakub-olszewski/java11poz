package pl.sdacademy.java11poz.main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;

public class ProgramJadalnia {
	protected final static Logger logger = Logger
			.getLogger(ProgramJadalnia.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);

		logger.log(Level.INFO, "Wprowadź nazwisko:");

		// pobieranie wprowadzonego nazwiska
		String nazwisko = skaner.nextLine();
		// TODO pobrac dane od uzytkownika i
		// dopowiednio uzupelnic zmienne
		User uzytkownik = new UserImpl("", nazwisko);
		logger.log(Level.SEVERE, uzytkownik.toString());

	}
}
