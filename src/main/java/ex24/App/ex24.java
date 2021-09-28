package ex24.App;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Arrays;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        // Variables
        String a, b;
        Boolean x;

        // Prompt
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        a = scan();

        System.out.print("Enter the second string: ");
        b = scan();

        // check if the words are anagrams
        x = isAnagram(a, b);

        // Final print statement
        if (x){
            System.out.print("\"" + a + "\" and \"" + b + "\" are anagrams.");
        }
        else {
            System.out.print("\"" + a + "\" and \"" + b + "\" are not anagrams.");
        }
    }

    public static String scan(){
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        return  a;
    }

    public static boolean isAnagram(String a, String b){
        // Set boolean to true, change to false if error is found
        boolean t = true;

        // Check lengths of inputs
        if (a.length() != b.length()){
            t= false;
        }
        else{
            // Add all characters to arrays and sort
            // If they are anagrams, the arrays should be the same
            char[] arr1 = a.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            char[] arr2 = b.toLowerCase().toCharArray();
            Arrays.sort(arr2);
            t = Arrays.equals(arr1,arr2);
        }
        return t;
    }
}
