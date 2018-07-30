package pl.sdacademy.java11poz.main;

import pl.sdacademy.java11poz.pojazdy.Rower;

import java.util.HashSet;
import java.util.Optional;

public class OptionalCwiczenia {

    public static void main(String[] args) {

        Rower rower = new Rower("MyBike");
        Rower rowerPusty = null;
        // zrzucenie wyjątku
        //Optional optionalPrzyklad = Optional(rower);

        Optional optionalOf = Optional.of(rower);

        System.out.println("optional of is "+optionalOf.isPresent());


    }

    public static void sprawdzRower(Rower rower){

        Optional<Rower> optionalOf = Optional.of(rower);
        if(optionalOf.isPresent()){
            // wykonaj kod jesli istnieje rower
            Rower rowerZOptional = optionalOf.get();
            rowerZOptional.czyJestNaStanie();
        }else{
            // wykonaj kod jesli rower nie istnieje
            System.out.println("Brak roweru!");
        }
    }

    public static void sprawdzRowerBezOptional(Rower rower){

        if(rower!=null){
            // wykonaj kod jesli istnieje rower
            rower.czyJestNaStanie();
        }else{
            // wykonaj kod jesli rower nie istnieje
            System.out.println("Brak roweru!");
        }
    }

}
