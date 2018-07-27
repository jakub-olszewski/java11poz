package pl.sdacademy.java11poz.main;

import java.util.Scanner;
import java.util.logging.Logger;

import pl.sdacademy.java11poz.jadalnia.User;

public class ProgramJadalnia {
	protected final static Logger logger = Logger
			.getLogger(ProgramJadalnia.class.getName()); // java.util.logging.Logger

	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		JadalniaUtil util = new JadalniaUtil(skaner);

		User uzytkownik = util.nowyUzytkownik();

		skaner.close();

	}
}
