package com.ronak.arrays;

import java.util.Arrays;

public class FindAllSubArrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, -3, 4, 5};
//        findAllSubArrays(arr);
        boolean ans = findSpecificSumSubArray(arr);
        System.out.println("ans is : " + ans);
//        findMaximumProductSubArray(arr);
    }

    static void findAllSubArrays(int[] arr) {
        int target = 9;
        for (int i = 0; i < arr.length; i++) { //start point
            for (int j = i; j < arr.length; j++) { // end point

                for (int k = i; k <= j; k++) { // start <= end

                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    static boolean findSpecificSumSubArray(int[] arr) {
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                System.out.print(arr[j] + " ");

                if (currentSum == target) {
                    System.out.println("\nSubarray with sum " + target + " found.");
                    System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
    static void findMaximumProductSubArray(int[] arr) {

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < arr.length; j++) {
                currentProduct *= arr[j];
                maxProduct = Math.max(currentProduct, maxProduct);
            }
        }
        System.out.println("Maximum Product Subarray is: " + maxProduct);
    }
}
