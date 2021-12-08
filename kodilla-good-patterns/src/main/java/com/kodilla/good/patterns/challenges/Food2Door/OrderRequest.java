package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class OrderRequest {

    private Customer customer;
    private FoodSupplier foodSupplier;
    private Map<Product, Integer> orderRequest;

    public OrderRequest(Customer customer, FoodSupplier foodSupplier, Map<Product, Integer> orderRequest) {
        this.customer = customer;
        this.foodSupplier = foodSupplier;
        this.orderRequest = orderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public Map<Product, Integer> getOrderRequest() {
        return orderRequest;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", foodSupplier=" + foodSupplier +
                ", orderRequest=" + orderRequest +
                '}';
    }
}
