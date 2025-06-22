package com.ronak.arrays;

public class ReverseArray {

    // Two Pointer Approach
    static void reverseArray(int[] arr, int n) {

        int start = 0;
        int end = n;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {

        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5 };
        int size = nums.length - 1;
        printArray(nums);
        reverseArray(nums, size);
        printArray(nums);
    }

}
