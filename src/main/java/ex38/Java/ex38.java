package ex38.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

import java.util.ArrayList;

public class ex38 {
    public static void main(String[] args) {
        // Variables
        String input;
        int x = 0;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // Prompt
        System.out.print("Enter a list of numbers, separated by spaces: ");
        input = Func.scan();

        // Add to Array
        for (int i = 0; i < input.length(); i++){
           if (input.charAt(i) != ' ')
                nums.add(Integer.parseInt(Character.toString(input.charAt(i))));
        }


        // Filter Evens
        nums = filterEvenNumbers(nums);

        // Print Result
        System.out.print("The even numbers are: ");
        for (int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i) + " ");
        }

    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> x){
        for (int i = 0; i < x.size(); i++){
            if (x.get(i) % 2 != 0)
                x.remove(i);
        }
        return x;
    }
}
