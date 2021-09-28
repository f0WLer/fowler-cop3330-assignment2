/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex30;

public class App
{
    public static void main( String[] args )
    {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j ++) {
                int product = i * j;
                if (product > 99) {
                    System.out.printf("  %s", product);
                } else if (product > 9) {
                    System.out.printf("   %s", product);
                } else {
                    System.out.printf("    %s", product);
                }
            }
            System.out.println();
        }
    }
}
