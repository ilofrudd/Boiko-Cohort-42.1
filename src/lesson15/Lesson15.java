package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #15
 * @author Boiko Yaroslav
 * @version 16.02.24
 */
public class Lesson15 {
    public static void main(String[] args) {
        Cat cat = new Cat("Mursik", "White", 3, 100);
        cat.voice();
        System.out.println(cat.name +  ", " + cat.color + ", " + cat.age);
        cat.eat(10);
        System.out.println(cat.satiated());
        System.out.println(cat.walk());
        System.out.println();

        Cat cat1 = new Cat("Barsik", "Black", 5, 100);
        cat1.voice();
        System.out.println(cat1.name +  ", " + cat1.color + ", " + "age " + cat1.age);
        cat1.eat(80);
        System.out.println(cat1.satiated());
        System.out.println(cat1.run());
    }
}

