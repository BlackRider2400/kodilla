package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal people;

    public Country(String name, BigDecimal people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPeople() {
        return people;
    }
}
