package com.example.kodillaspring;

import com.example.kodillaspring.spring.shape.Circle;
import com.example.kodillaspring.spring.shape.Shape;
import com.example.kodillaspring.spring.shape.Square;
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
                new AnnotationConfigApplicationContext("com.example.kodillaspring.spring");
        Shape shape =  (Shape)context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a circle.", name);

    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring.spring");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a square.", name);
    }

 @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring.spring");
        Shape shape = (Shape) context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Shape:" + name);
    }
}