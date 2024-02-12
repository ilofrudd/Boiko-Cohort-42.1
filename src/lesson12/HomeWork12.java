package lesson12;

import java.util.Random;
import java.util.Arrays;
/**
 * AIT-TR, Java Basic, Cohort42.1, Lesson#12
 * @author Boiko Yaroslav
 * @version 12.02.24
 */
public class HomeWork12 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, 1, 100);
        System.out.println("Massive: " + Arrays.toString(array));

        //Task1
        System.out.println(" |Task1| ");
        int minPosition = linearSearchMin(array);
        System.out.println("Min element minPosition  " + minPosition);

        //Task2

        System.out.println(" |Task2| ");
        selectionSort(array);
        System.out.println(Arrays.toString(array));

        //Task3

        System.out.println(" |Task3| ");
        int maxPosition = binarySearchMax(array);
        System.out.println("Max element position (binary search): " + maxPosition);

        //Task4
        System.out.println(" |Task4| ");
        Stack.push(15);
        Stack.push(7);
        Stack.push(-5);
        System.out.println(Stack.arrayToString());
        System.out.println(Stack.pop());
        System.out.println(Stack.arrayToString());

    }

    static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    static int linearSearchMin(int[] array) {
        int minIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i + 1];
            int minIdx = i + 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;

                }
            }
            if (array[i] > min) {
                array[minIdx] = array[i];
                array[i] = min;
            }
        }
    }
    static int binarySearchMax(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] > array[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

