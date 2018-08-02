package pl.sdacademy.java11poz.main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		// pobrac dane od uzytkownika i
		// dopowiednio uzupelnic zmienne

		// pobieramy ze skanera
		User uzytkownik = new UserImpl(imie, nazwisko);

		boolean warunekPoprawnegoNumeruTelefonu = true;
		while (warunekPoprawnegoNumeruTelefonu) {

			System.out.println("Wprowadź numer telefonu:");
			String numerTelefonu = skaner.nextLine();
			// sprawdzamy czy jest zgodny z wzorcem wyrazenia regularnego
			// w przypadku niezgodnosci zrzucamy wyjatek
			try {
				walidacjaNumeruTelefonu(numerTelefonu);
				// linia poniżej wykonuje się gdy linia powyżej nie zrzuca wyjątku
				warunekPoprawnegoNumeruTelefonu = false;
			}
			catch (NumerTelefonuException e) {
				// wyjatek łapiemy i wyswietlamy komunikat
				System.err.println(e.getMessage());
			}
			// prosimy o ponowne wpisanie numeru telefonu (pętla)
		}

		uzytkownik.setNumerTelefonu("234234");
		logger.log(Level.SEVERE, uzytkownik.toString());
		return uzytkownik;
	}

	/**
	 * Metoda waliduje numer telefonu,
	 * @param numerTelefonu
	 * @throws NumerTelefonuException wrzuca wyjatek w przypadku blednego numeru
	 */
	private void walidacjaNumeruTelefonu(String numerTelefonu)
			throws NumerTelefonuException {
		Pattern compiledPattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
		Matcher matcher = compiledPattern.matcher(numerTelefonu);
		boolean czyNumerJestPrawidlowy = matcher.matches();
		System.out.println("Numer jest " + czyNumerJestPrawidlowy);

		// tutaj zrzucic wyjatek throw
		// wykrzyknik negacja warunku !=>'nie'
		if (!czyNumerJestPrawidlowy) {
			throw new NumerTelefonuException(numerTelefonu);
		}
	}

	public int generujNumerZamowienia() {
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
		System.out.println("");
		System.out.println("0. Wyjście");
		System.out.println("===============================");
		System.out.println("Wybór:");

	}

}
