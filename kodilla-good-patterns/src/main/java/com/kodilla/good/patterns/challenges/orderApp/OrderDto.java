package com.kodilla.good.patterns.challenges.orderApp;

public class OrderDto {
    public User user;
    public boolean isOrder;

    public User getUser() {
        return user;
    }
    public boolean isOrder() {
        return isOrder;
    }
    public OrderDto(User user, boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }
}
