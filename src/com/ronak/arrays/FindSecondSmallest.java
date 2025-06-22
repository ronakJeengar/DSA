package com.ronak.arrays;

public class FindSecondSmallest {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int ans = findSecondSmallestBruteForce(arr);
        System.out.println(ans);
    }

    static int findSecondSmallestBruteForce(int[] arr) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int j : arr) {

            if (j < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = j;
            } else if(j > firstSmallest && j < secondSmallest) {
                secondSmallest = j;
            }
        }
        return secondSmallest;
    }
}
