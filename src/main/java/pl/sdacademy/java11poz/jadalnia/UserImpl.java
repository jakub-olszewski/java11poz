package pl.sdacademy.java11poz.jadalnia;

import java.util.Date;

import pl.sdacademy.java11poz.jadalnia.enums.Miasto;
import pl.sdacademy.java11poz.jadalnia.enums.Status;

public class UserImpl implements User {
	// ponizej znajduje sie lista pol
	String imie;
	String nazwisko;
	String numerTelefonu;

	int wiek;
	Miasto miasto; // "Miasto" to typ danych wyliczeniowy a "miasto" to nazwa zmiennej
	Date dataLogowania;

	// - tak jak w przypadku enum Miasto
	// w kostruktorze dopisac domyslny status - DOSTEPNY
	Status status;
	// tutaj konczy sie lista pol

	public String toString() {
		return "Dane uzytkownika: " + pobierzImieINazwisko();

	}

	public String pobierzImieINazwisko() {
		return imie + " " + nazwisko;
	}

	@Override
	public void wypiszImieINazwisko() {
		System.out.println(pobierzImieINazwisko());
	}

	// nazwa konstruktora jest taka sama jak nazwa klasy
	public UserImpl(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataLogowania = new Date();// new Date() obecna data
	}

	/**
	 * konstruktor tworzący użytkownika
	 * @param imie użytkownika
	 * @param nazwisko użytkownika
	 * @param miasto użytkownika
	 */
	public UserImpl(String imie, String nazwisko, Miasto miasto) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.miasto = miasto;
		this.status = Status.NIEAKTYWNY;
		this.dataLogowania = new Date();// new Date() obecna data

	}

	/**
	 * metoda ustawiajaca wiek uzytkownika (setter) potrzebuje argumentu ktory ustawiamy
	 * 
	 * @param wiek
	 */
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	/**
	 * metoda pobierajaca wiek uzytkownika (getter) nie potrzebuje argumentu poniewaz
	 * pobieramy te pole czyli wiek
	 * 
	 * @return
	 */
	public int getWiek() {
		return wiek;
	}

	public Miasto getMiasto() {
		return miasto;
	}

	public void setMiasto(Miasto miasto) {
		this.miasto = miasto;
	}

	@Override
	public String getImie() {
		return imie;
	}

	@Override
	public Date getDataLogowania() {
		return dataLogowania;
	}

	/**
	 * Metoda wypisujaca status z uzyciem funkcji switch
	 */
	@Override
	public void wypiszStatus() {
		if (status == null) {
			System.out.println("status jest null");
			return;
		}
		else {
			switch (status) {
			case DOSTEPNY:
				System.out.println("status: dostepny");
				break;
			case NIEDOSTEPNY:
				System.out.println("status: niedostepny");
				break;

			case NIEAKTYWNY:
				System.out.println("Status: nieaktywny, proszę o aktywacje konta");
				break;

			default:
				System.out.println("Status: pusty, brak statusu");
				break;
			}

		}

	}

	/**
	 * Wypisanie statusu
	 */
	public void wypiszStatus2() {
		System.out.println("Status: " + status);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNumerTelefonu() {
		return numerTelefonu;
	}

	public void setNumerTelefonu(String numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}
}
