package com.ronak.arrays;

public class SortColors {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 2, 2, 0, 1, 0, 1 };
        int[] arr1 = { 0, 0, 1, 2, 2, 1, 0, 1, 0 };

        sortColorsBruteForce(arr);
        printArray(arr);
        sortColorsBruteForce(arr1);
        printArray(arr1);
    }

    // print array method
    static void printArray(int[] nums) {

        for (int num : nums) {
            System.err.print(num + " ");
        }
    }

    // sort the colors using brute force
    static void sortColorsBruteForce(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int num : nums) {
            switch (num) {
                case 0 -> zeroCount++;
                case 1 -> oneCount++;
                default -> twoCount++;
            }
        }

        int index = 0;
        for (int i = 0; i < zeroCount; i++)
            nums[index++] = 0;
        for (int i = 0; i < oneCount; i++)
            nums[index++] = 1;
        for (int i = 0; i < twoCount; i++)
            nums[index++] = 2;
    }

    // sort the colors using dutch-national flag algorithm
    public static void sortColorsOptimized(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 ->                     {
                        int temp = nums[low];
                        nums[low++] = nums[mid];
                        nums[mid++] = temp;
                    }
                case 1 -> mid++;
                default ->                     {
                        int temp = nums[mid];
                        nums[mid] = nums[high];
                        nums[high--] = temp;
                    }
            }
        }
    }
}
