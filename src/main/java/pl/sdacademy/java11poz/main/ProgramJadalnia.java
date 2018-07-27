package pl.sdacademy.java11poz.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;

public class ProgramJadalnia {
	protected final static Logger logger = Logger
			.getLogger(ProgramJadalnia.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {

		// TODO pobrac dane od uzytkownika i
		// dopowiednio uzupelnic zmienne
		User uzytkownik = new UserImpl(imie, nazwisko);
		logger.log(Level.SEVERE, uzytkownik.toString());

	}
}
