package ex29.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;
public class ex29 {
    public static void main(String[] args) {
        // Variables
        String rateStr = null;
        int rate, years;
        Boolean valid = false;

        while (!valid){
            System.out.print("What is the rate of return? ");
            rateStr = Func.scan();
            valid = inputCheck(rateStr);
        }

        rate = Integer.parseInt(rateStr);
        years = (72 / rate);
        System.out.print("It will take " + years + " years to double your initial investment.");
    }
    public static Boolean inputCheck(String s){
        if (s.equals("0") || !numCheck(s)){
            System.out.println("Sorry. that's not a valid input.");
            return false;
        }
        return true;
    }

    public static Boolean numCheck(String s){
        try {
            int a = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
