package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("first Log");

        //When
        logger.log("second Log");

        //Then
        assertEquals(logger.getLastLog(), "second Log");

    }
}
