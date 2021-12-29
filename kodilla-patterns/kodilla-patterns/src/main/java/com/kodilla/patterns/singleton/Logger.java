package com.kodilla.patterns.singleton;

public class Logger {

    private String lastLog = "";
    private static Logger logger = null;

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

    //Identyfikacja: Singleton można rozpoznać po
    // statycznej metodzie kreacyjnej zwracającej jakiś
    // obiekt którego instancja jest przechowywana w pamięci podręcznej.
    public static Logger getInstance() {
        if (logger == null) {
           logger = new Logger();
       }
        return logger;
    }
}


