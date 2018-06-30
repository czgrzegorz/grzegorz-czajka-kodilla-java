package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){

        //Given
        int[] testArray = new int[] {3,5,6,7,8};

        //When
        double average = ArrayOperations.getAverage(testArray);

        //Then
        Assert.assertEquals(5.8, average,0.01);
    }
}
