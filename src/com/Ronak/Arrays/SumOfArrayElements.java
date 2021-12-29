package com.Ronak.Arrays;

public class SumOfArrayElements {

    static int sumOfElements(int[] arr, int n){

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5};
        int size = nums.length;

        int result = sumOfElements(nums, size);
        System.out.println("Sum of all elements in this array : - " +result);

    }
}
