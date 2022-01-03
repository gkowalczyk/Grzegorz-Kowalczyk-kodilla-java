package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.BigMac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    void testNewBigMac() {
        //Given
        BigMac mac = new BigMac.BigMacBuilder()
                .ingredients("onion")
                .burgers(2)
                .sauce("Standard")
                .ingredients("bacon")
                .ingredients("salad")
                .build();
        System.out.println(mac);
        //When
        int howManyIngredients = mac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }
}

