package com.kodilla.exception.test;

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


}
