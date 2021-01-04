package com.kodilla.patterns2.decorator.pizza;




import java.math.BigDecimal;

public class ThickerPizzaOrder extends AbstractPizzaOrderDecorator {
    protected ThickerPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getName() {
        return super.getName() + " + thicker dough";
    }
}
