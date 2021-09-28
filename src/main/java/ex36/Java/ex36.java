package ex36.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ex36 {
    public static void main(String[] args) {
        // Variables
        int input;
        String inputStr = "ph";
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        // ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // Add to arraylist
        while (true){
            System.out.print("Enter a number: ");
            inputStr = Func.scan();
            if (inputStr.equals("done"))
                break;
            else if (!Func.numCheck(inputStr))
                continue;
            input = Integer.parseInt(inputStr);
            nums.add(input);
        }

        print(nums);

        System.out.println("The average is " + df.format(average(nums)));
        System.out.println("The minimum is " + min(nums));
        System.out.println("The maximum is " + max(nums));
        System.out.println("The standard deviation is " + df.format(std(nums)));
    }

    public static void print(ArrayList<Integer> x){
        // Print employee names
        System.out.print("Numbers: ");

        for (int i = 0; i < x.size(); i++) {
            if (i == x.size() - 1) {
                System.out.println(x.get(i));
                break;
            }
            System.out.print(x.get(i) + ", ");
        }
    }

    public static double average(ArrayList<Integer> x){
        double total = 0, avg = 0;
        // Add all nums
        for (int i = 0; i < x.size(); i++){
            total += x.get(i);
        }
        avg = total / x.size();
        return avg;
    }

    public static int min(ArrayList<Integer> x){
        // Set init min
        int min = x.get(0);

        // Find min
        for (int i = 1; i < x.size(); i++){
            if (x.get(i) < min)
                min = x.get(i);
        }

        return min;
    }

    public static int max(ArrayList<Integer> x){
        // Set init min
        int max = x.get(0);

        // Find min
        for (int i = 1; i < x.size(); i++){
            if (x.get(i) > max)
                max = x.get(i);
        }

        return max;
    }

    public static double std(ArrayList<Integer> x){
        double tdev = 0, fdev;
        // find total deviations
        for (int i = 0; i < x.size(); i++){
            tdev += Math.pow((x.get(i) - average(x)), 2);
        }
        fdev = Math.sqrt((tdev)/x.size());
        return fdev;
    }
}
