package com.kodilla.good.patterns.challenges.Flight;

import java.util.List;

public class App {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        List<Flight> result1 = flightService.findAllFrom("WAW");
        List<Flight> result2 = flightService.findAllFrom("WAW");
        List<Flight> result3 = flightService.findAllTo("WRO");
        List<List<Flight>> result4 = flightService.via("GDA", "WAW");;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
