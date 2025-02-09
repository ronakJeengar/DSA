package com.ronak.strings;

import java.util.*;

public class CustomSortString {

    public static void main(String[] args) {
        // Example Test Case
        String order = "cba";
        String s = "abcd";

        System.out.println(customSortString(order, s)); // Output: "cbad"
    }


    public static String customSortString(String order, String s) {
        Map<Character, Integer> priority = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            priority.put(order.charAt(i), i);
        }

        Character[] charArray = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = s.charAt(i);
        }

        Arrays.sort(charArray,
                Comparator.comparingInt(
                        a -> priority.getOrDefault(a, 26)
                )
        );

        StringBuilder sortedString = new StringBuilder();
        for (char c : charArray) {
            sortedString.append(c);
        }

        return sortedString.toString();
    }
}
