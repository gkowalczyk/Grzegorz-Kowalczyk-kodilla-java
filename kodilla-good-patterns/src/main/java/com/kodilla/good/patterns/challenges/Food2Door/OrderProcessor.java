package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {

    public void processAll(OrderRequest orderRequest) {

        orderRequest.getProducts().entrySet().stream()
                .map(p -> p.getKey().getFoodSupplier().process(orderRequest.getCustomer(), p.getKey(), p.getValue()))
                .forEach(System.out::println);
        }
}
