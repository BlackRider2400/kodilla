package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

public class TestLoopAndConditionalBreakpoints {

    @Test
    void testLoop(){
        //Given
        long sum = 0;
        //When
        for (int i = 0; i < 1000; i++) {
            sum += i;
            System.out.println("[" + i + "] sum equals: " + sum);
        }
    }
}
