package pl.sdacademy.java11poz.main;

public class Test {

	public Test() {
		//
	}

	public static void main(String[] args) {

		pobierzLiczbeSekund(-1);
	}

	public static int pobierzLiczbeSekund(int godzina) {
		if (godzina < 0) {
			throw new IllegalArgumentException("Godzina musi byc >= 0: " + godzina);
		}
		return godzina * 60 * 60;
	}
}
