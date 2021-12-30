package com.Ronak.Arrays;

public class SwapAlternate {

    static void swapAlternate(int[] arr, int n){
        //using efficient way
        for(int i = 0; i < n; i+=2){
            if((i+1) < n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    static void printArray(int[] arr){
        for (int e : arr) {
            System.out.print(e+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        printArray(arr);
        swapAlternate(arr,n);
        printArray(arr);

    }
}
