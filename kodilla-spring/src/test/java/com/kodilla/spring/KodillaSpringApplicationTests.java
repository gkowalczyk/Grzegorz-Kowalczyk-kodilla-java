package com.kodilla.spring;


import com.kodilla.spring.shape.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {


    @Test
    void testCircleLoadedIntoContener() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape =  (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a circle.", name);
        System.out.println(context);

    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("createSquare");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a square.", name);
    }

 @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Shape:" + name);
    }
}