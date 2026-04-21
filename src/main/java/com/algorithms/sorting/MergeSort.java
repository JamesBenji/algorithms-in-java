package com.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    // A divide-and-conquer approach algorithm

    public void sort(int[] array, int startIndex, int endIndex) {
        if (array == null) throw new IllegalArgumentException("Array cannot be null");
        if (startIndex < 0) throw new IllegalArgumentException("The start index must be greater than or equal to zero");
        if (endIndex >= array.length) throw new IllegalArgumentException("The end index must be less than or equal to the array length");
        mergeSort(array, startIndex, endIndex, 0);
    }

    private void mergeSort(int[] array, int startIndex, int endIndex, int depth) {
        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            String indent = "  ".repeat(depth);

            System.out.println(indent + "[mergeSort] ENTER depth=" + depth
                    + " range=[" + startIndex + ".." + endIndex + "]"
                    + " mid=" + midIndex
                    + " received_array=" + Arrays.toString(array)
                    + " received_slice=" + Arrays.toString(Arrays.copyOfRange(array, startIndex, endIndex + 1)));

            System.out.println(indent + "  --> calling LEFT mergeSort range=[" + startIndex + ".." + midIndex + "]");
            mergeSort(array, startIndex, midIndex, depth + 1);
            System.out.println(indent + "  <-- LEFT done");

            System.out.println(indent + "  --> calling RIGHT mergeSort range=[" + (midIndex + 1) + ".." + endIndex + "]");
            mergeSort(array, midIndex + 1, endIndex, depth + 1);
            System.out.println(indent + "  <-- RIGHT done");

            System.out.println(indent + "  --> calling merge range=[" + startIndex + ".." + endIndex + "]");
            merge(array, startIndex, midIndex, endIndex, indent);
            System.out.println(indent + "  <-- merge done");

            System.out.println(indent + "[mergeSort] EXIT depth=" + depth
                    + " range=[" + startIndex + ".." + endIndex + "]"
                    + " forwarded_array=" + Arrays.toString(array)
                    + " forwarded_slice=" + Arrays.toString(Arrays.copyOfRange(array, startIndex, endIndex + 1)));
        }
    }


    public void merge(int[] array, int startIndex, int midIndex, int endIndex, String indent) {
        int subArray1Size = (midIndex - startIndex) + 1;
        int subArray2Size = (endIndex - (midIndex + 1)) + 1;

        int[] subArray1 = new int[subArray1Size];
        int[] subArray2 = new int[subArray2Size];

        for (int i = 0; i < subArray1Size; i++) subArray1[i] = array[startIndex + i];
        for (int j = 0; j < subArray2Size; j++) subArray2[j] = array[midIndex + 1 + j];

        System.out.println(indent + "[merge] range=[" + startIndex + ".." + endIndex + "]"
                + " left_array=" + Arrays.toString(subArray1)
                + " right_array=" + Arrays.toString(subArray2));

        int i = 0, j = 0, k = startIndex;

        while (i < subArray1Size && j < subArray2Size) {
            if (subArray1[i] <= subArray2[j]) {
                System.out.println(indent + "  pick left_array[" + i + "]=" + subArray1[i]
                        + " over right_array[" + j + "]=" + subArray2[j]
                        + " -> array[" + k + "]=" + subArray1[i]);
                array[k++] = subArray1[i++];
            } else {
                System.out.println(indent + "  pick right_array[" + j + "]=" + subArray2[j]
                        + " over left_array[" + i + "]=" + subArray1[i]
                        + " -> array[" + k + "]=" + subArray2[j]);
                array[k++] = subArray2[j++];
            }
        }

        while (i < subArray1Size) {
            System.out.println(indent + "  drain left_array[" + i + "]=" + subArray1[i] + " -> array[" + k + "]");
            array[k++] = subArray1[i++];
        }

        while (j < subArray2Size) {
            System.out.println(indent + "  drain right_array[" + j + "]=" + subArray2[j] + " -> array[" + k + "]");
            array[k++] = subArray2[j++];
        }

        System.out.println(indent + "[merge] DONE range=[" + startIndex + ".." + endIndex + "]"
                + " merged=" + Arrays.toString(Arrays.copyOfRange(array, startIndex, endIndex + 1)));
    }

}
