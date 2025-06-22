package com.ronak.arrays;

public class FindMinMax {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 9, 2};

        int[] ans = findMinMaxBruteForce(arr);

        for(int num : ans){
            System.out.print(num + " ");
        }

        System.out.println();

        int[] result = findMinMaxOptimize(arr, 0, arr.length - 1);

        for(int num : result){
            System.out.print(num + " ");
        }

    }

    //Using normal comparison
    static int[] findMinMaxBruteForce(int[] arr){
        int max = arr[0];
        int  min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        return new int[]{min, max};
    }

    //using divide and conquer approach
    static int[] findMinMaxOptimize(int[] arr, int low, int high) {
    if (low == high) return new int[]{arr[low], arr[low]};

    int mid = (low + high) / 2;

    int[] left = findMinMaxOptimize(arr, low, mid); 
    int[] right = findMinMaxOptimize(arr, mid + 1, high);

        return new int[]{
            Math.min(left[0], right[0]), 
            Math.max(left[1], right[1]) 
        };
    }
}
