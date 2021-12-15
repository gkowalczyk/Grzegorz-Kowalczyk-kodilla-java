package com.kodilla.good.patterns.challenges.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.kodilla.good.patterns.challenges.Flight.DataBase.copyFlightSet;

public final class FlightService {

    public List<Flight> findAllFrom(String from) {

        return copyFlightSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(from))
                .collect(Collectors.toList());
    }
    public List<Flight> findAllTo(String to) {

        return copyFlightSet().stream()
                .filter(flight -> flight.getFlightTo().equals(to))
                .collect(Collectors.toList());
    }
    public List <List<Flight>> via (String from, String to) {

        List<Flight> flightsFrom = findAllFrom(from);
        List<Flight> flightsTo = findAllTo(to);
        List<List<Flight>>  flights = new ArrayList<>();

        flightsFrom.stream()
                .filter(flight -> flightsTo.contains(new Flight(flight.getFlightTo(),to)))
                .forEach(flight -> {
                   List<Flight> connection = new ArrayList<>();
                   connection.add(flight);
                   connection.add(new Flight(flight.getFlightTo(),to));
                  flights.add(connection);
                } );
        return flights;
    }
}