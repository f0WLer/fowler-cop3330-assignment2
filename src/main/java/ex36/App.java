/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean inputting = true;
        while (inputting) {
            System.out.print("Enter a number: ");

            String input = scanner.nextLine();
            if (input.equals("done")) {
                inputting = false;
            }

            int parsed;
            try {
                parsed = Integer.parseInt(input);
                numbers.add(new Integer(parsed));
            } catch (final NumberFormatException e) {

            }
        }

        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                System.out.printf("%s", numbers.get(i));
            } else {
                System.out.printf(", %s", numbers.get(i));
            }
        }

        double a = average(numbers);
        int mi = min(numbers);
        int ma = max(numbers);
        double s = std(numbers);

        System.out.printf("\nThe average is %s\nThe minimum is %s\nThe maximum is %s\nThe standard deviation is %.2f\n", a, mi, ma, s);
    }

    private static double average(ArrayList<Integer> numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum / numbers.size();
    }

    private static int min(ArrayList<Integer> numbers)
    {
        int lowest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < lowest) {
                lowest = numbers.get(i);
            }
        }
        return lowest;
    }

    private static int max(ArrayList<Integer> numbers)
    {
        int highest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > highest) {
                highest = numbers.get(i);
            }
        }
        return highest;
    }

    private static double std(ArrayList<Integer> numbers)
    {
        double mean = average(numbers);

        double sum = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            int value = numbers.get(i);
            value -= mean;
            value *= value;
            sum += value;
        }
        sum /= numbers.size();
        return Math.sqrt(sum);
    }

}
