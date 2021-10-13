package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void addFigureTest() {
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
//When
        shapeCollector.addFigure(new Circle(3));
//Then
        Assertions.assertEquals(1, shapeCollector.getFigureShape().size());
    }

    @Test
    void checkRemoveFigure() {
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
//When
        boolean result = shapeCollector.removeFigure(circle);
//Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getFigureShape().size());
    }
    @Test
    void checkGetFigure() {
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
//When
        shapeCollector.getFigureShape().add(0, circle);
        //System.out.println(shapeCollector.getFigureShape().get(0));
//Then
        Assertions.assertEquals(shapeCollector.getFigure(0), shapeCollector.getFigureShape().get(0));
    }
    @Test
    void showFigure() {
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4);
        shapeCollector.addFigure(circle);
//When
        String result = shapeCollector.showFigures();
//Then
        Assertions.assertEquals("Circle", result);
    }
}