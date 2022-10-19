package JavaGenerics;

import java.util.Random;

public class Pirate extends Mariner {


    public Pirate(String name, String surname) {
        super(name, surname);
    }
    public double cannonShot() {
        return new Random().nextDouble();
    }
}
