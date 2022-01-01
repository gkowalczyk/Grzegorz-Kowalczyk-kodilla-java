package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

@Test
    void testFactoryDriving(){
    //Given
    TaskFactory taskFactory = new TaskFactory();
    //When
    Task driving = taskFactory.taskMaker(TaskFactory.DRIVING);
    //Then
    assertFalse(driving.isTaskExecuted());
    assertEquals("TASK:driving:DONE. YOU HAVE TO:car:to:Wroclaw",driving.executeTask());
       System.out.println(driving.executeTask());
    assertTrue(driving.isTaskExecuted());
    }
    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.taskMaker(TaskFactory.PAINTING);
        //Then
        assertFalse(painting.isTaskExecuted());
        assertEquals("TASK:painting:DONE. YOU SHOULD PAINT IN:blue:sky", painting.executeTask());
        System.out.println(painting.executeTask());
        assertTrue(painting.isTaskExecuted());
    }
    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.taskMaker(TaskFactory.SHOPPING);
        //Then
        assertFalse(shopping.isTaskExecuted());
        assertEquals("TASK:shopping:DONE. YOU BUY:1.0:phone", shopping.executeTask());
        System.out.println(shopping.executeTask());
        assertTrue(shopping.isTaskExecuted());
    }
}




