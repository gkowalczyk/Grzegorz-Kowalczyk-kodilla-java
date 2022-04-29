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
                //   GDA  ->> RZE

                //   GDA  ->> KRA
                //   KRA ->> RZE
                .forEach(flight -> {
                   List<Flight> connection = new ArrayList<>();
                   connection.add(flight);//[[Flight1{from='GDA', to='KRA'},
                   connection.add(new Flight(flight.getFlightTo(),to));//Flight1{from='KRA', to='RZE'}]]
                   String via = flight.getFlightTo();
                    System.out.println(" You can fly From:" +  from  + " To: " + to  + " via:" + via );
                  flights.add(connection);
                } );
        return flights;
    }
}
