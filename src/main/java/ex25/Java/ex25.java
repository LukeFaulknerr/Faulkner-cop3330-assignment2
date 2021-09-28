package ex25.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        String pw;
        System.out.print("Enter your password: ");
        pw = scan();
        int t = passwordValidator(pw);
        print(t, pw);
    }

    public static String scan(){
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        return  a;
    }

    public static int passwordValidator(String pw){

        // check if the password has less than 8 chars
        if (pw.length() < 8){
            // Check if it only contains numbers
            if (numCheck(pw)){
                return 1;
            }
            else if  (letterCheck(pw)){
                return 2;
            }
        }
        else {
            if (specialChar(pw) == false)
                return 3;
            else if (specialChar(pw) == true)
                return 4;
        }
        return 0;
    }

    public static Boolean numCheck(String pw){
        try {
            int a = Integer.parseInt(pw);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Boolean letterCheck(String pw){
        char[] arr = pw.toCharArray();

        for (char x : arr) {
            if(!Character.isLetter(x)) {
                return false;
            }
        }

        return true;
    }

    public static Boolean specialChar(String pw){
        // Variables / Arrays
        boolean ch = false, nu = false, sp = false;
        char[] special = {'!', '@', '#', '$', '%', '^', '&', '*', '-', '_', '?', '<', '>', '.', '+', '='};
        char[] arr = pw.toCharArray();

        // check for numbers, characters, special characters
        for (int i = 0; i < arr.length; i++){
            if (letterCheck(String.valueOf(arr[i])) == true) {
                ch = true;
                continue;
            }
            else if (numCheck(String.valueOf(arr[i])) == true) {
                nu = true;
                continue;
            }
            else {
                for (int j = 0; j < special.length; j++) {
                    if (arr[i] == special[j]) {
                        sp = true;
                        continue;
                    }
                }
            }
        }

        // return value
        if (nu == true && ch == true && sp == true)
            return true;
        else
            return false;
    }

    public static void print(int n, String pw){
        switch (n){
            case 0:
                System.out.print("The password '" + pw + "' is an okay password.");
                break;
            case 1:
                System.out.print("The password '" + pw + "' is a very weak password.");
                break;
            case 2:
                System.out.print("The password '" + pw + "' is a weak password.");
                break;
            case 3:
                System.out.print("The password '" + pw + "' is a strong password.");
                break;
            case 4:
                System.out.print("The password '" + pw + "' is a very strong password.");
                break;
        }
    }
}


