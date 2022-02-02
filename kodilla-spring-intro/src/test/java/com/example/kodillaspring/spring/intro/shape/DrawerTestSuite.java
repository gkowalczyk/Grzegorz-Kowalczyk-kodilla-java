package com.example.kodillaspring.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawerTestSuite {

   // @Test
   // void testDoDrawing() {
        //Given
        //Drawer drawer = new Drawer(shape);
        //When
       // drawer.doDrawing();
        //Then

//When
        @Test
                void testDoDrawingTriangle() {
            //When
            Triangle triangle = new Triangle();

        //Then
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
//Then
            assertEquals("This is a triangle" , result);

    }
}

