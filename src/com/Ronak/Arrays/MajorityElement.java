package com.ronak.arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int result = findMajorityBruteForce(nums);
        int result1 = findMajorityOptimized(nums);

        System.out.println("Majority Element: " + result);
        System.out.println("Majority Element: " + result1);
    }

    // find majority element using brute force
    public static int findMajorityBruteForce(int[] arr) {
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (i == k)
                    count++;
            }
            if (count > arr.length / 2)
                return k;
        }
        return -1;
    }

    // find majority element using brute force

    public static int findMajorityOptimized(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate)
                count++;
        }
        return count > arr.length / 2 ? candidate : -1;
    }

}
