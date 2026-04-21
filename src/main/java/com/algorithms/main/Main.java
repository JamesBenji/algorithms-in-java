package com.algorithms.main;

import com.algorithms.sorting.*;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int[] x = {12, 3, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
        // insertionSort.sort(x);
        MergeSort mergeSort = new MergeSort();
        // mergeSort.sort(x, 0, x.length - 1);
        BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.sort(x);
        SelectionSort selectionSort = new SelectionSort();
        // selectionSort.sort(x);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(x, 0, x.length - 1);

        System.out.println(Arrays.toString(x));
    }
}
