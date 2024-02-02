package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #8
 * @author Boiko Yaroslav
 * @version 02.02.24
 */
public class HomeWork8 {
    public static void main(String[] args) {

        // Ex. #1

        System.out.println("Ex. #1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Task" + i);
        }

        // Ex. #2

        System.out.println("Ex. #2");
        int[] array = {1, 18, 75, 22, 70, 55, 44, 11, -10, 98, 45, 18, 20, 21, 91, 62, 75, 90, -25, 100};
        System.out.print(Arrays.toString(array));
        System.out.print("\nArray numbers multiples of 5:\n");
        for (int i : array) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        // Ex. #3

        System.out.println();
        System.out.print("Ex. #3");
        String[] words = {"Red", "Orange", "Yellow", "Green", "Blue", "Magenta"};
        int maxLength = 0;
        String longestWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        System.out.println();

        char[] result = longestWord.toCharArray();
        for (char c : result) {
            System.out.println(c);
        }

        // Ex. #4

        System.out.println("Ex. #4");
        int[] numbs = new int[10];
        Random num = new Random();
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = num.nextInt(10);
            System.out.print(numbs[i] + " ");
        }

        // Minimum

        int min = numbs[0];
        for (int i = 0; i < numbs.length; i++) {
            if (min > numbs[i]) {
                min = numbs[i];
            }
        }
        System.out.println();
        System.out.println("Min is: " + min);

        // Maximum

        int max = numbs[0];
        for (int i = 0; i < numbs.length; i++) {
            if (max < numbs[i]) {
                max = numbs[i];
            }
        }
        System.out.println("Max is: " + max);

        // Average

        double average = 0;
        for (int i = 0; i < numbs.length; i++) {
            average += (double) numbs[i] / numbs.length;
        }
        System.out.println("Avg is: " + average);

        // Ex. #5

        System.out.println("Ex. #5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression, like 16+23-1+8 ( :/*/-/+ ):");
        String exp = scanner.next();
        String[] tokens = new String[10];
        int idx = 0;
        String number = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            switch (ch) {
                case '+', '-', '*', '/':
                    tokens[idx] = number;
                    tokens[idx + 1] = String.valueOf(ch);
                    idx += 2;
                    number = "";
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    number += ch;
                    break;
            }
        }
        if (!number.isEmpty()) {
            tokens[idx] = number;
            idx++;
        }
        System.out.println(Arrays.toString(tokens));
        System.out.println(idx);
    }
}
