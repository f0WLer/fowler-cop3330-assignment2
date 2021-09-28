/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex27;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String first = scanner.nextLine();
        System.out.print("Enter the last name: ");
        String last = scanner.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = scanner.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = scanner.nextLine();

        validateInput(first, last, zip, id);
    }

    private static void validateInput(String first, String last, String zip, String id)
    {
        boolean errorFree = checkFirst(first);
        if (!checkLast(last)) { errorFree = false; }
        if (!checkZip(zip)) { errorFree = false; }
        if (!checkId(id)) { errorFree = false; }

        if (errorFree) { System.out.println("There were no errors found"); }
    }

    private static boolean checkFirst(String first)
    {
        if (first.length() == 0) {
            System.out.println("The first name must be filled in.");
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
        if (first.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
        return true;
    }

    private static boolean checkLast(String last)
    {
        if (last.length() == 0) {
            System.out.println("The last name must be filled in.");
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }
        if (last.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }
        return true;
    }

    private static boolean checkZip(String zip)
    {
        if (zip.length() < 5) {
            System.out.println("The zip code must be a 5 digit number.");
            return false;
        }

        try {
            Integer.parseInt(zip);
        } catch (final NumberFormatException e) {
            System.out.println("The zip code must be a 5 digit number.");
            return false;
        }
        return true;
    }

    private static boolean checkId(String id)
    {
        char[] chars = id.toCharArray();

        boolean errorFree = true;
        if (!Character.isAlphabetic(chars[0])) {
            errorFree = false;
        } else if (!Character.isAlphabetic(chars[1])) {
            errorFree = false;
        } else if (chars[2] != '-') {
            errorFree = false;
        } else {
            for (int i = 3; i < 7; i++) {
                if (!Character.isDigit(chars[i])) {
                    errorFree = false;
                }
            }
        }
        if (!errorFree) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
        return true;
    }
}
