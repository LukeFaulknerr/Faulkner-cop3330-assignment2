package ex34.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

import java.util.ArrayList;

public class ex34 {
    public static void main(String[] args) {
        // Variable
        String removal;

        // Employee Array
        ArrayList<String> Employees = new ArrayList<String>();
        Employees.add("John Smith");
        Employees.add("Jackie Johnson");
        Employees.add("Chris Jones");
        Employees.add("Amanda Cullen");
        Employees.add("Jeremy Goodwin");

        // Initial Print
        print(Employees);

        // Removal Prompt
        System.out.println("\nEnter an employee name to remove: ");
        removal = Func.scan();
        remove(Employees, removal);

        print(Employees);

    }

    public static void print(ArrayList<String> x){
        // Print employee names
        System.out.println("There are " + x.size() + " employees:");

        for (int i = 0; i < x.size(); i++)
            System.out.println(x.get(i));
    }
    public static void remove(ArrayList<String> x, String s){
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).equals(s)) {
                x.remove(i);
                return;
            }
        }
    }
}
