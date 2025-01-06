package com.ronak.searching;

import java.util.Arrays;

public class FindFirstLastOccurrenceInSortedArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 40, 50};
        System.out.println("ans is " + Arrays.toString(findFistLastOccurrenceInSortedArray(arr, 20)));

    }

    static int[] findFistLastOccurrenceInSortedArray(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = findFirstOccurrence(nums, target);
        ans[1] = findLastOccurrence(nums, target);
        return ans;
    }

    static int findFirstOccurrence(int[] arr, int target) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > arr[mid]) {
                s = mid + 1;
            }
            if (target < arr[mid]) {
                e = mid - 1;
            }
            if (target == arr[mid]) {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    static int findLastOccurrence(int[] arr, int target) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target > arr[mid]) {
                s = mid + 1;
            }
            if (target < arr[mid]) {
                e = mid - 1;
            }
            if (target == arr[mid]) {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

}
