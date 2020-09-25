package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    private static int testNum = 0;
    @Mock
    Statistics stats;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Starting tests!");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Starting test: " + testNum);
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Ending test: " + testNum);
        testNum++;
    }

    @Test
    void testCalculateAdvStatisticsPost0(){
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        userNames.add("Peter");
        userNames.add("Roxanne");
        userNames.add("Jessica");
        userNames.add("Simon");

        int postsCount = 0;
        int commentsCount = 20;

        double averagePostPerUser = 0;
        double averageCommentPerUser = 4;
        double averageCommentPerPost = 0;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }

    @Test
    void testCalculateAdvStatisticsPost1000(){
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        userNames.add("Peter");
        userNames.add("Roxanne");
        userNames.add("Jessica");
        userNames.add("Simon");

        int postsCount = 1000;
        int commentsCount = 20;

        double averagePostPerUser = 200;
        double averageCommentPerUser = 4;
        double averageCommentPerPost = 0.02;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }

    @Test
    void testCalculateAdvStatisticsComments0(){
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        userNames.add("Peter");
        userNames.add("Roxanne");
        userNames.add("Jessica");
        userNames.add("Simon");

        int postsCount = 1000;
        int commentsCount = 0;

        double averagePostPerUser = 200;
        double averageCommentPerUser = 0;
        double averageCommentPerPost = 0;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }

    @Test
    void testCalculateAdvStatisticsCommentsMoreThanPosts(){
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        userNames.add("Peter");
        userNames.add("Roxanne");
        userNames.add("Jessica");
        userNames.add("Simon");

        int postsCount = 5;
        int commentsCount = 10;

        double averagePostPerUser = 1;
        double averageCommentPerUser = 2;
        double averageCommentPerPost = 2;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }

    @Test
    void testCalculateAdvStatisticsPostsMoreThanComments(){
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("John");
        userNames.add("Peter");
        userNames.add("Roxanne");
        userNames.add("Jessica");
        userNames.add("Simon");

        int postsCount = 10;
        int commentsCount = 5;

        double averagePostPerUser = 2;
        double averageCommentPerUser = 1;
        double averageCommentPerPost = 0.5;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }

    @Test
    void testCalculateAdvStatisticsUser0(){
        //Given
        List<String> userNames = new ArrayList<>();


        int postsCount = 10;
        int commentsCount = 10;

        double averagePostPerUser = 0;
        double averageCommentPerUser = 0;
        double averageCommentPerPost = 0;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }

    @Test
    void testCalculateAdvStatisticsUsers100(){
        //Given
        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100;i++){
            userNames.add("a".repeat(i));
        }

        int postsCount = 10;
        int commentsCount = 10;

        double averagePostPerUser = 0.1;
        double averageCommentPerUser = 0.1;
        double averageCommentPerPost = 1;

        when(stats.postsCount()).thenReturn(postsCount);
        when(stats.commentsCount()).thenReturn(commentsCount);
        when(stats.usersNames()).thenReturn(userNames);

        //When
        CalculateStatistics calcStats = new CalculateStatistics();
        calcStats.calculateAdvStatistics(stats);

        double resultAveragePostPerUser = calcStats.getAveragePostsPerUser();
        double resultAverageCommentPerUser = calcStats.getAverageCommentsPerUser();
        double resultAverageCommentPerPost = calcStats.getAverageCommentsPerPost();

        //Then
        assertEquals(averageCommentPerPost, resultAverageCommentPerPost);
        assertEquals(averageCommentPerUser, resultAverageCommentPerUser);
        assertEquals(averagePostPerUser, resultAveragePostPerUser);
    }
}
