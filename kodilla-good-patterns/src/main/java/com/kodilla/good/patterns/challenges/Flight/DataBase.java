package com.kodilla.good.patterns.challenges.Flight;

import java.util.HashSet;
import java.util.Set;

public final class DataBase {

    private final static Set<Flight> flightSet = new HashSet<>();

     static  {
        flightSet.add(new Flight("KRA","RZE"));
        flightSet.add(new Flight("WAW","RZE"));
       // flightSet.add(new Flight("GDA","RZE"));
       // flightSet.add(new Flight("GDA","KAT"));
       // flightSet.add(new Flight("WRO","RZE"));
       // flightSet.add(new Flight("KRA","WAW"));
       // flightSet.add(new Flight("WAW","RZE"));
        flightSet.add(new Flight("GDA","WAW"));
        flightSet.add(new Flight("GDA","KRA"));
    }
    public  static Set<Flight> copyFlightSet() {
        return new HashSet<>(flightSet);
    }
   }

    /*public final Set<com.kodilla.good.patterns.challenges.flight1.Flight> flightsSet() {
        final  Set<com.kodilla.good.patterns.challenges.flight1.Flight> flightSetMap = new HashSet<>();

        flightSetMap.add(new com.kodilla.good.patterns.challenges.flight1.Flight("GDA", "RZE"));
        flightSetMap.add(new com.kodilla.good.patterns.challenges.flight1.Flight("KRA", "RZE"));
        flightSetMap.add(new com.kodilla.good.patterns.challenges.flight1.Flight("GDA", "KRA"));
        return new HashSet<>(flightSetMap);
    }
}
*/





