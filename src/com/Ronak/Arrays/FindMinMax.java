package com.ronak.arrays;


import java.lang.*;

public class FindMinMax {
 
    static void minArray(int[] arr, int n){
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            min = Integer.min(arr[i], min);
        }
        System.out.println(min);
    }
 
    static void maxArray(int[] arr, int n){
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            max = Integer.max(arr[i], max);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
      
        int[] arr = {4,5,7,8,9};
        int n = arr.length;

        minArray(arr, n);
        maxArray(arr, n);
    }
}
