package com.kodilla.good.patterns.challenges.Flight;

import java.util.Objects;

public class Flight {
    private String flightFrom;
    private String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightTo = flightTo;
        this.flightFrom = flightFrom;
    }
    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightTo.equals(flight.flightTo) && flightFrom.equals(flight.flightFrom);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flightTo, flightFrom);
    }
      @Override
    public String toString() {
        return "Flight{" +
                "flightTo='" + flightTo + '\'' +
                ", flightFrom='" + flightFrom + '\'' +
                '}';
    }
}
