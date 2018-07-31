package pl.sdacademy.java11poz.wyjatki;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WyjatkiCwiczenie1 {

	public static void main(String[] args) {

		Date data = pobierzDate(1, 6, 2018);
		System.out.println("Data: " + data);
		// try {
		// // FormatDaty.wypiszDateWFormacie("", "dd/mm/yyyy");
		// }
		// catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		System.out.println("Nic sie nie stało wyjątek obsłużony :)");
	}

	public static Date pobierzDate(int dzien, int miesiac, int rok) {

		String napisData = dzien + "/" + miesiac + "/" + rok;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataPrzeksztalconaZNapisu = null;
		try {
			dataPrzeksztalconaZNapisu = dateFormat.parse(napisData);
		}
		catch (ParseException e) {
			System.err.println("Nie prawidłowy format daty!");
		}

		if (dzien < 0) {
			throw new IllegalArgumentException("Dzien musi byc >= 0: " + dzien);
		}
		if (miesiac < 0) {
			throw new IllegalArgumentException("Miesiac musi byc >= 0: " + miesiac);
		}
		if (rok < 0) {
			throw new IllegalArgumentException("Rok musi byc >= 0: " + rok);
		}
		// zrzucic wyjatki w przypadku nie prawidłowych
		// danych wejściowych dzien miesiac rok

		// w przypadku prawidłowych danych wejściowych
		// tworzymy datę
		return dataPrzeksztalconaZNapisu;
	}
}
