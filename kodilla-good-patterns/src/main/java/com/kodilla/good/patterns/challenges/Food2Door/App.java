package com.kodilla.good.patterns.challenges.Food2Door;

public class App {
    public static void main(String[] args) {
       OrderProcessor orderProcessor = new OrderProcessor();
       orderProcessor.processAll(new OrderRequestRetriever().retrieve());
    }
}
