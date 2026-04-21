package com.algorithms.sorting;

public class InsertionSort {
    public void sort(int[] array) {
        // starting at index 1 such that we can have the same 'check-previous logic work'
        for(int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentNumber;
        }
    }
}
