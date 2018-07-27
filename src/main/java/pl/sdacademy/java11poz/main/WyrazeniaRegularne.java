package pl.sdacademy.java11poz.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {

	public static void main(String[] args) {
		// wyrazenie ze slajdu
		Pattern compiledPattern = Pattern.compile("Marcin");
		Matcher matcher = compiledPattern.matcher("A tata Marcina powiedział");

		System.out.println(matcher.find()); // wyszukanie zawierajacego
		System.out.println(matcher.matches()); // wyszukanie rownego/wystepujacego

		compiledPattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
		matcher = compiledPattern.matcher("387-123-123");
		System.out.println("Czy numer jest ok ? " + matcher.matches());

		boolean poprawnyNumer = czyNumerTelefonuJestPoprawny("123-123-123");
		System.out.println("Numer jest " + poprawnyNumer);

		// dla chętnych wprowadzenie numeru z klawiatury
		System.out.println("ala\\tma\\nkota");
	}

	private static boolean czyNumerTelefonuJestPoprawny(String numerTelefonu) {
		Pattern compiledPattern = Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
		Matcher matcher = compiledPattern.matcher(numerTelefonu);
		return matcher.matches();
	}

}
