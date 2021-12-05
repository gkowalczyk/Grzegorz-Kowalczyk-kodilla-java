package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public class OrderProcessorRepository implements OrderRepositoryInterface {

    @Override
    public void createOrder(User user, LocalDateTime dateOrder, LocalDateTime dateDelivery, Product product) {
        System.out.println("Adding order to DB");
    }
}
