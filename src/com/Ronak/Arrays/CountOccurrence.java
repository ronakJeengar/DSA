package com.ronak.arrays;

import java.util.HashMap;

public class CountOccurrence {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 2, 3, 2, 1, 3, 2};
        int target = 2;

        int count = countOccurrences(array, target);
        System.out.println("Element " + target + " occurs " + count + " times.");

        HashMap<Integer, Integer> occurrences = countAllNumberOccurrences(array);
        System.out.println("Occurrences: " + occurrences);

        int count1 = countSingleOccurrence(array, target);
        System.out.println("Element " + target + " occurs " + count1 + " times.");
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static HashMap<Integer, Integer> countAllNumberOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
    }

    public static int countSingleOccurrence(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.get(target);
    }
}
