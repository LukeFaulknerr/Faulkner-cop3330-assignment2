package ex30.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */


public class ex30 {
    public static void main(String[] args) {
        int prod;
        for (int i = 1; i <= 12; i++){
            for (int j = 1; j <= 12; j++){
                prod = i * j;
                System.out.print(prod + "\t");
            }
            System.out.println("");
        }
    }
}
