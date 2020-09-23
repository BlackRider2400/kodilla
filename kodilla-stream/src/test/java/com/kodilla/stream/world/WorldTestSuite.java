package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent firstManLand = new Continent("FirstManLand");
        firstManLand.addCountry(new Country("Musk-Land", new BigDecimal("2304512")));
        firstManLand.addCountry(new Country("USB", new BigDecimal("12304529")));
        firstManLand.addCountry(new Country("ChillZone", new BigDecimal("563089")));
        firstManLand.addCountry(new Country("NewEurope", new BigDecimal("34230423")));

        Continent coldFields = new Continent("Cold Fields");
        coldFields.addCountry(new Country("Chinese republic of Mars", new BigDecimal("23434093")));
        coldFields.addCountry(new Country("Putin-Land", new BigDecimal("102322")));
        coldFields.addCountry(new Country("Kingdom of Poland", new BigDecimal("4543002")));

        Continent ironValley = new Continent("IronValley");
        ironValley.addCountry(new Country("Smelters base", new BigDecimal("120435")));
        ironValley.addCountry(new Country("Miners base", new BigDecimal("234420")));
        ironValley.addCountry(new Country("Factories base", new BigDecimal("2304312")));

        World mars = new World("Mars");
        mars.addContinent(ironValley);
        mars.addContinent(coldFields);
        mars.addContinent(firstManLand);

        BigDecimal numberOfPeople = new BigDecimal("80141137");

        //When
        BigDecimal getNumberOfPeople = mars.getPeopleQuantity();

        //Then
        assertEquals(numberOfPeople, getNumberOfPeople);
    }
}
