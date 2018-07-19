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
	 * metoda ustawiajaca wiek uzytkownika (setter)
	 * 
	 * @param wiek
	 */
	@Override
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	/**
	 * metoda pobierajaca wiek uzytkownika (getter)
	 * 
	 * @return
	 */
	public int getWiek() {
		return wiek;
	}

}
