/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        char[] special = { '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', '[', ']', '<', '>', '?', };

        System.out.print("What's the minimum length? ");
        int minLength = scanner.nextInt();
        System.out.print("How many special characters? ");
        int nSpecial = scanner.nextInt();
        System.out.print("How many numbers? ");
        int nNumbers = scanner.nextInt();

        ArrayList<Character> passChars = new ArrayList<>();

        for (int i = 0; i < nNumbers; i++) {
            passChars.add(Integer.valueOf((int) Math.floor(Math.random() * 10)).toString().toCharArray()[0]);
        }

        for (int i = 0; i < nSpecial; i++) {
            passChars.add(special[(int) Math.floor(Math.random() * special.length)]);
        }

        for (int i = 0; i < minLength - nSpecial - nNumbers; i++) {
            passChars.add((char)(new Random().nextInt(26) + 'a'));
        }

        Collections.shuffle(passChars);

        StringBuilder password = new StringBuilder();
        for (Character c : passChars) {
            password.append(c);
        }

        System.out.printf("Your password is %s.\n", password);
    }
}
