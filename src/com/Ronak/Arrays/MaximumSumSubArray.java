package com.ronak.arrays;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int ans = maxSubArraySumBruteForce(arr);
        int ans1 = maxSubArraySumKadane(arr);

        System.out.println(ans);
        System.out.println(ans1);

    }

    public static int maxSubArraySumBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j]; // -4
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static int maxSubArraySumKadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

}
