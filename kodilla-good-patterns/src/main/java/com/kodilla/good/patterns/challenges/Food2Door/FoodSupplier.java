package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public interface FoodSupplier {

    boolean process(Customer customer, Map <Product, Integer> productOrder);

}
