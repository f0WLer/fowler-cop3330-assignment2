/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Fowler
 */
package ex25;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        int complexity = passwordValidator(password);
        String strength = "very weak";
        switch (complexity) {
            case 0:
                strength = "very weak";
                break;
            case 1:
                strength = "weak";
                break;
            case 2:
                strength = "strong";
                break;
            case 3:
                strength = "very strong";
                break;
        }
        System.out.printf("The password '%s' is a %s password.%n", password, strength);
    }

    public static int passwordValidator(String password)
    {
        char[] passArray = password.toCharArray();

        int numLetters = 0;
        int numNumbers = 0;
        boolean contains_special = false;

        int passLength = password.length();

        Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");

        for (char c : passArray) {
            if ( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == ' ')) {
                numLetters++;
            } else if (Character.isDigit(c)) {
                numNumbers++;
            }

            if (regex.matcher(password).find()) {
                contains_special = true;
            }
        }

        if (numLetters == 0 && passLength < 8) {
            return 0;
        } else if (numNumbers == 0 && passLength < 8) {
            return 1;
        } else if (numLetters > 0 && numNumbers > 0 && passLength >= 8 && !contains_special) {
            return 2;
        } else if (numLetters > 0 && numNumbers > 0 && passLength >= 8 && contains_special) {
            return 3;
        } else {
            return 0;
        }
    }
}
