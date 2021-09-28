package ex37.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

import java.security.SecureRandom;
import java.util.ArrayList;

public class ex37 {
    public static void main(String[] args) {
        // Variables
        String numsStr, specStr, lengthStr, pw;
        int nums, spec, length;

        // Read in data
        System.out.print("What's the minimum length?" );
        lengthStr = Func.scan();
        length = Integer.parseInt(lengthStr);

        System.out.print("How many special characters? ");
        specStr = Func.scan();
        spec = Integer.parseInt(specStr);

        System.out.print("How many numbers? ");
        numsStr = Func.scan();
        nums = Integer.parseInt(numsStr);

        pw = generateRandomPassword(length, nums, spec);

        System.out.print("Your password is " + pw);
    }
    public static String generateRandomPassword(int length, int nums, int spec){
        // Variables
        int numIndex = 0, specIndex = 0;

        // Create strings with every desired character in categories
        final String characters = "abcdefghijklmnopqrstubwxyz";
        final String numbers = "0123456789";
        final String specialChars = "!@#$%^&*_-+=<>.?~";

        // Helper Objects
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        // Increase array size if needed
        if (length - spec - nums < spec + nums)
            length = 2 * spec + 2 * nums;

        // Create arrays to hold indexes for where the desired chars will go
        ArrayList<Integer> numIndexes = new ArrayList<Integer>();
        ArrayList<Integer> specIndexes = new ArrayList<Integer>();
        numIndexes = makeArrs(length, nums, spec);

        // Shift some indexes to special array
        for (int i = numIndexes.size(); i > nums; i--){
            int index = (int)(Math.random()*1000 % numIndexes.size());
            specIndexes.add(numIndexes.get(index));
            numIndexes.remove(index);
        }

        // Add a -1 to the end of each ArrayList to signal it being over
        numIndexes.add(-1);
        specIndexes.add(-1);

        // Create String
        for (int i = 0; i < length; i++){
            if (i == numIndexes.get(numIndex)){
                int randomIndex = sr.nextInt(numbers.length());
                sb.append(numbers.charAt(randomIndex));
                numIndex++;
            }
            else if (i == specIndexes.get(specIndex)){
                int randomIndex = sr.nextInt(specialChars.length());
                sb.append(specialChars.charAt(randomIndex));
                specIndex++;
            }
            else{
                int randomIndex = sr.nextInt(characters.length());
                sb.append(characters.charAt(randomIndex));
            }
        }
        return sb.toString();
    }

    public static ArrayList<Integer> makeArrs(int length, int nums, int spec){
        int totalnums = nums + spec;

        // Make an array with all nums
        ArrayList<Integer> desired = new ArrayList<Integer>();
        for (int i = 0; i < length; i++)
            desired.add(i);

        for (int i = length; i > totalnums; i--){
            desired.remove((int)(Math.random()*1000 % desired.size()));
        }

        return desired;
    }
}
