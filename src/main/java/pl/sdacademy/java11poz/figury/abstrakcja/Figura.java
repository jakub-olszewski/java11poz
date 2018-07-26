package pl.sdacademy.java11poz.figury.abstrakcja;

public abstract class Figura {
	float obwod;
	float pole;
	int liczbaWierzcholkow;
	int liczbaPrzekatnych;

	public void wypiszInformacje() {
		System.out.println("Figura [obwod=" + obwod + ", pole=" + pole
				+ ", liczbaWierzcholkow=" + liczbaWierzcholkow + ", liczbaPrzekatnych="
				+ liczbaPrzekatnych + "]");
	}

	public abstract void obliczPole();

	public float pobierzPole() {
		return pole;
	}
}