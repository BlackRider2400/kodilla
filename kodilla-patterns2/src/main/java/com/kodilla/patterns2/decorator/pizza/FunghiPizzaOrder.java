package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class FunghiPizzaOrder extends AbstractPizzaOrderDecorator {
    protected FunghiPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7.5));
    }

    @Override
    public String getName() {
        return super.getName() + " + mushrooms";
    }
}
