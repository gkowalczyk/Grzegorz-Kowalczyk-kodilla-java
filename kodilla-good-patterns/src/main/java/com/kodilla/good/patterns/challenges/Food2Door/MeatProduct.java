package com.kodilla.good.patterns.challenges.Food2Door;

public class MeatProduct extends Product {

    private String typeOfMeat;

    public MeatProduct(String name, FoodSupplier foodSupplier, String typeOfMeat) {
        super(name, foodSupplier);
        this.typeOfMeat = typeOfMeat;
    }
}
