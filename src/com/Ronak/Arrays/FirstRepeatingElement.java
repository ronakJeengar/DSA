package com.ronak.arrays;

import java.util.HashSet;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 40, 50, 30};

        int firstElementIs = firstRepeatingElementBruteForce(arr);
        int firstElement = firstRepeatingElementOptimized(arr);
        System.out.println(firstElementIs);
        System.out.println(firstElement);
    }

    static int firstRepeatingElementBruteForce(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    static int firstRepeatingElementOptimized(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int value : arr) {
            if (seen.contains(value)) {
                return value; // First repeating element found
            }
            seen.add(value);
        }
        return -1; // No repeating element found
    }

}
