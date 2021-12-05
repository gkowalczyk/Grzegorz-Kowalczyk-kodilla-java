package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderServiceInterface {

    @Override
    public boolean order(User user, LocalDateTime dateOrder, LocalDateTime dateDelivery, Product product) {
        System.out.println("user:" + user.getSurname() + "\n"
                + "was ordered:" + dateOrder.toString() + "\n"
                + "product name:" + product.getName() + "\n"
                + "from category:" + product.getCategory() + "\n"
                + "amount product:" + product.getAmount() + "\n" +
                "and was sended" + dateDelivery.toString());
        return true;
    }
}
