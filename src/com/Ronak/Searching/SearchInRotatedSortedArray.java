package com.ronak.searching;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int pivotIndex = getPivotIndex(arr);
        int ans = search(arr, target, pivotIndex);
        System.out.print("ans is : " + ans);
    }

    public static int search(int[] arr, int target, int pivotIndex) {
        int ans = -1;
        if (target >= arr[0] && target <= arr[pivotIndex]) {
            ans = binarySearching(arr, 0, pivotIndex, target);
        } else {
            ans = binarySearching(arr, pivotIndex + 1, arr.length - 1, target);
        }
        return ans;
    }

    public static int binarySearching(int[] arr, int start, int end, int target) {

        int mid = start + (end - start) / 2;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int getPivotIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            mid = s + (e - s) / 2;

            //for single element the element itself is pivot
            if (s == e) return s;

            if (mid + 1 < arr.length && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[0]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
