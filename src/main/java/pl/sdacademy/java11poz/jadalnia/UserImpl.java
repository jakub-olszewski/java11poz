package pl.sdacademy.java11poz.jadalnia;

import java.util.Date;

import javax.net.ssl.SSLEngineResult.Status;

public class UserImpl implements User {

	String imie;
	String nazwisko;
	int wiek;
	Miasto miasto; // "Miasto" to typ danych wyliczeniowy a "miasto" to nazwa zmiennej
	Date dataLogowania;
	// TODO stworzyc enum Status [DOSTEPNY,NIEDOSTEPNY,NIEAKTYWNY]
	// - tak jak w przypadku enum Miasto
	// w kostruktorze dopisac domyslny status - DOSTEPNY
	Status status;

	// TODO getter i setter status

	public String toString() {
		return pobierzImieINazwisko();

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

	public UserImpl(String imie, String nazwisko, Miasto miasto) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.miasto = miasto;
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

	@Override
	public void wypiszStatus() {
		// TODO wypisz status syso

	}
}
