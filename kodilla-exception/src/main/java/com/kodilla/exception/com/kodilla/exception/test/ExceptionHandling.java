package com.kodilla.exception.com.kodilla.exception.test;


public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(3.0, 2.0);
        } catch (Exception e) {
            System.out.println("Problem with arguments!");
        } finally {
            System.out.println("Second challenge completed");
        }
    }
}

