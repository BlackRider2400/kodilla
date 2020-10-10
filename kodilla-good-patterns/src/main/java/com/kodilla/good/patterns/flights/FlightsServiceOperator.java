package com.kodilla.good.patterns.flights;

public class FlightsServiceOperator {
    private FlightsRepository flightsRepository;
    private FlightInformationService informationService;

    public FlightsServiceOperator(FlightsRepository flightsRepository, FlightInformationService informationService) {
        this.flightsRepository = flightsRepository;
        this.informationService = informationService;
    }

    public void process(FlightRequest flightRequest){

        if(flightsRepository.isFlightAvailable(flightRequest)){
            informationService.sendConfirmation(flightRequest.getClient());
        }
        else{
            informationService.sendFailure(flightRequest.getClient());
        }
    }

    public void showAvailableFlightsFromCity(String  city){
        System.out.println("Available flights from " + city + ":");
        flightsRepository.getFlightsFromCity(city).stream()
                .forEach(System.out::println);
    }

    public void showAvailableFlightsToCity(String  city){
        System.out.println("Available flights to " + city + ":");
        flightsRepository.getFlightsToCity(city).stream()
                .forEach(System.out::println);
    }
}
