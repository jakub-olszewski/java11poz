package pl.sdacademy.java11poz.powtorka;

public class SwitchIfPowtorka {

	enum Swiatlo {
		ZIELONE, ZOLTE, CZERWONE
	};

	public static void main(String[] args) {

		Swiatlo aktualneSwiato = Swiatlo.ZIELONE;
		// if
		if (aktualneSwiato == Swiatlo.ZIELONE) {
			System.out.println("Można iść ;)");
		}
		else if (aktualneSwiato == Swiatlo.CZERWONE) {
			System.out.println("Nie można iść !");
		}
		else if (aktualneSwiato == Swiatlo.ZOLTE) {
			System.out.println("Uwaga!?");
		}
		System.out.println();

		// switch
		String wiadomosc;
		switch (aktualneSwiato) {
		case ZIELONE:
			wiadomosc = "Można iść ;)";
			break;
		case ZOLTE:
			wiadomosc = "Uwaga!?";
			break;
		case CZERWONE:
			wiadomosc = "Nie można iść !";
			break;
		default:
			wiadomosc = "Nie znane światło";
			break;
		}
		System.out.println(wiadomosc);
	}

}
