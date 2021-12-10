package com.kodilla.good.patterns.challenges.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SearchingFlight {


    public List<String> findAllFrom (String from) {



        List<String> flightFrom = DataBase.copyFlightSet().stream()
                    .filter(flight -> flight.getFlightFrom().equals(from))
                    .map(flight -> flight.getFlightTo())
                .collect(Collectors.toList());
                   return flightFrom;

        }
public void findAllFromDisplay(String from) {
    System.out.println("From:" + from +"\n" + "you can fly to: " + findAllFrom(from));
}



    public List<String> findAllTo (String to) {



        List<String> flightTo= DataBase.copyFlightSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(to))
                .map(flight -> flight.getFlightFrom())
                .collect(Collectors.toList());
        return flightTo;

    }
    public void findAllToDisplay(String to) {
        System.out.println("To:" + to +"\n" + "you can fly from: " + findAllTo(to));
    }



    public void findFlightWithVia(String from, String to) {

        List<String> flyFrom = findAllFrom(from);
        List<String> flyTo = findAllTo(to);

List<String> list = new ArrayList<>();
for (String fly : flyFrom) {

    //flightSet.add(new Flight("GDA","KAT"));
   // flightSet.add(new Flight("GDA","WAW"));

    //flightSet.add(new Flight("KRA","KAT"));
  //  flightSet.add(new Flight("WAW","KAT"));

    if (flyTo.contains(fly)) {
        list.add(fly);
    }
}
        System.out.println(from + " via:" + list + "->" + to);


    }
    }
