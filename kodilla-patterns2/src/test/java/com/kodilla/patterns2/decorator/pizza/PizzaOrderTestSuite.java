package com.kodilla.patterns2.decorator.pizza;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {

        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        BigDecimal calculateCost = pizzaOrder.getPrice();
        assertEquals(new BigDecimal(15), calculateCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {

        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        String description = pizzaOrder.getDescription();
        assertEquals("Basic pizza ", description);
    }
    @Test
    public void testBasicPizzaOrderWithExtraCheeseAndHamGetCost() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraHamDecorator(pizzaOrder);
        BigDecimal calculateCost = pizzaOrder.getPrice();
        assertEquals(new BigDecimal(20), calculateCost);
    }
    @Test
    public void testBasicPizzaOrderWithExtraCheeseAndHamGetDescription() {
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraHamDecorator(pizzaOrder);
        String description = pizzaOrder.getDescription();
        assertEquals("Basic pizza + extra cheese + extra ham", description);

    }
}