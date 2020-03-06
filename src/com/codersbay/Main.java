package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] unsorted = {5, 4, 1, 9, 6, 7, 3, 2, 8};

        int[] sorted = bubbleSort(unsorted);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] bubbleSort(int[] unsorted) {
        for (int j = 0; j < unsorted.length; j++) {
            sortTwo(unsorted);
        }
        return unsorted;
    }

    private static void sortTwo(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {
            if (unsorted[i] < unsorted[i - 1]) {
                int temp = unsorted[i];
                unsorted[i] = unsorted[i - 1];
                unsorted[i - 1] = temp;
            }
        }
    }
}
