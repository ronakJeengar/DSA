package com.ronak.strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String comparison
        String s1 = "Ronak";
        String s2 = "Ravi";
        System.out.println(s1.compareTo(s2)); // Compare two strings lexicographically

        // Check if a word exists in a string
        String name = "Hello Jee How are you";
        String word = "Jee How";

        if (name.contains(word)) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }

        // Find index of a word in a string
        int ans = name.indexOf(word);
        System.out.println("Index of word: " + ans);

        // Get substring from index
        System.out.println("Substring from index 5: " + name.substring(5));

        // Get substring from index 5 with length 5
        System.out.println("Substring from index 5 with length 5: " + name.substring(5, 10));

        // String concatenation
        String fName = "Ronak";
        String lName = "Jeengar";
        String fullName = fName + " " + lName;
        System.out.println("Full Name: " + fullName);

        // Clearing string
        String strToClear = "Hello Ronak";
        strToClear = "";
        boolean check = strToClear.isEmpty() ? true : false;
        System.out.println("String is empty : " + check);

        // Iterating over a string using for-each loop
        String nameIter = "Ronak Jeengar";
        for (char ch : nameIter.toCharArray()) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (int i = 0, len = nameIter.length(); i < len; i++) {
            System.out.print(nameIter.charAt(i) + " ");
        }

        System.out.println();

        // Accessing string elements
        System.out.println("First character: " + nameIter.charAt(0));
        System.out.println("Last character: " + nameIter.charAt(nameIter.length() - 1));
        System.out.println("String length: " + nameIter.length());

        // Taking full-line input
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // String creation and push/pop operations
        StringBuilder str = new StringBuilder();
        str.append('r');
        str.append('o');
        str.append('n');
        str.append('a');
        str.append('k');
        System.out.println("Before pop: " + str);
        str.deleteCharAt(str.length() - 1); // Pop last character
        System.out.println("After pop: " + str);

        // Taking single word input
        System.out.println("Enter a word:");
        String singleWord = scanner.next();
        System.out.println("You entered: " + singleWord);
        System.out.println("First character: " + singleWord.charAt(0));

        scanner.close();
    }
}
