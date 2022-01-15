package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class OrderRequest {

    private Customer customer;
    private Map<Product, Integer> products;

    public OrderRequest(Customer customer, Map<Product, Integer> orderRequest) {
        this.customer = customer;

        this.products = orderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "customer=" + customer +
                ", orderRequest=" + products +
                '}';
    }
}
