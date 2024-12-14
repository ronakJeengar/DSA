package com.ronak.Searching.BinarySearch;

public class BinarySearchImplementation {

    static int binarySearch(int[] arr, int size, int target) {

        int start = 0;
        int end = size;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int size = arr.length - 1;
        int target = 1;

        int index = binarySearch(arr, size, target);
        System.out.println(index);

    }
}
