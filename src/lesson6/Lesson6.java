package lesson6;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
       //Switch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2 or 3; ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number!");
        }
        //Loop while
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        //While with String
        String str = "4316";
        System.out.println(str);
        int p = 0;
        while (p < str.length()) {
            System.out.println(str.charAt(p));
            p++;
        }
        //do while
        do {
            System.out.println(p);
            p++;
        } while (p < str.length());
        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
