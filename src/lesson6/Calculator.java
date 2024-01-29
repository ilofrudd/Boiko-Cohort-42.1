package lesson6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression, like 4 :/*/-/+ 3:");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        switch (s) {
            case "+" -> System.out.println(a + " + " + b + " = " + (a + b));
            case "-" -> System.out.println(a + " - " + b + " = " + (a - b));
            case "*" -> System.out.println(a + " * " + b + " = " + (a * b));
            case ":" -> System.out.println(a + " : " + b + " = " + (a / b));
            default -> System.out.println("Error: unknown action: " + s);
        }
    }
}
