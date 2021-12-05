package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public interface OrderRepositoryInterface{
    void createOrder(User user, LocalDateTime dateOrder, LocalDateTime dateDelivery, Product product);
}
