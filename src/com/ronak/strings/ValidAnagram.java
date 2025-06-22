package com.ronak.strings;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase(); // Step 1
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) return false; // Step 2

        int[] freq = new int[26]; // Step 3

        for (int i = 0; i < str1.length(); i++) { // Step 4
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int count : freq) { // Step 5
            if (count != 0) return false;
        }

        return true; // Step 6
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("anagram", "nagaram")); // true
        System.out.println(areAnagrams("rat", "car"));         // false
    }

}
