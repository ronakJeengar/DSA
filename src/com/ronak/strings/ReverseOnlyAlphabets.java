package com.ronak.strings;

public class ReverseOnlyAlphabets {

     public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            char chLow = chars[low];
            char chHigh = chars[high];

            // Skip non-alphabet characters from low side
            if (!isAlphabet(chLow)) {
                low++;
            }
            // Skip non-alphabet characters from high side
            else if (!isAlphabet(chHigh)) {
                high--;
            }
            // Both are letters → swap
            else {
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                low++;
                high--;
            }
        }

        return new String(chars);
    }

    private static boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }


    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a@b1"));    // Output: b@a1
        System.out.println(reverseOnlyLetters("Ab,c,de!")); // Output: ed,c,bA!
    }
}
