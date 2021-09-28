package ex33.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

public class ex33 {
    public static void main(String[] args) {
        // Variables
        String[] choices = {"Yes", "No", "Maybe", "Ask Again Later"};
        String input;

        // Prompt
        System.out.println("What's your question?");
        input = Func.scan();

        output(choices);

    }

    public static int output(String[] choices){
        int choice = (int)(Math.random()*100 % 6);
        System.out.print(choices[choice]);
        return choice;
    }
}
