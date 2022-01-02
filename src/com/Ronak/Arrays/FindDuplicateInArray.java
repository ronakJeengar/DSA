package com.Ronak.Arrays;

import java.util.*;

public class FindDuplicateInArray {

    static int findDuplicate(int[] arr, int size){

//        if(arr.length == 0) return -1;
//        for(int i = 0; i < size; i++){
//            for(int j = i+1; j < size; j++){
//                if(arr[i] == arr[j]) return arr[i];
//            }
//        }
        //Using Arrays.sort method for O(nlogn) complexity
//        Arrays.sort(arr);
//        for(int i =0 ; i < size; i++){
//            if(arr[i] == arr[i+1]) return arr[i];
//        }
//        return -1;

        //Using XOR operator for O(n) complexity

        int ans = 0;

        for(int i = 0; i < size; i++){
            ans ^= arr[i];
        }
        for(int i = 1; i < size; i++){
            ans ^= i;
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {1,2,2,3,4};
        int size = arr.length;

        int ans = findDuplicate(arr, size);
        System.out.println(ans);
    }
}
