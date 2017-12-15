package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator operation = new Calculator();
        int addition = operation.doAddition(1,2);
        int subtraction = operation.doSubstraction(3,2);
        if (addition == 3){
            System.out.println("addition OK");
        } else {
            System.out.println("error in addition");
        }
            if (subtraction == 1){
                System.out.println("subtraction OK");
            } else {
                System.out.println("error in subtraction");
            }
    }
}