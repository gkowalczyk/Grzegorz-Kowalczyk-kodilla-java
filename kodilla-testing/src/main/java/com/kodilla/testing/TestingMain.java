package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {


    //#2 Testing calculator

        Calculator calculator = new Calculator();
        int r1 = calculator.getSum(1,2);
        int r2 =  calculator.getSub(3,1);

    if ((r1 == 3) && //first test
            (r2 == 2)) { //second test
            System.out.println("Test calculator : OK");
        } else {
            System.out.println("Test calculator :error!!!");
        }

        }

}