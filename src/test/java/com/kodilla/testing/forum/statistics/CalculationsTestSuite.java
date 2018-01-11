package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationsTestSuite {
    @Test
    public void calculateAdvStatistics1() {
        //Test for when number of posts equals 0

        //Given
        Statistics dataMock = mock(Statistics.class);

        List<String> listMock = new ArrayList<String>();
        listMock.add("User 1");
        when(dataMock.usersNames()).thenReturn(listMock);

        int postsMock = 0;
        when(dataMock.postsCount()).thenReturn(postsMock);

        int commentsMock = 2;
        when(dataMock.commentsCount()).thenReturn(commentsMock);

        Calculations dataOut = new Calculations(dataMock);

        //When
        dataOut.calculateAdvStatistics(dataMock);
        boolean zeroPresentInDenominator = dataOut.zeroInDenominator;
        double postsPerUserTest = dataOut.averagePostsPerUser;
        double commentsPerUserTest = dataOut.averageCommentsPerUser;
        double commentsPerPost = dataOut.averageCommentsPerPost;

        //Then
        Assert.assertTrue(zeroPresentInDenominator);
        Assert.assertEquals(0, postsPerUserTest, 0.01);
        Assert.assertEquals(2, commentsPerUserTest, 0.01);
        Assert.assertNull(commentsPerPost);
    }

    @Test
    public void calculateAdvStatistics2() {
        //Test for when number of users equals 0

        //Given
        Statistics dataMock = mock(Statistics.class);

        List<String> listMock = new ArrayList<String>();
        when(dataMock.usersNames()).thenReturn(listMock);

        int postsMock = 2;
        when(dataMock.postsCount()).thenReturn(postsMock);

        int commentsMock = 2;
        when(dataMock.commentsCount()).thenReturn(commentsMock);

        Calculations dataOut = new Calculations(dataMock);

        //When
        dataOut.calculateAdvStatistics(dataMock);
        boolean zeroPresentInDenominator = dataOut.zeroInDenominator;
        double postsPerUserTest = dataOut.averagePostsPerUser;
        double commentsPerUserTest = dataOut.averageCommentsPerUser;
        double commentsPerPost = dataOut.averageCommentsPerPost;

        //Then
        Assert.assertTrue(zeroPresentInDenominator);
        Assert.assertNull(postsPerUserTest);
        Assert.assertNull(commentsPerUserTest);
        Assert.assertEquals(1, commentsPerPost, 0.01);
    }

    @Test
    public void calculateAdvStatistics3() {
        //Test for when number of comments equals 0

        //Given
        Statistics dataMock = mock(Statistics.class);

        List<String> listMock = new ArrayList<String>();
        listMock.add("User 1");
        when(dataMock.usersNames()).thenReturn(listMock);

        int postsMock = 2;
        when(dataMock.postsCount()).thenReturn(postsMock);

        int commentsMock = 0;
        when(dataMock.commentsCount()).thenReturn(commentsMock);

        Calculations dataOut = new Calculations(dataMock);

        //When
        double postsPerUserTest = dataOut.averagePostsPerUser;
        double commentsPerUserTest = dataOut.averageCommentsPerUser;
        double commentsPerPost = dataOut.averageCommentsPerPost;

        //Then
        Assert.assertEquals(2, postsPerUserTest, 0.01);
        Assert.assertEquals(0, commentsPerUserTest, 0.01);
        Assert.assertEquals(0, commentsPerPost, 0.01);
    }

    @Test
    public void calculateAdvStatistics4() {
        //Test for when posts number equals 1000, number of users equals 100 and number of comments is greater than number of posts

        //Given
        Statistics dataMock = mock(Statistics.class);

        List<String> listMock = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            listMock.add("User" + n);
        }
        when(dataMock.usersNames()).thenReturn(listMock);

        int postsMock = 1000;
        when(dataMock.postsCount()).thenReturn(postsMock);

        int commentsMock = 2000;
        when(dataMock.commentsCount()).thenReturn(commentsMock);

        Calculations dataOut = new Calculations(dataMock);

        //When
        double postsPerUserTest = dataOut.averagePostsPerUser;
        double commentsPerUserTest = dataOut.averageCommentsPerUser;
        double commentsPerPost = dataOut.averageCommentsPerPost;

        //Then
        Assert.assertEquals(10, postsPerUserTest, 0.01);
        Assert.assertEquals(20, commentsPerUserTest, 0.01);
        Assert.assertEquals(2, commentsPerPost, 0.01);
    }

    @Test
    public void calculateAdvStatistics5() {
        //Test for when posts number equals 1000, number of users equals 100 and number of comments is smaller than number of posts

        //Given
        Statistics dataMock = mock(Statistics.class);

        List<String> listMock = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            listMock.add("User" + n);
        }
        when(dataMock.usersNames()).thenReturn(listMock);

        int postsMock = 1000;
        when(dataMock.postsCount()).thenReturn(postsMock);

        int commentsMock = 500;
        when(dataMock.commentsCount()).thenReturn(commentsMock);

        Calculations dataOut = new Calculations(dataMock);

        //When
        double postsPerUserTest = dataOut.averagePostsPerUser;
        double commentsPerUserTest = dataOut.averageCommentsPerUser;
        double commentsPerPost = dataOut.averageCommentsPerPost;

        //Then
        Assert.assertEquals(10, postsPerUserTest, 0.01);
        Assert.assertEquals(5, commentsPerUserTest, 0.01);
        Assert.assertEquals(0.5, commentsPerPost, 0.01);
    }
}