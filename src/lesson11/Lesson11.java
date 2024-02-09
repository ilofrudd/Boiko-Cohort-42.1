package lesson11;

import java.util.Arrays;

public class Lesson11 {
    public static void main(String[] args) {
        int[] array = {1, 8, 12, -4, 6, 3, 7, -13};
        int toSearch = -0;
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toSearch) {
                idx = 1;
                break;
            }
        }
        System.out.println(idx);
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void exchangeSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i + 1];
            int minIdx = i + 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIdx = j;

                }
            }
            if (a[i] > min) {
                a[minIdx] = a[i];
                a[i] = min;
            }
        }
    }
}