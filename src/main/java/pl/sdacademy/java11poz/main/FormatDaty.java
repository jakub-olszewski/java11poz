/**
 * 
 */
package pl.sdacademy.java11poz.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author trener
 *
 */
public class FormatDaty {

	/**
	 * Mamy SimpleDateFormat Formater posiada konstruktor przyjmujący format/wzór/pattern
	 * np "yyyy-MM-dd" Posiada metody:</br>
	 * - parse() - zmienia napis na date</br>
	 * - format() - zmiana date na napis</br>
	 */
	public FormatDaty() {
	}

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		// błędny format
		// wypiszDateWFormacie("kurs", "dd.MM.ss");

		String format = "MM/dd/yyyy HH:mm:ss";
		Date data = new Date();// nowa data to obecna data
		System.out.println("2018-01-01" + " " + "yyyy-MM-dd");

		Date dataZFormatu = utworzDateZNapisuWFormacie("2018-01-01", "yyyy-MM-dd");// parse()
																					// zmieniamy
																					// napis
																					// na
																					// date
		System.out.println(dataZFormatu);
		wypiszStringZDatyWFormacie(dataZFormatu, format);
	}

	/**
	 * Metoda zmienia date na napis w danym formacie
	 * @param data
	 * @param format
	 */
	private static void wypiszStringZDatyWFormacie(Date data, String format) {

		// date formater służący do formatowania daty w danym formacie
		DateFormat df = new SimpleDateFormat(format);

		// date zamieniamy na napis w danym formacie przy użyciu formatera df
		String reportDate = df.format(data);

		// wypisujemy napis
		System.out.println("Data: " + reportDate);
	}

	/**
	 * 
	 * @param dataString
	 * @throws ParseException to jest wyjątek przekształcania napisu na datę, tworzy się _
	 * wówczas gdy zamiast daty jako argument zostanie podany napis niezgodny z formatem _
	 * daty
	 */
	public static Date utworzDateZNapisuWFormacie(String napisData, String formatDaty)
			throws ParseException {
		// data wprowadzona np. w formularzu
		// String napisData = "2018-07-23";

		// Data formatter czyli klasa która odpowiedzialna jest za zmianę formatu daty
		SimpleDateFormat dateFormat = new SimpleDateFormat(formatDaty);

		// parse - przeksztalcic
		// przekształcamy napis (String) w date (Date)
		return dateFormat.parse(napisData);

	}

}
