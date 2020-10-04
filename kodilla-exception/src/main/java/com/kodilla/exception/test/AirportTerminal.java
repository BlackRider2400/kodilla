package com.kodilla.exception.test;

import javax.annotation.processing.RoundEnvironment;
import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class AirportTerminal {

    void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("A", true);
        airports.put("B", false);
        airports.put("C", true);
        airports.put("D", true);
        airports.put("E", true);
        airports.put("F", false);
        airports.put("G", true);


        if (areFligtsInDatabase(flight, airports)){
            if (areFlightsAvailable(flight, airports)) {
                System.out.println("Flights are availble");
            } else {
                throw new RouteNotFoundException();
            }
        } else  {
            throw new RouteNotFoundException();
        }


        if(!airports.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException();
        }else if(!airports.get(flight.getArrivalAirport())){
            throw new RouteNotFoundException();
        }else if(!airports.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        }else if(!airports.get(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        }else{
            System.out.println("There is such a flight.");
        }

    }

    private boolean areFlightsAvailable(Flight flight, Map<String, Boolean> airports) {
        return airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport());
    }


    private Boolean areFligtsInDatabase(Flight flight, Map<String, Boolean> airports){
        Boolean firstFlight = airports.getOrDefault(flight.getArrivalAirport(), false);
        Boolean secondFlight = airports.getOrDefault(flight.getDepartureAirport(), false);
        return firstFlight && secondFlight;
    }


}
