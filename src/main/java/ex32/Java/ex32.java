package ex32.Java;

/*
    UCF COP3330 Fall 2021 Assignment 2 Solution
    Copyright 2021 Luke Faulkner
 */

import Useful.Java.Func;

public class ex32 {
    public static void main(String[] args) {
        // Welcome prompt
        System.out.print("Let's play Guess the Number!\n\n");

        // Start game
        gameTime();
    }

    public static int numSelector(int dif){
        int correctNum = 0;
        switch(dif) {
            case 1:
                correctNum = (int) ((Math.random() * (10)) + 1);
                break;
            case 2:
                correctNum = (int) ((Math.random() * (100)) + 1);
                break;
            case 3:
                correctNum = (int) ((Math.random() * (1000)) + 1);
                break;
        }
        return correctNum;
    }

    public static void gameTime(){
        // Variables
        String difStr, guessStr, playAgain;
        int dif, correctNum = 0, guessAmt = 0, guess = -1;

        // Difficulty options
        System.out.print("Enter the difficulty level (1, 2, 3): ");
        difStr = Func.scan();
        dif = Integer.parseInt(difStr);

        // Assign Variables for game
        correctNum = numSelector(dif);
        System.out.print("I have my number. What's your guess? ");
        while (correctNum != guess){
            // Take in integer
            guessStr = Func.scan();

            // Checks if the input is actually an integer, increments and tries again if not
            if (!Func.numCheck(guessStr)){
                System.out.print("That is not a number. Guess again. ");
                guessAmt++;
                continue;
            }
            // Parse to int if the input was an int
            guess = Integer.parseInt(guessStr);

            // Compare
            if (guess < correctNum){
                System.out.print("Too low. Guess again. ");
                guessAmt++;
                continue;
            }
            else if (guess > correctNum){
                System.out.println("Too high. Guess again: ");
                guessAmt++;
                continue;
            }
            else if (guess == correctNum){
                System.out.println("You got it in " + guessAmt + " guesses!");
            }
        }
        System.out.print("\nDo you wish to play again (Y/N)?");
        playAgain = Func.scan();
        if (playAgain.equals("Y") || playAgain.equals("y"))
            gameTime();
        else
            return;
    }
}
