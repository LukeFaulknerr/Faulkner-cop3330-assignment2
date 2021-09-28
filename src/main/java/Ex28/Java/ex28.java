package Ex28.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

public class ex28 {
        public static void main(String[] args) {

                String inStr;
                int add, total = 0;

                for (int i = 0; i < 5; i++){
                        System.out.print("Enter a number: ");
                        inStr = Func.scan();
                        add = Integer.parseInt(inStr);
                        total += add;
                }
                System.out.print("The total is " + total + ".");
        }

        // Function for testing purposes
        public static int adder(int a){
                int total = 0;

                for (int i = 0; i < 5; i++){
                        total += a;
                }
                return total;
        }
}
