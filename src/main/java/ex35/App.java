/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex35;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> contestants = new ArrayList<String>();

        boolean inputting = true;
        while (inputting) {
            System.out.print("Enter a name: ");
            String input = scanner.nextLine();
            if (input == "") {
                inputting = false;
            } else {
                contestants.add(input);
            }
        }

        int winner = (int) Math.floor(Math.random() * contestants.size());

        System.out.printf("The winner is... %s!", contestants.get(winner));
    }
}
