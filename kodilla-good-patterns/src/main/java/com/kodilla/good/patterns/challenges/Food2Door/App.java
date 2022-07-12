package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        FoodSupplier extraFoodShop = new ExtraFoodShop();
        Customer customer1 = new Customer("Customer 1");
        OrderRequest orderRequest = new OrderRequest(
                customer1,
                Map.of(
                        new Product("beef", extraFoodShop), 2
                )
        );
        orderProcessor.processAll(orderRequest);
    }
}


