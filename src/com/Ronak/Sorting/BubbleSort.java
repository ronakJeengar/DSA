package com.Ronak.Sorting;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr, int n){

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n - i; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5,3,9,6,4,1,8,2,7};
        int n = arr.length;

        int[] ans = bubbleSort(arr, n);
        printArray(arr);
    }
}
