package pl.sdacademy.java11poz.powtorka;

public class TablicePowtorka {

	public static void main(String[] args) {
		// Typ[] nazwaTablicy = new Typ[dlugosc]
		// dlugosc czyli ilosc pozycji/wagoników
		double[] tablicaLiczb = new double[10];
		tablicaLiczb[0] = 123;// przypisaliśmy wartość do pozycji 0

		// tablicaLiczb.length;
		// 00 01 02
		// 10 11 12
		// 20 21 22
		int[][] tablicaLiczbDwuwymiarowa = new int[3][3];
		tablicaLiczbDwuwymiarowa[0][0] = 0;
		tablicaLiczbDwuwymiarowa[1][1] = 1;

		int[] tablicaLiczbJednowymiarowa = new int[9];
		tablicaLiczbJednowymiarowa[0] = 0;
		// 0 1 2
		// 3 4 5
		// 6 7 8
		tablicaLiczbJednowymiarowa[4] = 1;

		// Arrays.asList(tablicaLiczbJednowymiarowa).stream()
	}
}
