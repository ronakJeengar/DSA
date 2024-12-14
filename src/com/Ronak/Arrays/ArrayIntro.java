package com.ronak.arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        // Array Declaration Type

        // Give size then give value to index
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        printArray(arr); // print {1,2,3,4,5}

        // Give direct values

        int[] arr1 = { 1, 2, 3, 4, 5 };

        printArray(arr1); // print {1,2,3,4,5}

    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
