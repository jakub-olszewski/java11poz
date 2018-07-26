package pl.sdacademy.java11poz.scanner;

import java.util.Scanner;

public class ScannerSystemIn {

	public static void main(String[] args) {

		// System.in wprowadzanie znakow przez system
		Scanner skaner = new Scanner(System.in);

		System.out.println("Wprowadz imie:");
		String napis = skaner.nextLine();// wczytanie znakow koniec wprowadzania to enter

		System.out.println("Witaj " + napis + " :)");

	}
}
