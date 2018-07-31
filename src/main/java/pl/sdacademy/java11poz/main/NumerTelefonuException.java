package pl.sdacademy.java11poz.main;

/**
 * Własny wyjatek na potrzeby jadalni i nieprawidłowego numer telefonu
 * @author trener
 *
 */
public class NumerTelefonuException extends Exception {

	/**
	 * Konstruktor wyjatku numeru telefonu
	 * @param numerTelefonu uzytkownika
	 */
	public NumerTelefonuException(String numerTelefonu) {
		// slowo super odwoluje sie do rodzica
		super("Wprowadzony numer '" + numerTelefonu + "' jest nie prawidłowy !");
	}

}
