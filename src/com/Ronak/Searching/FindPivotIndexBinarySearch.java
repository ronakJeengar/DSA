package com.ronak.searching;

public class FindPivotIndexBinarySearch {

    public static void main(String[] args) {

        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        System.out.println("pivot index is : " + getPivotIndex(arr));
    }

    static int getPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid + 1 < arr.length && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid - 1 >= 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] < arr[0]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
