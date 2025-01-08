package com.ronak.arrays;

import java.util.HashSet;

public class UnionTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] union = findUnion(arr1, arr2);
        int[] union2 = findUnionOptimized(arr1, arr2);
        printArray(union);
        System.out.println();
        printArray(union2);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            if (isPresent(temp, index, num)) {
                temp[index++] = num;
            }
        }

        for (int num : arr2) {
            if (isPresent(temp, index, num)) {
                temp[index++] = num;
            }
        }

        // Create a final array with the exact size
        int[] union = new int[index];
        System.arraycopy(temp, 0, union, 0, index);

        return union;
    }

    private static boolean isPresent(int[] arr, int size, int num) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return false;
            }
        }
        return true;
    }

    public static int[] findUnionOptimized(int[] arr1, int[] arr2) {
        // Use HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the first array
        for (int num : arr1) {
            set.add(num);
        }

        // Add elements from the second array
        for (int num : arr2) {
            set.add(num);
        }

        // Convert HashSet to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }


}
