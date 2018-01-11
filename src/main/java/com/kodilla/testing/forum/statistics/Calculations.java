package com.kodilla.testing.forum.statistics;

public class Calculations {
    Statistics statistics;
    Double averagePostsPerUser;
    Double averageCommentsPerUser;
    Double averageCommentsPerPost;
    boolean zeroInDenominator = false;

    public Calculations(Statistics statistics) {
        this.statistics = statistics;
    }
    void calculateAdvStatistics(Statistics statistics){
        double numberOfUsers = statistics.usersNames().size();
        double numberOfPosts = statistics.postsCount();
        double numberOfComments = statistics.commentsCount();
        if(numberOfUsers != 0 && numberOfPosts != 0){
            averagePostsPerUser = Double.valueOf(numberOfPosts / numberOfUsers);
            averageCommentsPerUser = Double.valueOf(numberOfComments / numberOfUsers);
            averageCommentsPerPost = Double.valueOf(numberOfComments / numberOfPosts);
        } else { if(numberOfUsers == 0) {
            zeroInDenominator = true;
            averagePostsPerUser = null;
            averageCommentsPerUser = null;
            averageCommentsPerPost = Double.valueOf(numberOfComments / numberOfPosts);
        } else {
            zeroInDenominator = true;
            averagePostsPerUser = Double.valueOf(numberOfPosts / numberOfUsers);
            averageCommentsPerUser = Double.valueOf(numberOfComments / numberOfUsers);
            averageCommentsPerPost = null;
        }
        }
    }
}
