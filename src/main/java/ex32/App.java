/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex32;

import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");

        boolean running = true;
        while (running) {
            System.out.print("\nEnter the difficulty level(1, 2, or 3): ");
            int diff = scanner.nextInt();

            int number;
            if (diff == 1) {
                number = (int) Math.ceil(Math.random() * 10);
            } else if (diff == 2) {
                number = (int) Math.ceil(Math.random() * 100);
            } else {
                number = (int) Math.ceil(Math.random() * 1000);
            }

            boolean found = false;
            int guesses = 0;

            System.out.print("I have my number. What is your guess? ");
            while (!found) {
                int guess = scanner.nextInt();
                if (guess < number) {
                    System.out.print("Too low. Guess again: ");
                } else if (guess > number) {
                    System.out.print("Too high. Guess again: ");
                } else {
                    found = true;
                }
                guesses++;
            }

            System.out.printf("You got it in %s guesses!\n\n", guesses);
            System.out.print("Do you wish to play again? (y/n) ");
            String goAgain = scanner.next().toLowerCase(Locale.ROOT);
            if (!goAgain.equals("y")) {
                running = false;
            }
        }
    }
}
