/**
 * 
 */
package pl.sdacademy.java11poz.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author trener
 *
 */
public class FormatDaty {

	/**
	 * 
	 */
	public FormatDaty() {
	}

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		// "dd.MM.yyyy HH:mm:ss"
		wypiszDateWFormacie("2018-07-23", "yyyy-MM-dd");
		wypiszDateWFormacie("23.07.2018 16:05:00", "dd.MM.yyyy HH:mm:ss");

		// błędny format
		wypiszDateWFormacie("kurs", "dd.MM.ss");

	}

	/**
	 * 
	 * @param dataString
	 * @throws ParseException to jest wyjątek przekształcania napisu na datę, tworzy się _
	 * wówczas gdy zamiast daty jako argument zostanie podany napis niezgodny z formatem _
	 * daty
	 */
	public static void wypiszDateWFormacie(String napisData, String formatDaty)
			throws ParseException {
		// data wprowadzona np. w formularzu
		// String napisData = "2018-07-23";

		// Data formatter czyli klasa która odpowiedzialna jest za zmianę formatu daty
		SimpleDateFormat dateFormat = new SimpleDateFormat(formatDaty);

		// parse - przeksztalcic
		// przekształcamy napis (String) w date (Date)
		Date dataPrzeksztalconaZNapisu = dateFormat.parse(napisData);

		System.out.println(dataPrzeksztalconaZNapisu);
		System.out.println(new Date());

	}

}
