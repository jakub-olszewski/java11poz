/**
 * 
 */
package java11poz;

/**
 * @author trener
 *
 */
public class Main {

	/**
	 * to jest komentarz wystepujacy na poczatku metody/konstruktora
	 */
	public Main() {
		// to jest komentarz wystepujacy w bloku kodu - miedzy klamerkami
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello !"); // ten kod wypisuje napis Hello ! na konsole
		System.out.println(Math.PI); // ten kod wypisuje liczbe PI na konsole

		int liczba; // deklaracja zmiennej
		liczba = 5; // inicjlizacja zmiennej
		int liczbaOsob = 15; // deklaracja i inicjalizacja jednocześnie
		int liczbaDrzwiWSamochodzie = 0;
		System.out.println("liczba " + liczbaDrzwiWSamochodzie);
		wypiszArgumentMetody(10);
		System.out.println("5 + 3");
		System.out.println(5 + 3);

		// TODO zrob metode sumaLiczb a b c i przypisz do zmiennej

	}

	public static void wypiszArgumentMetody(int argument) {
		System.out.println(argument + " to jest argument metody.");
	}

}
