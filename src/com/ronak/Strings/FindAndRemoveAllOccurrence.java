package com.ronak.strings;

public class FindAndRemoveAllOccurrence {

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String word = "abc";
        String ans = findAndRemoveAllOccurrence(str, word);
        String ans1 = findAndRemoveAllOccurrenceOptimized(str, word);

        System.out.println(ans);
        System.out.println(ans1);

    }

    static String findAndRemoveAllOccurrence(String str, String word) {

        while (str.contains(word)) {
            str = str.replaceFirst(word, "");
        }
        return str;
    }

    static String findAndRemoveAllOccurrenceOptimized(String str, String word) {

        StringBuilder sb = new StringBuilder(str);

        while (sb.indexOf(word) != -1) {
            int index = sb.indexOf(word);
            sb.delete(index, index + word.length());
        }

        return sb.toString();
    }
}
