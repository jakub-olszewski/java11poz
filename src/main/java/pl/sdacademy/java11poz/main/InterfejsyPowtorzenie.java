package pl.sdacademy.java11poz.main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.Jadalnia;
import pl.sdacademy.java11poz.jadalnia.JadalniaChlopskaImpl;
import pl.sdacademy.java11poz.jadalnia.JadalniaPoznanskaImpl;
import pl.sdacademy.java11poz.jadalnia.User;
import pl.sdacademy.java11poz.jadalnia.UserImpl;
import pl.sdacademy.java11poz.jadalnia.enums.Miasto;

public class InterfejsyPowtorzenie {
	// utworzenie statycznego loggera
	protected final static Logger logger = Logger
			.getLogger(InterfejsyPowtorzenie.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {
		Jadalnia jadalniaChlopska = new JadalniaChlopskaImpl();
		Jadalnia jadalniaPoznanska = new JadalniaPoznanskaImpl();

		// ArrayList to implemetnacja interfejsu lista
		List<Jadalnia> listaJadalni = new ArrayList<>();
		listaJadalni.add(jadalniaPoznanska);
		listaJadalni.add(jadalniaChlopska);

		User uzytkownik = new UserImpl("Jan", "Kowalski", Miasto.TORUN);

		for (Jadalnia jadalnia : listaJadalni) {
			boolean czyZPoznaniaZmienna = jadalnia.czyZPoznania(uzytkownik);
			logger.info(czyZPoznaniaZmienna + "");
		}
	}
}
