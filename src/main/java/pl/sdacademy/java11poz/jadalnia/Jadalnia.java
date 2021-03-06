package pl.sdacademy.java11poz.jadalnia;

import pl.sdacademy.java11poz.jadalnia.jedzenie.Kanapka;

/**
 * To jest interfejs, czyli zbiór metod, które są opisane takimi informacjami jak:
 * argumenty, obiekty zwracane np. kanapka
 * 
 * @author trener
 *
 */
public interface Jadalnia {
	/**
	 * Metoda tworząca kanapkę "domyślną", bez argumentową, tylko z sałatą
	 * 
	 * @return Metoda zwraca kanapkę
	 */
	Kanapka zrobKanapke();

	// widocznosc typZmiennejZwracanej nazwaMetody(typArgumentu argument)
	boolean czyPelnoletni(User uzytkownik);

	/**
	 * metoda która sprawdza czy użytkownik jest z Poznania
	 * @param uzytkownik z jadalni
	 * @return prawda jeśli jest z Poznania a fałsz jeśli nie jest z Poznania
	 */
	boolean czyZPoznania(User uzytkownik);

}
