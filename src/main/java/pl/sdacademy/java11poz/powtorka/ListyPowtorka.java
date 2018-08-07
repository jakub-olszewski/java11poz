package pl.sdacademy.java11poz.powtorka;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.java11poz.hotel.PrettyPrinter;

public class ListyPowtorka {

	public static void main(String[] args) {

		List<Integer> listaLiczb = new ArrayList<>();
		listaLiczb.add(8);
		listaLiczb.add(9);

		List<Integer> listaLiczb2 = new ArrayList<>();
		System.out.println("rozmiar listy:" + listaLiczb.size());

		listaLiczb2.add(3);
		listaLiczb2.addAll(listaLiczb);// dodanie listyLiczb do listyLiczb2
		System.out.println("rozmiar listy:" + listaLiczb2.size());

		listaLiczb2.stream().forEach(System.out::println);

		// linie powyżej są równoznaczne
		listaLiczb2.stream().forEach(PrettyPrinter::wypisz);
		// listaLiczb2.stream().forEach(i -> System.out.println("-> element :" + i));

		listaLiczb2.add(6);
		System.out.println("rozmiar listy:" + listaLiczb2.size());
		listaLiczb2.remove(1);
		System.out.println("rozmiar listy:" + listaLiczb2.size());

	}

}
