package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    public static class TestSuite{

        static int counter = 0;

        @BeforeAll
        public void beforeAll(){
            System.out.println("Test: start");
        }
        @AfterAll
        public void afterAll(){
            System.out.println("Test: end");
        }
        @BeforeEach
        public void beforeEach(){
            System.out.println("Test " + counter + "# : start");
        }
        @AfterEach
        public void afterEach(){
            System.out.println("Test " + counter + "# : end");
            counter++;
        }

        @DisplayName(
                "Adding shape to collection test."
        )
        @Test
        void addShapeToCollectionTest(){
            //given

        }
    }
}
