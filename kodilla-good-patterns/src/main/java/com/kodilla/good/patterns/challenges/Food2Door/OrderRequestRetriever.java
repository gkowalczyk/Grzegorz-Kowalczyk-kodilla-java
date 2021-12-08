package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("Customer1");
        FoodSupplier foodSupplier = new ExtraFoodShop();
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new ExtraFoodExample("prawns", "sea fruit"), 1);

     orderRequestList.add(new OrderRequest(customer,foodSupplier,productList));
     return orderRequestList;

    }


}