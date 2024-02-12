package lesson13;

import lesson12.HomeWork12;

public class Lesson13 {
    public static void main(String[] args) {
        int[] array = HomeWork12.generateRandomArray(1000000,-100,100);

        long startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.linearSearchMin(array));
        System.out.println((System.currentTimeMillis() - startTime) + "ms");

        HomeWork12.selectionSort(array);

        startTime = System.currentTimeMillis();
        System.out.println(HomeWork12.binarySearchMax(array));
        System.out.println((System.currentTimeMillis() - startTime) + "ms");
    }
}
