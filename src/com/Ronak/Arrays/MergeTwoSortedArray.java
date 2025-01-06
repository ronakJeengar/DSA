package com.ronak.arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 0, 0, 0, 0};
        int[] nums2 = {2, 4, 6, 8};

        int[] ans = mergeTwoSortedArray(nums1, nums2);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int index = 0;

        if (m >= 1) {
            for (int i = m - n; i < m; i++) {
                arr1[i] = arr2[index++];
            }
        } else {
            arr1[0] = arr2[0];
        }

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return arr1;
    }
}
