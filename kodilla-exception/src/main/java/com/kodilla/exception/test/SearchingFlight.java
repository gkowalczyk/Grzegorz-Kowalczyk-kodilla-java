package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlight {


    public Map<String, Boolean> airportMap() {

        Map<String, Boolean> result = new HashMap<>();
        result.put("WAW", true);
        result.put("KRA", true);
        result.put("RZE", true);
        result.put("GDA", false);

        return result;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {


        if (airportMap().get(flight.getArrivalAirport()) || airportMap().get(flight.getDepartureAirport())) {
            System.out.println("You can fly");

        } else {
            System.out.println("Find different directions");
            throw new RouteNotFoundException();
        }
    }
}

