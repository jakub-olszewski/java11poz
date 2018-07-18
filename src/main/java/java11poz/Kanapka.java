package java11poz;

/**
 * Klasa opisująca kanapkę
 * 
 * @author trener
 *
 */
public class Kanapka {
	// public class oznacza klas
	String sklad;

	/**
	 * Konstruktor domyślny tworzący kanapkę z sałatą
	 */
	public Kanapka() {
		sklad = "salata";
		System.out.println("Zrobienie kanapki");
	}

	/**
	 * Metoda wypisująca skład kanapki
	 */
	public void wypiszSklad() {
		// public void oznacza metode która nic nie zwraca
		// nie zwraca bo wypisuje tylko na konsole
		System.out.println("Skład kanapki to: " + sklad);

	}

}
