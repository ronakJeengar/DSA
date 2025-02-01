package com.ronak.strings;

public class PalindromicSubstring {

    public static void main(String[] args) {
        String str = "madam";

        System.out.println("ans is  " + countSubstrings(str));
    }

    static int expandAroundCenter(String s, int i, int j) {
        int count = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }

    static int countSubstrings(String s) {
        int totalCount = 0;
        for (int center = 0; center < s.length(); center++) {
            //odd
            int i = center;
            int j = center;
            int oddPalSubStringKaCount = expandAroundCenter(s, i, j);
            //even
            i = center;
            j = center + 1;
            int evenPalSubStringKaCount = expandAroundCenter(s, i, j);
            totalCount = totalCount + oddPalSubStringKaCount + evenPalSubStringKaCount;
        }
        return totalCount;
    }
}
