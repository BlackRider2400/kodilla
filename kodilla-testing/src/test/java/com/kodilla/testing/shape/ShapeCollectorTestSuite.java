package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.*;

public class ShapeCollectorTestSuite {

    public static class TestSuite{

        static int counter = 0;

        @BeforeAll
        public static void beforeAll(){
            System.out.println("Test: start");
        }
        @AfterAll
        public static void afterAll(){
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
                "Getting shape from collection test."
        )
        @Test
        void getShapeToCollectionTest(){
            //given
            Shape shape = new Circle("Circle", 15);
            ShapeCollector shapeCollector = new ShapeCollector();

            //when
            shapeCollector.addFigure(shape);
            Shape result = shapeCollector.getFigure(0);

            //then
            Assertions.assertEquals(shape, result);
        }

        @DisplayName(
                "Removing object from collection test."
        )
        @Test
        void removeShapeFromCollectionTest(){
            //given
            Shape  shape = new Circle("Circle", 25);
            ShapeCollector shapeCollector = new ShapeCollector();

            shapeCollector.addFigure(shape);

            //when
            List<Shape> shapes = shapeCollector.getShapes();
            shapeCollector.removeFigure(shape);

            //then
            Assertions.assertFalse(shapes.contains(shape));
        }

         @DisplayName(
                 "Show figures from collection test."
         )
        @Test
        void showFiguresFromCollectionTest(){
             //given
             Shape  shape = new Circle("Circle", 25);
             ShapeCollector shapeCollector = new ShapeCollector();

             shapeCollector.addFigure(shape);
             String shapes = "Circle, 25.0; ";

             //when
             String result = shapeCollector.showFigures();

             //then
             Assertions.assertEquals(shapes, result);
         }
    }
}
