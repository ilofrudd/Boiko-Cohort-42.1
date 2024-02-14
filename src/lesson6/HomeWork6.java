package lesson6;

import java.util.Scanner;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #6
 * @author Boiko Yaroslav
 * @version 29.01.24
 */
public class HomeWork6 {
    public static void main(String[] args) {

        //Ex.1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3; ");
        int n = scanner.nextInt();
        switch (n) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Wrong number!");
        }

        //Ex.2

        System.out.println("Enter 1, 2, 3, 4, 5, 6 or 7; ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Wrong number!");
        }

        //Ex.3

        int t = 1;
        while (t <= 10) {
            System.out.println("Task" + t);
            t++;
        }

        //Ex.4

        int number = 5;
        do {
            System.out.println(number);
            number += 5;
        } while (number <= 100);

        //Ex.4

        int number1 = 1;

        do {
            if (number1 % 5 == 0) {
                System.out.println(number1);
            }
            number1++;
        } while (number1 <= 100);

        //Ex.5

        Scanner scanner1 = new Scanner(System.in);
        String targetWord = "hello";
        int attempts = 0;
        do {
            System.out.println("Enter the word 'hello': ");
            String userInput = scanner1.nextLine();
            attempts++;
            if (userInput.equals(targetWord)) {
                System.out.println("Thank you! You entered the correct word.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else {
                System.out.println("Incorrect word. Please try again.");
            }
        } while (true);

        //Ex.6
       /* String expr = "34+8";
        String n1 = "";
        String n2 = "";
        String s = "";
        int p = 0;
        while (p < expr.length()) {
            char ch;
           //  switch (ch) {
              //  case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' ->
                 //   if (s.isEmpty()) {
                   //     n1 += ch;
                   // } else {
                     //   n2 += ch;
                   // }
               // case '+', '-', '*', '/' -> s += ch;


            }
        } */



    }
}