package hw0320;
/**
 * Access Code 2.1
 * Ray Acevedo
 * TwentyQuestionsGame.java
 */
//        Write a program which assumes a random integer X in some range, say 1 - 100,000.
//        It prompts you to input a number and responds with the following information:
//
//        Input number is higher than X
//        Input number is lower than X
//        Input number is equal to X, in which case you win the game Your program gives
//        20 chances to guess the number and you lose if you fail to guess.
//        You can use Java's Math.random() to generate a random number.
//        Note that it returns a double, but we want an int

import java.util.Random;
import java.util.Scanner;

public class TwentyQuestionsGame
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        System.out.println("Guess a number inbewteen 1 and 10");


        while (true) {
            int guess = scanner.nextInt();

            if (guess > n) {
                System.out.println("Too high");
                continue;
            } else if (guess < n) {
                System.out.println("Too low");
                continue;
            } else {
                System.out.println("That's right!");
                break;
            }

        }

    }
}

