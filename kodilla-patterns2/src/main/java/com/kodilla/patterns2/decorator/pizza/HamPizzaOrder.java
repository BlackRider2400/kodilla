package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HamPizzaOrder extends AbstractPizzaOrderDecorator {
    protected HamPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7.5));
    }

    @Override
    public String getName() {
        return super.getName() + " + peperoni";
    }
}