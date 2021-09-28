/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex38;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scanner.nextLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : input.split("\\s+")) {
            if (!Objects.equals(s, " ")) {
                numbers.add(Integer.valueOf(s));
            }
        }

        ArrayList<Integer> evenNumbers = filterEvenNumbers(numbers);

        StringBuilder output = new StringBuilder().append("The even numbers are");
        for (Integer i : evenNumbers) {
            output.append(" ").append(i);
        }

        System.out.println(output);
    }

    private static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer i: numbers) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
