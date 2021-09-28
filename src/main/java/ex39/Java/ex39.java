package ex39.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

import java.util.ArrayList;
import java.util.Map;

public class ex39 {
    public static void main(String[] args) {
        // Create List
        ArrayList<Mapping> Records = new ArrayList<Mapping>();
        // Add to map
        Mapping John = new Mapping();
        John.fName = "John";
        John.lName = "Johnson";
        John.position = "Software Engineer";
        John.sepDate = "2016-12-31";
        Records.add(John);

        Mapping Tou = new Mapping();
        Tou.fName = "Tou";
        Tou.lName = "Xiong";
        Tou.position = "Software Engineer";
        Tou.sepDate = "2016-10-05";
        Records.add(Tou);

        Mapping Michaela = new Mapping();
        Tou.fName = "Michaela";
        Tou.lName = "Michaelson";
        Tou.position = "District Manager";
        Tou.sepDate = "2015-12-19";
        Records.add(Michaela);

        Mapping Jake = new Mapping();
        Tou.fName = "Jake";
        Tou.lName = "Jacobson";
        Tou.position = "Programmer";
        Tou.sepDate = "";
        Records.add(Jake);

        Mapping Jacquelyn = new Mapping();
        Tou.fName = "Jacquelyn";
        Tou.lName = "Jackson";
        Tou.position = "DBA";
        Tou.sepDate = "";
        Records.add(Jacquelyn);

        Mapping Sally = new Mapping();
        Tou.fName = "Sally";
        Tou.lName = "Webber";
        Tou.position = "Web Developer";
        Tou.sepDate = "2015-12-18";
        Records.add(Jake);

        // Sort
        for (int i = 0; i < Records.size(); i++){
            for (int j = i + 1; j < Records.size(); j++){
                if (Records.get(i).lName.compareTo(Records.get(j).lName) < 0){
                    Mapping copy = new Mapping();
                    copy = Records.get(i);
                    Records.set(i, Records.get(j));
                    Records.set(j, copy);
                }
            }
        }

        // Print
        System.out.println("Name\t\t| Position \t\t| Separation Date");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < Records.size(); i++){
            System.out.println(Records.get(i).fName + " " +  Records.get(i).lName + "\t\t| " + Records.get(i).position + "\t\t| " + Records.get(i).sepDate);
        }
    }
}
