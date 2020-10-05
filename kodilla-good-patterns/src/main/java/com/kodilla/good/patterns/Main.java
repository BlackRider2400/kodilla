package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;

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
    }
}
