package com.kodilla.good.patterns.challenges.Flight;

public class App {
    public static void main(String[] args) {

        SearchingFlight searchingFlight = new SearchingFlight();
        searchingFlight.findAllFrom("WAW");
        searchingFlight.findAllFromDisplay("WAW");
        searchingFlight.findAllToDisplay("WRO");
        searchingFlight.findFlightWithVia("GDA", "WAW");;

    }

}
