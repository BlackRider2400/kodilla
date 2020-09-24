package com.kodilla.stream.array;

import java.math.BigDecimal;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperators {
    static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        return average;
    }
}
