package com.java;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 8, 3, 2, 7, 6, 4};
        
        System.out.println("Original Array:");
        printArray(array);
        
        bubbleSort(array);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    
    public static void bubbleSort(int[] array) {
        int length = array.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
