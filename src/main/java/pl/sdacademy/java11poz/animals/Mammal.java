package pl.sdacademy.java11poz.animals;

public class Mammal extends Animal {

	public Mammal(String nazwa) {
		super(nazwa);// konstruktor rodzica/przodka czyli Animalsa
	}

	public void jescWarzywa() {
		System.out.println("Deer je warzywa...");
	}

	void jescTrawa() {
		System.out.println("Deer je trawe...");
	}
}
