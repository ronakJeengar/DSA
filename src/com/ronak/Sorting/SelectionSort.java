package com.ronak.sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                swap(arr, i, minIndex);
                System.out.println("step " + (i + 1) + " -> " + java.util.Arrays.toString(arr));
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        int[] arr = {64, 25, 12, 22, 11};
//        int[] arr = {1};
//        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
//        selectionSort(arr);
//        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr));
        int[][] testCases = {{64, 25, 12, 22, 11}, {5, 1, 4, 2, 8}, {1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {4, 2, 4, 1, 2, 3, 1}, {0, -1, 5, -10, 3}, {}, {23, 5, 87, 12, 54, 9, 45, 67, 32, 19}};

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i].clone(); // Clone to keep original data intact
            System.out.println("Test case " + (i + 1) + ":");
            System.out.println("Original: " + java.util.Arrays.toString(arr));
            selectionSort(arr);
            System.out.println("Sorted:   " + java.util.Arrays.toString(arr));
            System.out.println();
        }
    }
}

