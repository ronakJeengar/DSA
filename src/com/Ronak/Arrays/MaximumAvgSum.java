package com.ronak.arrays;

public class MaximumAvgSum {

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAvgSumBruteForce(nums, k));
        System.out.println(findMaxAvgSumOptimized(nums, k));
    }

    public static double findMaxAvgSumBruteForce(int[] arr, int k) {

        double maxSum = Integer.MIN_VALUE;
        int totalSubArrays = (arr.length - k) + 1;

        for (int i = 0; i < totalSubArrays; i++) {
            int currentSum = 0;
            for (int j = i; j < k + i; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

//        int maxSum = Integer.MIN_VALUE;
//        int start = 0;
//        int end = k - 1;
//        while (end < arr.length) {
//            int sum = 0;
//            for (int j = start; j <= end; j++) {
//                sum += arr[j];
//            }
//            maxSum = Math.max(maxSum, sum);
//            start++; end++;
//        }

        return maxSum / k;
    }

    public static double findMaxAvgSumOptimized(int[] arr, int k) {

        int currentSum = 0;
        int start = 0;
        int end = k - 1;

        for (int i = start; i <= end; i++) {
            currentSum += arr[i];
        }
        int maxSum = currentSum;
        end++;
        while (end < arr.length) {
            currentSum -= arr[start++];
            currentSum += arr[end++];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }
}
