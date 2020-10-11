package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testAddition(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.add(1, 1);

        //Then
        assertEquals(2, result);
    }

    @Test
    void testSubtraction(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.sub(4, 2);

        //Then
        assertEquals(2, result);
    }

    @Test
    void testMultiplication(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.mul(1, 2);

        //Then
        assertEquals(2, result);
    }

    @Test
    void testDivision(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = new Calculator(display);

        //When
        double result = calculator.div(2, 1);

        //Then
        assertEquals(2, result);
    }
}
