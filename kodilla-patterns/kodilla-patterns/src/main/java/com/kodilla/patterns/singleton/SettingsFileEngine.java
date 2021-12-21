package com.kodilla.patterns.singleton;

import com.kodilla.patterns.enums.hotel.Season;

public enum SettingsFileEngine {
    INSTANCE;

    private String filename = "";

    public String getFilename() {
        return filename;
    }

    //public SettingsFileEngine() { //pusty konstruktor?

   // }

    public void close() {
        this.filename = "";
        System.out.println("Closing the settings file");
    }

    public void open(final String filename) {
        this.filename = filename;
        System.out.println("Opening the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}