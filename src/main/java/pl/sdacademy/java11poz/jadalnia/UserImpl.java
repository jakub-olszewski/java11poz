package pl.sdacademy.java11poz.jadalnia;

public class UserImpl implements User {

	String imie;
	String nazwisko;
	int wiek;
	Miasto miasto; // "Miasto" to typ danych wyliczeniowy a "miasto" to nazwa zmiennej

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
	}

	public UserImpl(String imie, String nazwisko, Miasto miasto) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.miasto = miasto;
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
}
