package pl.sdacademy.java11poz.wyjatki;

import java.util.Date;

public class WyjatkiCwiczenie1 {

	public static void main(String[] args) {

		Date data = pobierzDate(1, 6, 2018);
		System.out.println("Data: " + data);
	}

	public static Date pobierzDate(int dzien, int miesiac, int rok) {
		return new Date();
	}
}
