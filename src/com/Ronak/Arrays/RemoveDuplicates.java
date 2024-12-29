package com.ronak.arrays;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int ans = removeDuplicatesBruteForce(arr);
        int ans2 = removeDuplicatesOptimized(arr);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < ans2; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicatesBruteForce(int[] arr) {
        ArrayList<Integer> unique = new ArrayList<>();

        for (int num : arr) {
            if (unique.isEmpty() || unique.get(unique.size() - 1) != num) {
                unique.add(num);
            }
        }

        for (int i = 0; i < unique.size(); i++) {
            arr[i] = unique.get(i);
        }

        return unique.size();
    }

    public static int removeDuplicatesOptimized(int[] arr) {
        if (arr.length == 0) return 0;

        int changeIndex = 1;

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] != arr[index - 1]) {
                arr[changeIndex] = arr[index];
                changeIndex++;
            }
        }

        return changeIndex;
    }
}
