package pl.sdacademy.java11poz.powtorka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormaterDatyPowtorka {

	public static void main(String[] args) {
		// stworzenie daty w danym formacie
		SimpleDateFormat formaterDaty = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// z napisu tworzym date
		String napis = "2018-08-07 17:30:00";
		try {
			Date dataZNapisu = formaterDaty.parse(napis);
			System.out.println(dataZNapisu);
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date date = new Date();
		// z daty tworzymy napis
		String napisZDaty = formaterDaty.format(date);
		System.out.println(napisZDaty);

	}
}
