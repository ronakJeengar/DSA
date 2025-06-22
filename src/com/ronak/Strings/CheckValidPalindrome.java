package com.ronak.strings;

public class CheckValidPalindrome {

    public static void main(String[] args) {
        String str = "abca";
        System.out.println(validPalindrome(str));

    }

    public static boolean validPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                boolean ansOne = checkPalindrome(s, i + 1, j);
                if (ansOne)
                    return true;
                boolean ansTwo = checkPalindrome(s, i, j - 1);
                return ansOne || ansTwo;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String str, int s, int e) {
        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            } else {
                s++;
                e--;
            }
        }
        return true;
    }
}
