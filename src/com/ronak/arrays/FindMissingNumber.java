package com.ronak.arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = { 3, 0, 1 };

        int ans = findMissingNumberUsingBruteForce(arr);
        int ans1 = findMissingNumberUsingOptimized(arr);

        System.err.println(ans);
        System.err.println(ans1);

    }

    //missing number using two for loops
    static int findMissingNumberUsingBruteForce(int[] arr) {

        int totalSum = 0;
        int originalSum = 0;

        for (int i = 1; i <= arr.length; i++) {
            originalSum += i;
        }

        for(int num : arr){
            totalSum += num;
        }

        return originalSum - totalSum;
    }

    //missing number using math formula
    static int findMissingNumberUsingOptimized(int[] arr) {

        int totalSum = 0;
        int n = arr.length;
        int originalSum = n * (n + 1)/2;

        for(int num : arr){
            totalSum += num;
        }

        return originalSum - totalSum;
    }
}