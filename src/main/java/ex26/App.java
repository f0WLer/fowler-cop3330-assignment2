/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex26;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int b, i, p;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your balance? ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("What is the APR on the card (as a percent)? ");
        i = Integer.parseInt(scanner.nextLine()) / 365;
        System.out.print("What is the monthly payment you can make? ");
        p = Integer.parseInt(scanner.nextLine());

        double months_left = PaymentCalculator.calculateMonthsUntilPaidOff(b, i, p);

        System.out.println("It will take you " + months_left + " months to pay off this card.");
    }
}
