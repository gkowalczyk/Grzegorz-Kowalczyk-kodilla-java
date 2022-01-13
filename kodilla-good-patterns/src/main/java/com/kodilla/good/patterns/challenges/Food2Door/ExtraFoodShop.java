package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodSupplier{

    private Map<String, Integer> listProduct = Map.of(
       "beaf",4
    );

    @Override
    public boolean process(Customer customer, Product product, int count) {
        return false;



   }
    private boolean isAvailable(Product product, int count) {
        int availableProductCount =   listProduct.getOrDefault(product.getName(),0);

        if (availableProductCount >= count) {
            int available = availableProductCount - count;
            return  true;
               }  else {
            return  false;
        }


    }
}
