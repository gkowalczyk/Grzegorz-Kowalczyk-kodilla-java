package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class ExtraFoodShop implements FoodSupplier {

    private Map<String, Integer> listProduct = Map.of(
            "beef", 5
    );

    @Override
    public boolean process(Customer customer, Product product, int count) {
        int availableProductCount = listProduct.getOrDefault(product.getName(), 0);

        if (availableProductCount >= count) {
            int available = availableProductCount - count;
            System.out.println("Availability of your product :" + available);
            System.out.println(customer.getName() + "\n" + "order:"  + count + product.getName());
            return true;

        } else {
            System.out.println("Product is unavailable, you can buy :" + availableProductCount);
            return false;
        }
    }
}