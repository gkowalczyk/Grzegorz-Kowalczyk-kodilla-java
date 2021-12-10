package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private String name;


    public Product(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

