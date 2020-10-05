package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().values().stream()
                .flatMap(strings -> strings.stream())
                .map(string -> string + "!")
                .forEach(System.out::print);
    }
}
