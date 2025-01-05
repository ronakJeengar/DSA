package com.ronak.arrays;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index (Brute Force): " + findPivotIndexBruteForce(nums));
        System.out.println("Pivot Index (Optimized): " + findPivotIndexOptimized(nums));
    }

    static int findPivotIndexBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    static int findPivotIndexOptimized(int[] nums) {
        int totalSum = 0, leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            // Check if leftSum equals rightSum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Return pivot index
            }
            leftSum += nums[i]; // Update leftSum
        }
        return -1; // No pivot index found
    }
}
