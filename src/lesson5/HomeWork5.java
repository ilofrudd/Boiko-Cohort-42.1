package lesson5;

import java.util.Random;
import java.util.Scanner;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW #5
 * @author Boiko Yaroslav
 * @version 25.01.24
 */
public class HomeWork5 {
    public static void main(String[] args) {

        //Ex.1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();
        boolean a1 = n1 % 2 == 0;
        boolean a2 = n2 % 2 == 0;
        boolean b1 = n1 % 3 == 0;
        boolean b2 = n2 % 3 == 0;
        boolean c1 = a1 && b1;
        boolean c2 = a2 && b2;
        System.out.println("Number: " + n1 + " even: " + a1 + "; multiple 3: "  + b1 + "; even and multiple 3: " + c1);
        System.out.println("Number: " + n2 + " even: " + a2 + "; multiple 3: "  + b2 + "; even and multiple 3: " + c2);

        //Ex.2

        System.out.println("Enter a number (1, 2, or 3): ");
        int number = scanner.nextInt();
        String[] words = {"invalid number", "one", "two", "three"};
        String result = (number >= 1 && number <= 3) ? words[number] : words[0];
        System.out.println("You entered: " + result);

        //Ex.3

        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);
        System.out.println("Generated numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ";");
        int maxNum = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println("The MAX number is: " + maxNum);

        //Ex.4

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        String s = scanner1.nextLine();
        if (s.length() != 4) {
            System.out.println("Error: Please enter a four-digit number.");
            System.exit(1);
            }
            int number1 = s.charAt(0) - '0';
            int number2 = s.charAt(1) - '0';
            int number3 = s.charAt(2) - '0';
            int number4 = s.charAt(3) - '0';
            boolean luckyT = (number1 + number2) == (number3 + number4);
            if (luckyT) {
                System.out.println("Congratulations! It's a lucky ticket.");
            } else {
                System.out.println("Sorry, not a lucky ticket.");
            }
    }
}
