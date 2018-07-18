package java11poz;

/**
 * Rower to klasa/ obiekt opisująca obiekt, klasa charakteryzyję się tym, że
 * przed jej nazwą znajduję się class (obiekt)
 * 
 * @author trener
 *
 */
public class Rower {
	String kolor = "zielony";

	/**
	 * To jest konstruktor bezargumentowy tworzący rower
	 */
	public Rower() {
		// To jest ciało konstruktora
		System.out.println("Konstruowanie roweru o kolorze " + kolor);

	}

	public Rower(String nowyKolor) {
		kolor = nowyKolor;
		System.out.println("Konstruowanie roweru o kolorze " + kolor);
	}

	// TODO konstruktor z nazwą rowera

	// TODO konsturktor z nazwą rowera i kolorem

}
