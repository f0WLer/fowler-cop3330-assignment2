/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex35;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> contestants = new ArrayList<>();

        boolean inputting = true;
        while (inputting) {
            System.out.print("Enter a name: ");
            String input = scanner.nextLine();
            if (Objects.equals(input, "")) {
                inputting = false;
            } else {
                contestants.add(input);
            }
        }

        int winner = (int) Math.floor(Math.random() * contestants.size());

        System.out.printf("The winner is... %s!", contestants.get(winner));
    }
}
