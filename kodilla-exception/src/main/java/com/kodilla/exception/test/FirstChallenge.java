package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b)  {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error name is:" + e);
        } finally {
            System.out.println("Remember! You can't divide by 0");
        }
    }
}
