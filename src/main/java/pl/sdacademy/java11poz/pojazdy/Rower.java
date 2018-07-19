package pl.sdacademy.java11poz.pojazdy;

/**
 * Rower to klasa/ obiekt opisująca obiekt, klasa charakteryzyję się tym, że
 * przed jej nazwą znajduję się class (obiekt)
 * 
 * @author trener
 *
 */
public class Rower {
	String kolor = "zielony";
	String nazwa;// nazwa to właściwość/pole roweru

	/**
	 * To jest konstruktor bezargumentowy tworzący rower o kolorze domyślnym zielony
	 */
	public Rower() {
		// To jest ciało konstruktora
		System.out.println("Konstruowanie roweru o kolorze " + kolor);

	}

	// /**
	// * To jest konstruktor tworzący rower o kolorze podanym w argumencie
	// *
	// * @param nowyKolor
	// * to jest argument metody oznaczający nowy kolor, który będzie użyty
	// * do tworzenia roweru
	// */
	// public Rower(String nowyKolor) {
	// kolor = nowyKolor;
	// System.out.println("Konstruowanie roweru o kolorze " + kolor);
	// }

	public Rower(String nazwa, String kolorRoweru) {
		this.nazwa = nazwa;
		kolor = kolorRoweru;
		// nazwa = "romet";
		System.out.println("Konstruowanie roweru " + nazwa + "o kolorze" + kolor);
	}

	/**
	 * Metoda zwracający stan magazynowy stanu roweru
	 */
	public void czyJestNaStanie() {
		System.out.println("Tak jest na stanie");
	}

	public Rower(String nazwa) {
		this.nazwa = nazwa; // słowo this oznacza klasę w której jesteśmy a po kropce
		// odwołujemy się do pola lub metody
	}

}
