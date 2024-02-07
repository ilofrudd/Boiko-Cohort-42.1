package lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #9
 * @author Boiko Yaroslav
 * @version 05.02.24
 */
public class HomeWork9 {
    public static void main(String[] args) {
        Random random = new Random();

        //Task 1

        task1(5);
        //Massive

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        //Task 2

        printArray(arr);

        //Task 3

        printArray(arr, true);
        printArray(arr, false);

        //Task 4

        double[] resultTask4 = task4(arr);
        double min = resultTask4[0];
        double max = resultTask4[1];
        double average = resultTask4[2];

        //Task 5

        System.out.println("Max: " + max + "; " + "Min: " + min + "; " + "Average: " + average + "; ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression, like 16+23-1+8 ( :/*/-/+ ):");
        String exp = scanner.next();
        String[] tokens = tokenizeExpression(exp);
        System.out.println("Tokens: " + Arrays.toString(tokens));
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }

    //Task 1

    static void task1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Task" + i);
        }
    }

    //Task 2

    //array output
    static void printArray(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //Task 3

    static void printArray(int[] a, boolean reverse) {
        if (reverse) {
            for (int i = a.length - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        } else {
            for (int i : a) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //Task 4

    static double[] task4(int[] a) {
        int max = a[0];
        int min = a[0];
        double sum = 0.;
        for (int i : a) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double average = sum / a.length;
        return new double[] {min, max, average};
    }

    //task 5
    static String[] tokenizeExpression(String exp) {
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
        return Arrays.copyOf(tokens, idx);
    }
    static int evaluateExpression(String[] tokens) {
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
            }
        }
        return result;
    }
}