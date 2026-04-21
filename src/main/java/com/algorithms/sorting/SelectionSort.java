package com.algorithms.sorting;

public class SelectionSort {
    public void sort (int[] array) {
        int length = array.length;

        for(int i = 0; i < length - 1; i++) {
            int lowerNumberIndex = i;

            // find the index of the new lower number
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[lowerNumberIndex]){
                    lowerNumberIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[lowerNumberIndex];
            array[lowerNumberIndex] = temp;
        }
    }
}
