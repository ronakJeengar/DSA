package com.Ronak.Arrays;

public class UniqueElement {

    static int findUnique(int[] arr, int n){
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = ans ^ arr[i];
        }
        return  ans;
    }

    public static void main(String[] args){

        int[] nums = {1,1,2,4,4};
        int size = nums.length;

        int uniqueIs = findUnique(nums, size);
        System.out.println(uniqueIs);
    }

}
