package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class OrderProcessor {

    public void processAll(List<OrderRequest> orderRequestList) {

        orderRequestList.stream()
                .map(l -> {
                    System.out.println("Processing order:" + l.getCustomer().getName());
                    return l.getFoodSupplier().process(l.getCustomer(),l.getOrderRequest());
                })
                .forEach(s -> System.out.println("Status: " + s ));
    }
}
