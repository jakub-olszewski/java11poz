package pl.sdacademy.java11poz.animals;

public class Animal {

	String nazwa;

	public Animal(String nazwa) {
		super();
		this.nazwa = nazwa;
	}

	void poruszaSie() {
		System.out.println("Animal porusza sie...");
	}

	public void wypiszInformacje() {
		System.out.println("Nazwa: " + nazwa);
	}
}
