package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsFileEngineTestSuite {

  private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
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
    @Test
    void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.loadSettings();
        //Then
        assertTrue(result);
    }
    @Test
    void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.saveSettings();
        //Then
        assertTrue(result);
    }
}

