/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex28;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            sum += Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The total is %s.%n", sum);
    }
}
