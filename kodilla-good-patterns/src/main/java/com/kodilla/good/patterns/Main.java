package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.challenges.User;
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
    }
}
