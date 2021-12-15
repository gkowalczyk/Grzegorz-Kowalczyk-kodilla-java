package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
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

    public void setName(String name) {
        this.name = name;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public void setFoodSupplier(FoodSupplier foodSupplier) {
        this.foodSupplier = foodSupplier;
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



