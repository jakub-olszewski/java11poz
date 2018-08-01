package pl.sdacademy.java11poz.typy.generyczne;

import pl.sdacademy.java11poz.adnotacje.JavaTopic;
import pl.sdacademy.java11poz.adnotacje.MainClass;
import pl.sdacademy.java11poz.pojazdy.Rower;

@JavaTopic(decription = "Tworzenie Kubeczka jako typ generyczny", topic = "Typy generyczne")
public class Main extends MainClass {

	public static void main(String[] args) {
		new Main().implementacjaProgramu();
	}

	@Override
	public void implementacjaProgramu() {
		System.out.println("Ale fajnie nie ma main'a hahaha");
		// int vs Integer
		// typy prymitywne :int double float char
		Kubeczek<Integer> kubeczekZIntem = new Kubeczek<>(3);
		System.out.println(kubeczekZIntem.pobierzElement());

		Rower rowerAni = new Rower("Rower Ani");
		Kubeczek<Rower> kubeczekZRowerem = new Kubeczek<Rower>(rowerAni);
		System.out.println(kubeczekZRowerem.pobierzElement());

	}

}
