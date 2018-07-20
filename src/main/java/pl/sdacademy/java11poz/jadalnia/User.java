package pl.sdacademy.java11poz.jadalnia;

/**
 * Interfejs użytkownika opisujący tylko metody
 * 
 * @author trener
 *
 */
public interface User {
	/**
	 * metoda wypisująca informacje o użytkowniku, metody w interfejsie nie zawierają "{}"
	 * 
	 * @return opis
	 */
	public String toString();

	/**
	 * metoda pobiera imię i nazwisko użytkownika
	 * 
	 * @return imię i nazwisko
	 */
	public String pobierzImieINazwisko();

	/**
	 * metoda wypisuje na konsolę imię i nazwisko
	 */
	public void wypiszImieINazwisko();

	public int getWiek();

	void setWiek(int wiek);

	public Miasto getMiasto();

	public String getImie();

}
