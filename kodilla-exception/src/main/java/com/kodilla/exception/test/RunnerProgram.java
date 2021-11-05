package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RunnerProgram {
    public static void main(String[] args) {

        SearchingFlight searchingFlight = new SearchingFlight();
        Flight flightChecking = new Flight("KRA", "GDA");

        try {
            searchingFlight.findFlight(flightChecking);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not finding, error:" + e);
        } finally {
            System.out.println("Happy day");
        }
    }
}


