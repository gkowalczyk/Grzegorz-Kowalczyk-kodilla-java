package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class OrderRequest {

    private Customer customer;
    private FoodSupplier foodSupplier;
    private Map<Product, Integer> products;

    public OrderRequest(Customer customer, FoodSupplier foodSupplier, Map<Product, Integer> orderRequest) {
        this.customer = customer;
        this.foodSupplier = foodSupplier;
        this.products = orderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", foodSupplier=" + foodSupplier +
                ", orderRequest=" + products +
                '}';
    }
}
