package com.kodilla.exception.test;

 class Flight {
    private String departureAirport;
     private String arrivalAirport;

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
     @Override
     public String toString() {
         return "Flight{" +
                 "departureAirport='" + departureAirport + '\'' +
                 ", arrivalAirport='" + arrivalAirport + '\'' +
                 '}';
     }
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!getDepartureAirport().equals(flight.getArrivalAirport())) return false;
        return getArrivalAirport().equals(flight.getDepartureAirport());
    }
    @Override
    public int hashCode() {
        int result = getDepartureAirport().hashCode();
        result = 31 * result + getArrivalAirport().hashCode();
        return result;
    }
}
