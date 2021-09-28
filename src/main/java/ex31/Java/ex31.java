package ex31.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

public class ex31 {
    public static void main(String[] args) {
        // Variables
        String resPulStr = null, ageStr = null;
        int resPul = 0, age = 0;
        Boolean valid = false;

        // Enter resting hr
        while (!valid) {
            System.out.println("Enter your resting heart rate: ");
            resPulStr = Func.scan();
            valid = inputCheck(resPulStr);
        }
        resPul = Integer.parseInt(resPulStr);

        // reset valid and do age
        valid = false;
        while (!valid) {
            System.out.print("Enter your age: ");
            ageStr = Func.scan();
            valid = inputCheck(ageStr);
        }
        age = Integer.parseInt(ageStr);

        output(resPul, age);

    }

    public static int targetHeartRateCalculator(int resPul, int age, double intensity){
        int THR = Func.roundUp(((((220 - age) - resPul) * intensity) +resPul));
        return THR;
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

    public static Boolean inputCheck(String s){
        if (!numCheck(s)){
            return false;
        }
        return true;
    }

    public static void output(int resPul, int age){
        // Variable
        int rate;
        // Table setup
        System.out.println("Resting Pulse: " + resPul + "\t\tAge: " + age);
        System.out.println("Intensity\t| Rate");
        System.out.println("---------------------");

        for (double intensity = 55; intensity <=95; intensity+= 5){
            rate = targetHeartRateCalculator(resPul, age, (intensity/100));
            System.out.println(intensity + "%\t\t| " + rate + " bpm");
        }
    }
}
