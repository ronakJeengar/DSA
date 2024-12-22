package com.ronak.arrays;

import java.util.Arrays;

public class SortZerosOnes {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1, 1, 0, 0, 1};

        sortZerosOnesBruteForce(arr);
        sortZerosOnesOptimized(arr);
        sortZerosOnesUsingTwoPointer(arr);
    }

    static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //sort zero and ones using arrays.sort O(nlogn)
    static void sortZerosOnesBruteForce(int[] arr) {

        Arrays.sort(arr);
        printArray(arr);
    }

    //sort zero and ones using for loop and arrays.fill O(n)
    static void sortZerosOnesOptimized(int[] arr) {

        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) zeroCount++;
        }
        Arrays.fill(arr, 0, zeroCount, 0);
        Arrays.fill(arr, zeroCount, arr.length, 1);
        printArray(arr);
    }

    //sort zero and ones using two pointer O(n)
    static void sortZerosOnesUsingTwoPointer(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                // Place 0 and 1 directly and update pointers
                arr[start++] = 0;
                arr[end--] = 1;
            }
            // Skip if start is already 0
            if (arr[start] == 0) {
                start++;
            }
            // Skip if end is already 1
            if (arr[end] == 1) {
                end--;
            }
        }

        printArray(arr);
    }
}
