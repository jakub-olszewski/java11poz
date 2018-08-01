package pl.sdacademy.java11poz.figury.abstrakcja;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.java11poz.adnotacje.JavaTopic;
import pl.sdacademy.java11poz.adnotacje.MainClass;

/**
 * Wersja figury z abstrakcja i dziedziczeniem
 * @author trener
 *
 */
@JavaTopic(decription = "Figury, dziedziczenie, petle", topic = "Abstrakcja figury geometryczne", tags = {
		"a", "b" })
public class Main extends MainClass {

	public Main() {
		super();
	}

	public static void main(String[] args) {
		new Main();
		// tworzenie figur
		Figura kwadratFigura = new Kwadrat(3);
		Figura prostokatFigura = new Prostokąt(3, 5);
		Figura trapezFigura = new Trapez(3, 8, 4);

		// dodawnie do listy figury
		List<Figura> figury = new ArrayList<>();
		figury.add(kwadratFigura);
		figury.add(prostokatFigura);
		figury.add(trapezFigura);

		float sumaPol = 0;
		// suma pol figur liczona w petli for
		for (Figura figura : figury) {
			figura.obliczPole();
			figura.wypiszInformacje();
			sumaPol += figura.pobierzPole();
		}

		// wypisanie sumy pól
		System.out.println("Suma pol : " + sumaPol);
	}
}
