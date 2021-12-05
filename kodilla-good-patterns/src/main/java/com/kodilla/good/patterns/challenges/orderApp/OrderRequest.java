package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime dataOrder;
    private LocalDateTime dateDelivery;
    private Product product;

    public User getUser() {
        return user;
    }

    public LocalDateTime getDataOrder() {
        return dataOrder;
    }

    public LocalDateTime getDateDelivery() {
        return dateDelivery;
    }

    public Product getProduct() {
        return product;
    }

    public OrderRequest(User user, LocalDateTime dataOrder, LocalDateTime dateDelivery, Product product) {
        this.user = user;
        this.dataOrder = dataOrder;
        this.dateDelivery = dateDelivery;
        this.product = product;
    }
}
