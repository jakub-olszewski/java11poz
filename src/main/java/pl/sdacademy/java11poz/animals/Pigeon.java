package pl.sdacademy.java11poz.animals;

public class Pigeon extends Animal implements Vegetarian, Latanie {

	public Pigeon() {
		super("Pigeon");
	}

	@Override
	public void leciProsto() {
		System.out.println("Pigeon leci prosto...");
	}

	@Override
	public void jescWarzywa() {
		System.out.println("Pigeon je warzywa...");
	}

}
