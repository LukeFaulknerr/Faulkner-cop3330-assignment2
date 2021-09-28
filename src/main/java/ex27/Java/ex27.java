package ex27.Java;
/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;
public class ex27 {
    public static void main(String[] args) {
        // Variables
        String fName = null, lName = null, ID = null, ZIP = null;

        // Prompts
        System.out.print("Enter your first name: ");
        fName = Func.scan();

        System.out.print("Enter your last name: ");
        lName = Func.scan();
        System.out.println("Last name: " + lName);

        System.out.print("Enter your ZIP code: ");
        ZIP = Func.scan();

        System.out.print("Enter your employee ID: ");
        ID = Func.scan();

        // Checks
        output(fName, lName, ZIP, ID);
    }

    public static Boolean firstLength(String s){
        if (s.length() <= 2)
            return false;
        return true;
    }

    public static Boolean firstFilled(String s){
        if (s == null || s == "")
            return true;
        return false;
    }

    public static Boolean lastLength(String s){
        if (s.length() <= 2)
            return false;
        return true;
    }

    public static Boolean lastFilled(String s){
        if (s == null || s == "")
            return true;
        return false;
    }

    public static Boolean IDFormat(String s){
        if (s.matches("\\w{2}-\\d{4}"))
            return true;
        return false;
    }

    public static Boolean ZIPNumCatch(String s){
        try {
            int a = Integer.parseInt(s);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        if (s.length() != 5)
            return false;

        return true;
    }

    public static void output(String fName, String lName, String ZIP, String ID){
        if (!firstLength(fName))
            System.out.println("The first name must be 2 characters long.");
        if (firstFilled(fName))
            System.out.println("The first name must be filled in.");
        if (!lastLength(lName))
            System.out.println("The last name must be 2 characters long.");
        if (lastFilled(lName))
            System.out.println("The last name must be filled in.");
        if (!IDFormat(ID))
            System.out.println("The employee ID must be filled in the format of AA-1234");
        if (!ZIPNumCatch(ZIP))
            System.out.println("The zipcode must be a five digit number.");
    }
}
