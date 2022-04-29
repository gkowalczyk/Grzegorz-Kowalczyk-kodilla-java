package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestCalculatorSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void addMethod() {
        //Given
        //ApplicationContext applicationContext =
         //       new AnnotationConfigApplicationContext("com.kodilla.spring");
        //Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double val = calculator.add(1.5, 1.5);
        //Then
        assertEquals(3, val);
    }

    @Test
    void subMethod() {
        //Given
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double val = calculator.sub(1.5, 1.5);
        //Then
        assertEquals(0, val);
    }

    @Test
    void mulMethod() {
        //Given
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double val = calculator.mul(1.0, 1.0);
        //Then
        assertEquals(1.0, val);
    }

    @Test
    void divMethod() {
        //Given
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double val = calculator.div(1.0, 1);
        //Then
        assertEquals(1.0, val);
    }
}