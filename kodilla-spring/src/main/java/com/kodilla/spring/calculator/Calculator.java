package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b){
        double total = a + b;
        display.displayValue(total);
        return total;
    }

    double sub(double a, double b){
        double total = a - b;
        display.displayValue(total);
        return total;
    }

    double mul(double a, double b){
        double total = a * b;
        display.displayValue(total);
        return total;
    }

    double div(double a, double b){
        double total = a / b;
        display.displayValue(total);
        return total;
    }




}
