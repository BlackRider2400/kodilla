package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.challenges.User;
import com.kodilla.good.patterns.flights.*;
import com.kodilla.good.patterns.food2door.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().values().stream()
                .flatMap(strings -> strings.stream())
                .map(string -> string + "!")
                .forEach(System.out::print);

        System.out.println("\n-----------------------------------------------");

        ProductOrderService orderService = new ProductOrderService(new CupSellService(),
                new CupSellRepository(10), new MailService());
        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        orderService.process(sellRequestRetriever.retrieve());

        System.out.println("\n-----------------------------------------------");

        DeliveryRequest deliveryRequest = new DeliveryRequest("GlutenFreeWater", 10);

        DeliveryInformationService mailService = new DeliveryMailService();

        Map<String, Integer> storage = new HashMap<>();
        storage.put("Cornflakes", 26);
        storage.put("GlutenFreeWater", 34);
        storage.put("EcoChocolate", 12);

        DeliveryRepository deliveryRepository = new GlutenFreeShopRepository(storage);

        DeliveryOrderProcessor orderProcessor = new DeliveryOrderProcessor(deliveryRepository, mailService);
        orderProcessor.process(deliveryRequest);

        System.out.println("\n-----------------------------------------------");

        List<String> flightList = new ArrayList<>();
        flightList.add("Warszawa");
        flightList.add("Kraków");
        flightList.add("Poznań");

        List<String> warsawFlights = new ArrayList<>();
        warsawFlights.add("Kraków");
        warsawFlights.add("Gdańsk");

        List<String> krakowFlights = new ArrayList<>();
        krakowFlights.add("Poznań");
        krakowFlights.add("Gdańsk");
        krakowFlights.add("Zakopane");
        krakowFlights.add("Białystok");

        List<String> poznanFlights = new ArrayList<>();
        poznanFlights.add("Kraków");
        poznanFlights.add("Gdańsk");
        poznanFlights.add("Białystok");
        poznanFlights.add("Wrocław");

        List<String> wroclawFlights = new ArrayList<>();
        wroclawFlights.add("Kraków");
        wroclawFlights.add("Gdańsk");
        wroclawFlights.add("Białystok");
        wroclawFlights.add("Poznań");
        wroclawFlights.add("Warszawa");


        Map<String, List<String>> dataBase = new HashMap<>();
        dataBase.put("Warszawa", warsawFlights);
        dataBase.put("Poznań", poznanFlights);
        dataBase.put("Kraków", krakowFlights);
        dataBase.put("Wrocław", wroclawFlights);

        FlightRequest flightRequest = new FlightRequest(flightList);
        FlightsRepository repository = new FlightsRepository(dataBase);
        FlightInformationService informationService = new FlightMailService();
        FlightsServiceOperator flightsOperator = new FlightsServiceOperator(repository, informationService);
        flightsOperator.process(flightRequest);
        flightsOperator.showAvailableFlightsFromCity("Wrocław");
        flightsOperator.showAvailableFlightsToCity("Gdańsk");
    }
}
