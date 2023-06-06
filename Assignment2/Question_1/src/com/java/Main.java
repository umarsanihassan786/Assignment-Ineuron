package com.java;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 9, 1, 5 };

        System.out.println("Duplicates in the array:");
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        int length = array.length;

        // Iterate over each element in the array
        for (int i = 0; i < length - 1; i++) {
            // Check if the element is already marked as a duplicate
            if (array[i] == -1) {
                continue;
            }

            // Compare the current element with the remaining elements
            for (int j = i + 1; j < length; j++) {
                // If a duplicate is found
                if (array[i] == array[j]) {
                    // Mark the duplicate element as -1
                    array[j] = -1;
                    System.out.println(array[i]);
                }
            }
        }
    }
}
