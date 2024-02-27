package lesson19;

import java.util.ArrayList;

public class Lesson19 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        ra.add(8);
        ra.add(12);
        ra.add(-5);
        ra.add(23);
        ra.add(11);
        System.out.println(ra);
        ra.add(17, 3);
        System.out.println(ra);
        System.out.println(ra.get(2));
        ra.remove(2);
        System.out.println(ra);
    }
}
