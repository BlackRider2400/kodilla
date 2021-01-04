package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    void testBasicPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    void testThickerBasicPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickerPizzaOrder(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    void testFullComboPizzaOrder(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PeperoniPizzaOrder(pizzaOrder);
        pizzaOrder = new FunghiPizzaOrder(pizzaOrder);
        pizzaOrder = new HamPizzaOrder(pizzaOrder);
        pizzaOrder = new ThickerPizzaOrder(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(47.5), cost);
    }

}