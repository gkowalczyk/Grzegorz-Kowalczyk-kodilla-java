package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodSupplier{

    private Map<Product, Integer> listProduct;
    public ExtraFoodShop() {
listProduct = mapListProduct();
    }

    private Map<Product, Integer> mapListProduct() {
        Map<Product,Integer> listProduct = new HashMap<>();

       // listProduct.put(new Product("pickled cucumbers",), 10000);
       // listProduct.put(new Product("prawns"), 8);

        return listProduct;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrder) {
       return isAvailable(productOrder);
   }
    private boolean isAvailable(Map<Product,Integer> productOrder) {
        for (Map.Entry <Product, Integer> entry : productOrder.entrySet()){
            Optional<Integer>  productOptional = Optional.ofNullable(listProduct.get(entry.getKey()));
            if (productOptional.orElse(0) < entry.getValue()) {
                System.out.println("Product is out of stock or too little  ");
                return false;
            }
        }
        return true;
    }
}
