package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Jan", "Kowalski");
        Product product = new Product("Phone", "Electronic", 1);

        LocalDateTime dateOrder = LocalDateTime.of(2022, 01, 01, 1, 1);
        LocalDateTime dateDelivery = LocalDateTime.of(2022, 01, 3, 1, 1);
        return new OrderRequest(user, dateOrder, dateDelivery, product);
    }
}
