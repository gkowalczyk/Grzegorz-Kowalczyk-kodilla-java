package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public interface OrderServiceInterface {

    boolean order(User user, LocalDateTime dateOrder, LocalDateTime dateDelivery, Product product);
}
