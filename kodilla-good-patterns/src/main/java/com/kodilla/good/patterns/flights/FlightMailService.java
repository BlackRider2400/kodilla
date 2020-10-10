package com.kodilla.good.patterns.flights;

public class FlightMailService implements FlightInformationService{


    @Override
    public void sendConfirmation(Client client) {
        System.out.println(client.getEmail() + "\nThis flight is available and booked for you.");
    }

    @Override
    public void sendFailure(Client client) {
        System.out.println(client.getEmail() + "\nThis fight is unavailable.");
    }
}
