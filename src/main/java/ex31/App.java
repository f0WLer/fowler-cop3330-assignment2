/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex31;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = scanner.nextInt();
        System.out.print("What is your resting heart rate? ");
        int restingHR = scanner.nextInt();

        System.out.printf("Resting Pulse: %s\tAge: %s%n%n", age, restingHR);
        System.out.print("Intensity    | Rate\n-------------|--------\n");
        for (double i = 55; i < 100; i += 5) {
            double TargetHeartRate = (((220 - age) - restingHR) * (i / 100)) + restingHR;
            System.out.printf("%s%% \t\t | %s bpm\n", (int) i, (int) TargetHeartRate);
        }
    }
}
