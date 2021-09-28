/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex34;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.printf("There are %s employees.\n", employees.size());
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.print("\nEnter an employee name to remove: ");
        String terminated = scanner.nextLine();

        String[] temp = {};
        int j = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).toLowerCase(Locale.ROOT).equals(terminated.toLowerCase(Locale.ROOT))) {
                employees.remove(i);
            }
        }

        System.out.println("There are " + employees.size() + " employees.");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
