package com.codersbay;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {5, 4, 1, 9, 6, 7, 3, 2, 8};
        int temp;
        for (int j = 0; j < unsorted.length; j++) {
            for (int i = 1; i < unsorted.length; i++) {
                if (unsorted[i] < unsorted[i - 1]) {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i - 1];
                    unsorted[i - 1] = temp;
                    // System.out.println(temp);
                }
            }
        }
        for (int p : unsorted) {
            System.out.print(p + " ");
        }
    }
}
