package com.ronak.strings;
import java.util.Scanner;

public class CharArrayOperations {

    // Get the length of a char array manually
    public static int getLength(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (c == '\0') {
                break;
            }
            count++;
        }
        return count;
    }

    // Replace character manually
    public static void replaceCharacter(char[] arr, char originalChar, char newChar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == originalChar) {
                arr[i] = newChar;
            }
        }
    }

    // Convert to uppercase manually
    public static void convertIntoUpperCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 'a' + 'A');
            }
        }
    }

    // Convert to lowercase manually
    public static void convertIntoLowerCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }
    }

    // Reverse character array manually
    public static void reverseCharArray(char[] arr) {
        int left = 0, right = getLength(arr) - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    // Check if the character array is a palindrome manually
    public static boolean checkPalindrome(char[] arr) {
        int left = 0, right = getLength(arr) - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter first input:");
        String input1 = scanner.nextLine();
        char[] arr1 = input1.toCharArray();

        System.out.println("Enter second input:");
        String input2 = scanner.nextLine();
        char[] arr2 = input2.toCharArray();

        // ✅ Using built-in methods to check palindrome
        System.out.println("Is Palindrome? (Manual): " + checkPalindrome(arr1));
        System.out.println("Is Palindrome? (Manual): " + checkPalindrome(arr2));
        System.out.println("Is Palindrome? (Built-in): " + input1.equalsIgnoreCase(new StringBuilder(input1).reverse().toString()));
        System.out.println("Is Palindrome? (Built-in): " + input2.equalsIgnoreCase(new StringBuilder(input2).reverse().toString()));

        // ✅ Convert to uppercase using both manual and built-in methods
        convertIntoUpperCase(arr1);
        convertIntoUpperCase(arr2);
        System.out.println("Uppercase (Manual): " + new String(arr1));
        System.out.println("Uppercase (Manual): " + new String(arr2));
        System.out.println("Uppercase (Built-in): " + input1.toUpperCase());
        System.out.println("Uppercase (Built-in): " + input2.toUpperCase());

        // ✅ Convert to lowercase using both manual and built-in methods
        convertIntoLowerCase(arr1);
        convertIntoLowerCase(arr2);
        System.out.println("Lowercase (Manual): " + new String(arr1));
        System.out.println("Lowercase (Manual): " + new String(arr2));
        System.out.println("Lowercase (Built-in): " + input1.toLowerCase());
        System.out.println("Lowercase (Built-in): " + input2.toLowerCase());

        // ✅ Reverse character array manually
        reverseCharArray(arr1);
        reverseCharArray(arr2);
        System.out.println("Reversed (Manual): " + new String(arr1));
        System.out.println("Reversed (Manual): " + new String(arr2));

        // ✅ Reverse using built-in method
        System.out.println("Reversed (Built-in): " + new StringBuilder(input1).reverse().toString());
        System.out.println("Reversed (Built-in): " + new StringBuilder(input2).reverse().toString());

        // ✅ Replace character manually
        replaceCharacter(arr1, '@', ' ');
        replaceCharacter(arr2, '@', ' ');
        System.out.println("After replacing '@' with space (Manual): " + new String(arr1));
        System.out.println("After replacing '@' with space (Manual): " + new String(arr2));

        // ✅ Replace using built-in method
        System.out.println("After replacing '@' with space (Built-in): " + input1.replace('@', ' '));
        System.out.println("After replacing '@' with space (Built-in): " + input2.replace('@', ' '));

        scanner.close();
    }
}
