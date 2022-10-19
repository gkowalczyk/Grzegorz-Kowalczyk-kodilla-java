package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlight {

    public Map<String, Boolean> airportMap() {

        Map<String, Boolean> result = new HashMap<>();
        result.put("WAW", true);
        result.put("KRA", true);
        result.put("RZE", true);
        result.put("GDA", true);
        return result;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        if (airportMap().containsKey(flight.getArrivalAirport()) && (airportMap().containsKey(flight.getDepartureAirport()) &&
                (airportMap().get(flight.getArrivalAirport())) && (airportMap().get(flight.getDepartureAirport())))) {
            System.out.println("You can fly to: " + flight.getArrivalAirport() + " from:" + flight.getDepartureAirport());
            System.out.println(airportMap().get(flight.getArrivalAirport()));
            System.out.println(airportMap().containsKey(flight.getArrivalAirport()));
        } else {
            System.out.println("Find different directions");

            throw new RouteNotFoundException();
        }
    }
}
//abstract V get(Object key)  Returns the value to which the key is mapped in this dictionary.
//public abstract boolean containsKey(Object key) Returns: true if this map contains a mapping for the specified key






