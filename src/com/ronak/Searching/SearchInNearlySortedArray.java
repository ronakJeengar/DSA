package com.ronak.searching;

public class SearchInNearlySortedArray {

    public static void main(String[] args) {
        int[] array = {10, 3, 40, 20, 50, 80, 70};
        int target = 70;

        int ans = searchInNearlySortedArray(array, target);
        System.out.println("target found at index : " + ans);
    }

    static int searchInNearlySortedArray(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (mid - 1 >= 0 && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid + 1 <= arr.length - 1 && arr[mid + 1] == target) {
                return mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
        return -1;
    }

}
