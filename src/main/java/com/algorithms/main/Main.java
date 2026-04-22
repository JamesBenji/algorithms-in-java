package com.algorithms.main;

import com.algorithms.challenges.BinarySearch;
import com.algorithms.sorting.*;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // InsertionSort insertionSort = new InsertionSort();
        // insertionSort.sort(x);
        // MergeSort mergeSort = new MergeSort();
        // mergeSort.sort(x, 0, x.length - 1);
        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.sort(x);
        // SelectionSort selectionSort = new SelectionSort();
        // selectionSort.sort(x);
        // QuickSort quickSort = new QuickSort();
        // quickSort.sort(x, 0, x.length - 1);

        BinarySearch binarySearch = new BinarySearch();
        int target = 139;
        int result = binarySearch.search(x, target);

        System.out.println("Binary search on " + Arrays.toString(x) + " for target(" + target + ")" + " returned index " + result);
    }
}
