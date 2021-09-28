/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex33;

import java.lang.reflect.Array;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        String[] responses = {
                "Yes",
                "No",
                "Maybe",
                "Ask again later",
        };

        System.out.print("What is your question?\n>");
        scanner.nextLine();
        System.out.println();
        System.out.print(responses[(int) Math.floor(Math.random() * Array.getLength(responses))]);
    }
}
