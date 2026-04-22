package com.algorithms.challenges;

public class BinarySearch {
    public int search(int[] sortedArray, int target) {
        int startIndex = 0;
        int endIndex = sortedArray.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if(sortedArray[midIndex] == target) return midIndex;

            if (target > sortedArray[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
        }

        return -1;
    }
}
