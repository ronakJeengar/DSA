package com.ronak.strings;

public class RemoveAdjDuplicates {

    public static void main(String[] args) {
        String str = "abbaca";
        String ans = removeAdjDuplicates(str);
        System.out.print("ans is : " + ans);
    }

    public static String removeAdjDuplicates(String str) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (s.isEmpty() || ch != s.charAt(s.length() - 1)) {
                s.append(ch);
            } else if (ch == s.charAt(s.length() - 1)) {
                s.deleteCharAt(s.length() - 1);
            }
        }

        return s.toString();
    }
}
