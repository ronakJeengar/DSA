package com.ronak.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        System.out.println("Brute Force Approach:");
        int[] bruteForceResult = intersectionBruteForce(arr1, arr2);
        for (int num : bruteForceResult) {
            if (num != -1) { // Skip unused slots
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Optimized Approach:");
        int[] optimizedResult = intersectionOptimized(arr1, arr2);
        for (int num : optimizedResult) {
            System.out.print(num + " ");
        }
    }

    // Brute-force approach
    static int[] intersectionBruteForce(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        // Initialize temp array with -1 to mark unused slots
        Arrays.fill(temp, -1);

        // Compare each element of arr1 with arr2
        for (int value : arr1) {
            for (int i : arr2) {
                if (value == i) {
                    // Check if the element is already added
                    boolean alreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if (temp[k] == value) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        temp[index++] = value;
                    }
                }
            }
        }

        return temp; // May contain -1 in unused slots
    }

    // Optimized approach using HashSet
    static int[] intersectionOptimized(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add elements of arr1 to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check for common elements in arr2
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the result to an array
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }
}
