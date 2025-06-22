package com.ronak.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println(findAndReplacePattern(words, pattern));
    }

    private static void normalize(StringBuilder str) {
        char start = 'a';
        Map<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!mapping.containsKey(ch)) {
                mapping.put(ch, start);
                start++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            str.setCharAt(i, mapping.get(str.charAt(i)));
        }
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        StringBuilder patternBuilder = new StringBuilder(pattern);
        normalize(patternBuilder);
        String normalizedPattern = patternBuilder.toString();

        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder(word);
            normalize(wordBuilder);
            if (wordBuilder.toString().equals(normalizedPattern)) {
                ans.add(word);
            }
        }

        return ans;
    }
}
