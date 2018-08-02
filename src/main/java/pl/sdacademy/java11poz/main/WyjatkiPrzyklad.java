package pl.sdacademy.java11poz.main;

import java.util.InputMismatchException;

public class WyjatkiPrzyklad {

	public static void main(String[] args) {

		// obsłużenie wyjatku przez użycie try/catch
		try {
			pobierzZKonsoli();
		}
		catch (InputMismatchException e) {
			System.out.println("Wyjatek obsłużony :)");
		}

		System.out.println("Dalsze dzialanie programu...");

	}

	public static void pobierzZKonsoli() {
		// zrzucenie wyjatku o typie InputMismatchException
		throw new InputMismatchException();
	}

}
