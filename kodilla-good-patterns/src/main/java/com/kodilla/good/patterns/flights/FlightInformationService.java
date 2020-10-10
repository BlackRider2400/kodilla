package com.kodilla.good.patterns.flights;

public interface FlightInformationService {
    void sendConfirmation(Client client);
    void sendFailure(Client client);
}
