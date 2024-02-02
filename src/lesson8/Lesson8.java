package lesson8;

import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {
        int[] b = new int[5];
        int[] array = {1, 2, 5, 7, 8, -2, -9};
        System.out.println(array[3]);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        for (int i = 4; i > -1; i -= 2) {
            System.out.println(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}