package com.algorithms.sorting;

public class QuickSort {
    // For any number at the end of the array chosen to be the pivot, it must land in a position i + 1, such that i is the index of the last number smaller than it, implying that it has landed in its final sorted position in the array.
    // Each pivot ends up in its final sorted position.
    // The rule: Each pivot must end up in its final sorted position in the array (never to be touched again)
    // The strategy is to sort the entire array by making each number some sort of pivot

    public void sort(int[] array, int low, int high) {
        if (low < high) {
            System.out.println("\n--- sort() called: low=" + low + " high=" + high + " ---");
            System.out.println("  Subarray: " + subarray(array, low, high));

            int pivotIndex = partition(array, low, high);

            System.out.println("  Pivot placed at index " + pivotIndex + " (value=" + array[pivotIndex] + ")");
            System.out.println("  Array now: " + arrayToString(array));

            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        System.out.println("  Partitioning around pivot=" + pivot);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                System.out.println("    arr[" + j + "]=" + array[j] + " <= pivot(" + pivot + ") → swap index " + i + " and " + j);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.println("    Array: " + arrayToString(array));
            } else {
                System.out.println("    arr[" + j + "]=" + array[j] + " >  pivot(" + pivot + ") → no swap");
            }
        }

        // Place pivot in correct position
        System.out.println("    Placing pivot=" + pivot + " at index " + (i + 1));
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // --- Helpers ---

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }

    private String subarray(int[] array, int low, int high) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = low; i <= high; i++) {
            sb.append(array[i]);
            if (i < high) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}