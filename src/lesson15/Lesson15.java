package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #15
 * @author Boiko Yaroslav
 * @version 16.02.24
 */
public class Lesson15 {
    public static void main(String[] args) {
        int a = 10;
        Scanner scanner = new Scanner(System.in);
        /* Cat cat = new Cat();//"Murzik", "White", 3);
        cat.voice();
        System.out.println(cat.name + ", " + cat.color + ", " + cat.age);
*/
        System.out.println("The cat");
        Cat cat1 = new Cat(scanner.next(), "Black", 5, 10);
        cat1.voice();
        System.out.println(cat1.name + ", " + cat1.color + ", " + cat1.age);
        cat1.eat ( scanner.nextInt());
        System.out.println(cat1.satiated());
    }
}
