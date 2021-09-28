package ex35.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

import java.util.ArrayList;

public class ex35 {
    public static void main(String[] args) {
        // Variables
        String input;

        // Array
        ArrayList<String> names = new ArrayList<String>();

        // Enter names
        for (int i = 0; i < 6; i++){
            System.out.print("Enter a name: ");
            input = Func.scan();
            if (input.equals(""))
                continue;
            names.add(input);
        }

        // Choose winner
        chooseWinner(names);

    }
    public static int chooseWinner(ArrayList<String> x){
        int choice = (int)(Math.random()*1000 % x.size());
        System.out.println("The winner is..." + x.get(choice));
        return choice;
    }
}
