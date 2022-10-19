package com.kodilla.patterns.singleton;
//https://medium.com/@p.osinaga/using-singleton-in-java-b1b78cf640ed

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
           logger = new Logger();  // tworząc new zachowujemy jedną instancję obiektu
      }
        return logger;
    }
}


    /* @Test
    void testGetLastLog() {
        //Given
        String log1 = "1st log";
        String log2 = "2nd log";
        //When
        Logger.getInstance().log(log1);
        Logger.getInstance().log(log2);
        //Then
        assertEquals(log2, Logger.getInstance().getLastLog());
        assertEquals(log2, Logger.getInstance().getLastLog());
        //System.out.println(Logger.getInstance().getLastLog());

        //Singleton jest to po prostu klasa, która jest instancjonowana w
        // systemie tylko jeden raz.
        // Każde użycie takiej klasy odnosi się do tej samej instancji.
    }
}

*/