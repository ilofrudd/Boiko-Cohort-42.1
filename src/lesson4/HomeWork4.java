package lesson4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String a = scanner.next();
        System.out.println("Enter your second name: ");
        String b = scanner.next();
        System.out.println("Enter your city: ");
        String c = scanner.next();
        System.out.println("Enter your age: ");
        int d = scanner.nextInt();
        System.out.println("Enter yor height: ");
        String h = scanner.next();
        System.out.println("My name is " + a + " " + b + ", " + "i live in " + c + ", " + "me " + d + "y.o., " + "my height is " + h + "m.");
    }
}
