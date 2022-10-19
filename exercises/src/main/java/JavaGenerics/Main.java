package JavaGenerics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//https://www.youtube.com/watch?v=LT6VZp52e-A&t=55s

        //Typy generyczne pozwalają na bezpieczne pobieranie typów, dzięki nim unikamy rzutowania
         // Klasa Ship może być sprarametryzowana klasą Pirate lub Merchant, jeednocześnie
        //klasa Ship staje się uniwersalna

        Ship<Pirate> pirateShip = new Ship();
        pirateShip.add(new Pirate("name", "surname"));
       Pirate pirate = pirateShip.findBySurname("surname");
        System.out.println((pirate.cannonShot()));


        Ship<Merchant> merchantShip = new Ship();
        merchantShip.add(new Merchant("name", "surname"));
        Merchant merchant = merchantShip.findBySurname("surname");
        List<Double> doubles = Arrays.asList(2d, 4d, 5d, 40d);
        List<Number> integerListList = Arrays.asList(2, 4, 5, 40);
        System.out.println(merchant.trade(doubles));





    }
}
