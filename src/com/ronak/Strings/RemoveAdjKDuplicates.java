package com.ronak.strings;

public class RemoveAdjKDuplicates {

    public static void main(String[] args) {
        String str = "deeedbbcccbdaa";
//        String str = "deee";
        int k = 3;
        String strAns = "aa";
        String ans = removeAdjDuplicates(str, k);
        System.out.print("ans is : " + ans);
    }

    public static String removeAdjDuplicates(String str, int k) {
        StringBuilder s = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (s.isEmpty()) {
                s.append(ch);
                count++;
                System.out.println("count if empty is : " + count);
            } else if (ch == s.charAt(s.length() - 1)) {
                s.append(ch);
                count++;
                System.out.println("ans is "+ (count == k));
                if (count == k) {
                    for (int j = 0; j < k; j++) {
                        System.out.println("s is : " +s);
                        s.deleteCharAt(s.length() - 1);
                    }
                }
            } else if (ch != s.charAt(s.length() - 1)) {
                count = 0;
                s.append(ch);
                count++;
                System.out.println("count if not match is : " + count);
            }
        }

        return s.toString();
    }

}
