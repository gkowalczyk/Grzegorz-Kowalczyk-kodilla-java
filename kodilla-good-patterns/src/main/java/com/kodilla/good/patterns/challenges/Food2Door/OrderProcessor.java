package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    public void processAll(OrderRequest orderRequest) {

        orderRequest.getProducts().entrySet().stream()
                .map(l -> l.getKey().getFoodSupplier().process(orderRequest.getCustomer(), l.getKey(), l.getValue()))
                .forEach(System.out::println);
    }
}
