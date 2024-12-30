package com.ronak.arrays;

public class FindArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5};
        boolean ans = findArraySortedBruteForce(arr);
        System.out.println(ans);
    }

    static boolean findArraySortedBruteForce(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
           if(arr[i] > arr[i + 1]){
               return false;
           }
        }
        return true;
    }
}
