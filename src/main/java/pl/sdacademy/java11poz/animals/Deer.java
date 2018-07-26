package pl.sdacademy.java11poz.animals;

public class Deer extends Mammal implements Vegetarian {

	@Override
	public void jescWarzywa() {
		System.out.println("Deer je warzywa...");
	}

	void jescTrawa() {
		System.out.println("Deer je trawe...");
	}

}
