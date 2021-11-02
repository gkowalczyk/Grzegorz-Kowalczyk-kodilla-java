package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1, 2);
        } catch (Exception e) {
            System.out.println("Problem while calculating, look at the exception:" + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}





