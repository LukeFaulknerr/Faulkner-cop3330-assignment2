package ex26.Java;
/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */
import Useful.Java.Func;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ex26 {
    public static void main(String[] args) {
        // Variables
        String balStr, APRStr, monthlyStr;
        double b, APR, i, p, n;
        DecimalFormat df = new DecimalFormat("##");
        df.setRoundingMode(RoundingMode.UP);


        // Balance
        System.out.print("What is your balance? ");
        balStr = Func.scan();
        b = Double.parseDouble(balStr);

        // APR
        System.out.print("What is the APR on the card? ");
        APRStr = Func.scan();
        APR = Double.parseDouble(APRStr);
        APR = APR/100;
        i = APR/365.0;

        // Monthly Payment
        System.out.print("What is the monthly payment you can make? ");
        monthlyStr = Func.scan();
        p = Double.parseDouble(monthlyStr);

        n = PaymentCalculator.calculateMonthsUntilPaidOff(i, b, p);
        System.out.print("It will take you " + df.format(n) + " months to pay off this card.");
    }
}
