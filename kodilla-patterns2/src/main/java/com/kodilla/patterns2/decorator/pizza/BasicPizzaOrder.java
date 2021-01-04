package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.List;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.0);
    }

    @Override
    public String getName() {
        return "Plain Pizza";
    }
}
