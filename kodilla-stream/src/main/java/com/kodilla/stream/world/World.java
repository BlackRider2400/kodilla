package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final String name;
    private final List<Continent> continents;

    public World(String name) {
        this.name = name;
        this.continents = new ArrayList<>();
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        List<Country> allCountries = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .collect(Collectors.toList());

        BigDecimal peopleQuantity = allCountries.stream()
                .map(Country::getPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current) );

        return peopleQuantity;
    }
    public String getName() {
        return name;
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
