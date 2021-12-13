package com.example.kodillaspring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {


    @Test
    void testCircleLoadedIntoContener(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a circle.", name);
    }

   // @Test
   // void contextLoads() {
    }

//}
