/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex24;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams\nEnter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        String yes_or_no = isAnagram(string1, string2) ? "are" : "are not";
        System.out.printf("%s and %s %s anagrams.%n", string1, string2, yes_or_no);
    }

    public static boolean isAnagram(String word1, String word2)
    {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] array1 = word1.toLowerCase(Locale.ROOT).toCharArray();
        char[] array2 = word2.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
