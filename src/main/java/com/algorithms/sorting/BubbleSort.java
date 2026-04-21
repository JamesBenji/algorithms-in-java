package com.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    // Idea behind bubble sort: Keep swapping the numbers until the largest number reaches the end of the array.
    public void sort(int[] array) {
        if (array == null) throw new IllegalArgumentException("Array cannot be null");

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++) {
            // Each i-th round signifies 1 number successfully sorted/bubbled to the end of the array
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                // Subtract i to remove the numbers that have already been sorted
                if (array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j +1] = temp;
                }
                System.out.println("[Round] " + i + "." + j + " " + Arrays.toString(array));
            }

            // What the array looks like at the end of a sorting round

            System.out.println("[Round] " + i + " " + Arrays.toString(array));
        }
    }
}
