package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SettingsFileEngineTestSuite {

  private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = new SettingsFileEngine();
        settingsFileEngine.open("myApp.settings");
    }
    @AfterAll
    public static void closeSettings() {
        settingsFileEngine.close();
    }
    @Test
    void  testGetFileName() {
        //Given
       // SettingsFileEngine settingsFileEngine = new SettingsFileEngine();
        //When
        String fileName = settingsFileEngine.getFilename();
        System.out.println("Opened:" + fileName);
        //Then
        assertEquals("myApp.settings", fileName);
    }

}

