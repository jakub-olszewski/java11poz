package pl.sdacademy.java11poz.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List lista = new ArrayList();
		lista.equals(null);

		Liczba3 lBezLambdy = new Liczba3() {
			@Override
			public float bezArgumentu() {
				return 3.14f;
			}
		};

		Liczba3 l = () -> 3.14f;
		System.out.println(l.bezArgumentu());
		// warunek parzystosc (a % 2) == 0

		Liczba l1 = (a) -> (a % 2) == 0;
		int liczba = 4;
		System.out.println(
				"implementacja parzystosci : " + liczba + " , " + l1.wartosc(liczba));
		l1 = (a) -> a > 5;
		System.out.println(
				"implementacja wieksza od 5 : " + liczba + " , " + l1.wartosc(liczba));

		l1 = (a) -> {
			System.out.println("test a=" + a);
			return a == 0;
		};
		System.out.println(l1.wartosc(5));
		l1.wartosc(3);

		Liczba2 l3 = (a, b) -> (a + b) > 10;
		Liczba2 l3BezLambda = new Liczba2() {
			@Override
			public boolean test(int a, int b) {
				return (a + b) > 10;
			}
		};
		System.out.println(l3.test(9, 6));

	}
}
