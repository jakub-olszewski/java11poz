package pl.sdacademy.java11poz.main;

import java.util.Random;

public class LosoweLiczby {

	public static void main(String[] args) {
		Random r = new Random();
		int[] piecLosowychLiczb = r.ints(5, 0, 11).toArray();
		for (int num : piecLosowychLiczb) {
			System.out.println(num);
		}
	}
}
