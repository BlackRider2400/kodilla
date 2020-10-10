package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRequest {

    private Client client;
    private List<String> airports;

    public FlightRequest(List<String> airports) {
        client = new Client("John", "johnsmith@gmail.com");
        this.airports = airports;
    }

    public Client getClient() {
        return client;
    }

    public List<String> getAirports() {
        return airports;
    }
}
