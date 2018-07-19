package java11poz;

public class UserImpl implements User {

	String imie;
	String nazwisko;
	int wiek;

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

	/**
	 * metoda ustawiajaca wiek uzytkownika (setter) potrzebuje argumentu ktory
	 * ustawiamy
	 * 
	 * @param wiek
	 */
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	/**
	 * metoda pobierajaca wiek uzytkownika (getter) nie potrzebuje argumentu
	 * poniewaz pobieramy te pole czyli wiek
	 * 
	 * @return
	 */
	public int getWiek() {
		return wiek;
	}
}
