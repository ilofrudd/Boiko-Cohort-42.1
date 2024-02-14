package lesson13;

import lesson12.HomeWork12;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson #13
 * @author Boiko Yaroslav
 * @version 14.02.24
 */
public class Lesson13 {
    public static void main(String[] args) {
        int[] array = HomeWork12.generateRandomArray(1000000,-100,100);
        long startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.linearSearch(array, 45));
        System.out.println((System.currentTimeMillis() - startTime) + "ms");
        HomeWork12.selectionSort(array);
        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.binarySearch(array, 45));
        System.out.println((System.currentTimeMillis() - startTime) + "ms");
    }
}
