package com.ronak.extras;

public class CheckPalindromeNumber {

    public static void main(String[] args) {

        int number = 121;
        System.out.println(number + " is palindrome or not : " + checkNumberPalindrome(number));
    }

    static boolean checkNumberPalindrome(int number) {

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}
