package pl.sdacademy.java11poz.typy.generyczne;

/**
 * Klasa generyczna
 * @author trener
 *
 * @param <T>
 */
public class Kubeczek<T> {

	private T element;

	/*
	 * Konstruktor w kubeczek możemy włożyć co kolwiek
	 */
	public Kubeczek(T element) {
		this.element = element;
	}

	public T pobierzElement() {
		return element;
	}
}
