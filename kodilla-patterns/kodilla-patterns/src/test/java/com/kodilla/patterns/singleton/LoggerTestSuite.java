package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        String log1 = "1st log";
        String log2 = "2nd log";
        //When
        logger.getInstance().log(log1);
        logger.getInstance().log(log2);
        //Then
        assertEquals(log2, Logger.getInstance().getLastLog());
        System.out.println(Logger.getInstance().getLastLog());

        //Singleton jest to po prostu klasa, która jest instancjonowana w
        // systemie tylko jeden raz.
        // Każde użycie takiej klasy odnosi się do tej samej instancji.
    }
}
