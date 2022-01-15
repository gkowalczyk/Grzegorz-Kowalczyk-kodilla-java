package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Customer {
    private String name;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }
}
