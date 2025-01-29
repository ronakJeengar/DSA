package com.ronak.sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 6, 4, 1, 8, 2, 7};
        int n = arr.length;

        printArray(arr);
        System.out.println();

        int[] ans = bubbleSort(arr, n);
        printArray(ans);

    }
}
