package com.ronak.arrays;

import java.util.*;

public class FindDuplicateInArray {

    // Using XOR operator for O(n) complexity
    static int findDuplicateUsingXor(int[] arr, int size) {

        int ans = 0;

        for (int i = 0; i < size; i++) {
            ans ^= arr[i];
        }
        for (int i = 1; i < size; i++) {
            ans ^= i;
        }
        return ans;
    }

    // Using Arrays.sort method for O(nlogn) complexity
    static int findDuplicateUsingArraySort(int[] arr, int size) {
        if (arr == null || size < 2) return -1;

        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[i + 1])
                return arr[i];
        }
        return -1;
    }

    // Using Compare method for O(n^2) complexity
    static int findDuplicateUsingCompare(int[] arr, int size) {

        if (arr.length == 0)
            return -1;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4};
        int size = arr.length;

        int ans = findDuplicateUsingXor(arr, size);
        int ans1 = findDuplicateUsingArraySort(arr, size);
        int ans2 = findDuplicateUsingCompare(arr, size);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
