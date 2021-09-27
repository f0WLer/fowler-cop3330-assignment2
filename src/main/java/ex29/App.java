/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex29;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        while (r < 1) {
            System.out.print("What is the rate of return? ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 1) {
                System.out.println("Sorry, that's not a valid input.");
            }
        }
        int years = 72 / r;
        System.out.printf("It will take %s years to double your initial investment.%n", years);
    }
}
