package pl.sdacademy.java11poz.animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Dziedziczenie na przykladzie zwierzat
 * @author trener
 *
 */
public class Main {

	public static void main(String[] args) {

		// jelen jest jeleniem
		// jelen jest ssakiem
		// jelen jest zwierzakiem
		// jelen jest wegetarianinem
		Animal jelen = new Deer();
		((Deer) jelen).jescTrawa();// nie kazdy zwierzak je trawe
		((Deer) jelen).jescWarzywa();// nie kazdy zwierzak je warzywa
		jelen.poruszaSie();// ale kazdy zwierzak sie porusza

		Animal pigeon = new Pigeon();

		List<Animal> zwierzaki = new ArrayList<>();
		zwierzaki.add(pigeon);
		zwierzaki.add(jelen);

		for (Animal animal : zwierzaki) {
			animal.wypiszInformacje();
		}

	}
}
