package lesson12;

import java.util.Random;
import java.util.Arrays;
/**
 * AIT-TR, Java Basic, Cohort42.1, HW#12
 * @author Boiko Yaroslav
 * @version 12.02.24
 */
public class HomeWork12 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10, 1, 100);
        System.out.println("Massive: " + Arrays.toString(array));

        //Task1

        System.out.println(" |Task1| ");
        int minPosition = linearSearch(array);
        System.out.println("Element Position  " + minPosition);

        //Task2

        System.out.println(" |Task2| ");
        selectionSort(array);
        System.out.println(Arrays.toString(array));

        //Task3

        System.out.println(" |Task3| ");
        int maxPosition = binarySearch(array);
        System.out.println("Element position (binary search): " + maxPosition);

        //Task4

        System.out.println(" |Task4| ");
        Stack.push(15);
        Stack.push(7);
        Stack.push(-5);
        System.out.println(Stack.arrayToString());
        System.out.println(Stack.pop());
        System.out.println(Stack.arrayToString());

    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    public static int linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }
    public static void selectionSort(int[] array) {
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
    public static int binarySearch(int[] a, int n) {
        int left = 0, right = a.length - 1;
        while (left + 1 != right) {
            int middle = left + (right - left) / 2;
            if (a[middle] == n) {
                return middle;
            }
            if (a[middle] > n) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return -1;
    }
}

