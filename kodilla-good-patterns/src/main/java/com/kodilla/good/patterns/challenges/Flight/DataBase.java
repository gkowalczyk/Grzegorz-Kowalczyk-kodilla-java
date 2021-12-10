package com.kodilla.good.patterns.challenges.Flight;




import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class DataBase {



    private final static Set<Flight> flightSet = new HashSet<>();

    public DataBase() {
        flightSet.add(new Flight("GDA","KRA"));
        flightSet.add(new Flight("GDA","WRO"));
        flightSet.add(new Flight("GDA","RZE"));
        flightSet.add(new Flight("GDA","KAT"));
        flightSet.add(new Flight("GDA","WAW"));
        flightSet.add(new Flight("KRA","WAW"));
        flightSet.add(new Flight("WRO","WAW"));
        flightSet.add(new Flight("POZ","KRA"));
        flightSet.add(new Flight("POZ","KRA"));

    }

    public  static Set<Flight> copyFlightSet() {
        return new HashSet<>(flightSet);


    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flightSet=" + flightSet +
                '}';
    }
}







