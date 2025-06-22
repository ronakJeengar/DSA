package com.ronak.arrays;

public class RotateArray {

    public static void rotateUsingBruteForce(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    public static void rotateUsingBruteForceTwo(int[] nums, int k) {
        int size = nums.length;
        k = k % size;

        if (k == 0) return;

        int[] temp = new int[k];
        int index = 0;

        for (int i = size - k; i < size; i++) {
            temp[index++] = nums[i];
        }

        for (int i = size - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        System.arraycopy(temp, 0, nums, 0, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotateUsingOptimized(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    static void printArray(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateUsingBruteForce(nums, 3);
        rotateUsingBruteForceTwo(nums, 3);
        rotateUsingOptimized(nums, 3);
        
        printArray(nums);
    }
}
