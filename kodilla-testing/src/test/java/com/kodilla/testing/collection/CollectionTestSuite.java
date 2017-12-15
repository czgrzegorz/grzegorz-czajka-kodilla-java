package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {


    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        int sum1 = 0;
        //When
        ArrayList<Integer> emptyListAfterModification = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        for(Integer number1: emptyListAfterModification) {
            if (number1 % 2 != 0) {
                sum1 = sum1 + 1;
            }
        }
        //Then
        Assert.assertTrue(sum1 == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        int sum2 = 0;
        //When
        ArrayList<Integer> normalListAfterModification = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        for (Integer number2 : normalListAfterModification) {
            if (number2 % 2 != 0) {
                sum2 = sum2 + 1;
            }
        }
        //Then
            Assert.assertTrue(sum2 == 0);
        }
}
