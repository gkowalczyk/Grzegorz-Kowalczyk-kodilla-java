package JavaGenerics;

import java.util.List;

public class Merchant extends Mariner {

    public Merchant(String name, String surname) {
        super(name, surname);
    }
    public double trade(List<? extends Number> doubles) { // ? lista z dowolnym elementem - wildcard

        double sum = 0;
        for (Number numbers : doubles) {
            sum = sum + numbers.doubleValue();
        }
        return sum;
    }

}
