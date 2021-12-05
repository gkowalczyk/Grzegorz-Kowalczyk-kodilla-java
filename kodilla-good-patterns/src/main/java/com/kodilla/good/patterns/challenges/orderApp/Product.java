package com.kodilla.good.patterns.challenges.orderApp;

public class Product {
    private String name;
    private String category;
    private int amount;

    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public int getAmount() {
        return amount;
    }
    public Product(String name, String category, int amount) {
        this.name = name;
        this.category = category;
        this.amount = amount;
    }
}
