package com.algorithms.sorting;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] x = {2,3,24,454,23,434,45,2,1};
        insertionSort.sort(x);

        System.out.println(Arrays.toString(x));
    }
}
