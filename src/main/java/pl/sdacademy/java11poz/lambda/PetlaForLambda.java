package pl.sdacademy.java11poz.lambda;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.java11poz.figury.abstrakcja.Figura;
import pl.sdacademy.java11poz.figury.abstrakcja.Kwadrat;
import pl.sdacademy.java11poz.figury.abstrakcja.Prostokąt;
import pl.sdacademy.java11poz.figury.abstrakcja.Trapez;

public class PetlaForLambda {

	public static void main(String[] args) {

		// tworzenie figur
		Figura kwadratFigura = new Kwadrat(3);
		Figura prostokatFigura = new Prostokąt(3, 5);
		Figura trapezFigura = new Trapez(3, 8, 4);

		// dodawnie do listy figury
		List<Figura> figury = new ArrayList<>();
		figury.add(kwadratFigura);
		figury.add(prostokatFigura);
		figury.add(trapezFigura);

		// for (Figura figura : figury) {
		// figura.obliczPole();
		// figura.wypiszInformacje();
		// }
		figury.forEach((figura) -> {
			figura.obliczPole();
			figura.wypiszInformacje();
		});
	}
}
