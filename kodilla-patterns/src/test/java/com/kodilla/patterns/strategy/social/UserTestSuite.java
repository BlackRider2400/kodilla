package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapChatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials("John");
        User peter = new YGeneration("Peter");
        User maks = new ZGeneration("Maks");

        //Then & When
        assertEquals(john.sharePost("hello world"), "hello world\n Twitter from iphone.");
        assertEquals(peter.sharePost("hello world"), "hello world\n Facebook from iphone.");
        assertEquals(maks.sharePost("hello world"), "hello world\n Snapchat from iphone.");
    }

    @Test
    void testChangingGeneration(){
        //Given
        User john = new Millenials("John");

        //When
        john.setSocialPublisher(new SnapChatPublisher());

        //Then
        assertEquals("hello world\n Snapchat from iphone.", john.sharePost("hello world"));
    }

}
