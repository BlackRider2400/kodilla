package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if(usersCount == 0){
            averagePostsPerUser = 0.0;
            averageCommentsPerUser = 0.0;
            averageCommentsPerPost = 0.0;
        }
        else if(postsCount == 0){
            averageCommentsPerPost = 0.0;
            averagePostsPerUser = (double) postsCount / usersCount;
            averageCommentsPerUser = (double) commentsCount / usersCount;
        }
        else {
            averagePostsPerUser = (double) postsCount / usersCount;
            averageCommentsPerPost = (double) commentsCount / postsCount;
            averageCommentsPerUser = (double) commentsCount / usersCount;
        }
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
