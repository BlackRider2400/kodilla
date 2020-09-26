package com.kodilla.exception.test;

public class AirportTerminalRunner {
    public static void main(String[] args) {
        AirportTerminal terminal =  new AirportTerminal();
        Flight flight = new Flight("A", "B");
        try{
            terminal.findFlight(flight);
        }catch (RouteNotFoundException e){
            System.out.println("There is not such a flight.");
        }
    }
}
