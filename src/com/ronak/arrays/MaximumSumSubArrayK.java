package com.ronak.arrays;

public class MaximumSumSubArrayK {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int ans = findMaximumSumSubArrayK(arr, k);
        int ans1 = findMaximumSumSubArrayKUsingSlidingWindow(arr, k);

        System.out.println("ans is : " + ans);
        System.out.println("ans1 is : " + ans1);

    }

    // brute-force approach
    static int findMaximumSumSubArrayK(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE;
        int end = arr.length - k;

        for (int i = 0; i <= end; i++) {
            int currentSum = 0;
            int secondEnd = k + i;
            for (int j = i; j < secondEnd; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Using Sliding window technique
    static int findMaximumSumSubArrayKUsingSlidingWindow(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {

            currentSum += arr[end];

            if (end >= k - 1) {
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= arr[end - (k - 1)];
            }
        }

        return maxSum;
    }
}
