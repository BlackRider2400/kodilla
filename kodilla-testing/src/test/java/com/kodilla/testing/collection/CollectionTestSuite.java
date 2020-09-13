package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "Testing Odd Numbers Exterminator when list empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> numbers = new ArrayList<>();

        //When
        boolean numbersIsEmpty = numbers.isEmpty();
        System.out.println("Testing empty list.");

        //Then
        Assertions.assertEquals(true, numbersIsEmpty);

    }

    @DisplayName(
            "Testing Odd Numbers Exterminator when normal list"
    )
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(0);
        numbers.add(100);
        numbers.add(-3);
        numbers.add(-20);

        //When
        System.out.println("Testing normal list.");
        List<Integer> evenNumbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> exterminatorOutList = exterminator.exterminate(numbers);

        evenNumbers.add(0);
        evenNumbers.add(100);
        evenNumbers.add(-20);

        //Then
        Assertions.assertEquals(evenNumbers, exterminatorOutList);


    }
}
