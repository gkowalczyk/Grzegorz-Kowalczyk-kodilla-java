package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.Objects;

public class Product {

    private String name;
    private FoodSupplier foodSupplier;

    public Product(String name, FoodSupplier foodSupplier) {
        this.name = name;
        this.foodSupplier = foodSupplier;
    }

    public String getName() {
        return name;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && foodSupplier.equals(product.foodSupplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foodSupplier);
    }
}

