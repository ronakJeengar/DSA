package com.ronak.arrays;

public class FindSecondLargest {

    public static void main(String[] args) {

        int[] arr = { 15, 15, 15, 15 };

        int ans = findSecondLargest(arr);

        System.out.print("second largest is " + ans);
    }

    static int findSecondLargest(int[] arr) {

        int n = arr.length;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if (n < 2)
            return -1;

        for (int j : arr) {

            if (j > first) {
                second = first;
                first = j;
            }

        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }

}
