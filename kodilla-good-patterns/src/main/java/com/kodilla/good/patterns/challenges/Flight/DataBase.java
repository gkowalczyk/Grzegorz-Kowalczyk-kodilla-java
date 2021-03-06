package com.kodilla.good.patterns.challenges.Flight;

import java.util.HashSet;
import java.util.Set;

public final class DataBase {

    private final static Set<Flight> flightSet = new HashSet<>();

     static  {
        flightSet.add(new Flight("KRA","RZE"));
        flightSet.add(new Flight("GDA","RZE"));
        flightSet.add(new Flight("GDA","RZE"));
        flightSet.add(new Flight("GDA","KAT"));
        flightSet.add(new Flight("WRO","RZE"));
        flightSet.add(new Flight("KRA","WAW"));
        flightSet.add(new Flight("WAW","RZE"));
        flightSet.add(new Flight("POZ","KRA"));
        flightSet.add(new Flight("GDA","KRA"));
    }
    public  static Set<Flight> copyFlightSet() {
        return new HashSet<>(flightSet);
    }
   }







