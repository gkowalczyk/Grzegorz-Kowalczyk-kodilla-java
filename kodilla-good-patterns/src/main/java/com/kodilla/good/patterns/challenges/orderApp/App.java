package com.kodilla.good.patterns.challenges.orderApp;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new OrderProcessorRepository());

        orderProcessor.process(orderRequest);
    }
}

