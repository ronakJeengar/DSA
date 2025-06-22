package com.ronak.strings;

import java.util.HashMap;

public class DecodeTheMessage {

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        System.out.println("🔹 Key: " + key);
        System.out.println("🔹 Message: " + message);

        String decodedMessage = decodeMessage(key, message);
        System.out.println("✅ Decoded Message: " + decodedMessage);
    }

    // Method to create the mapping from key to 'a'..'z'
    private static void createMapping(HashMap<Character, Character> mapping, String key) {
        char start = 'a';

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);

            // Debugging: Show current character being mapped
            System.out.println("Processing character: " + ch);

            if (!mapping.containsKey(ch) && ch != ' ') {
                mapping.put(ch, start);
                System.out.println("🔹 Mapping: " + ch + " -> " + start);
                start++;
            }
        }
    }

    // Method to use the mapping and decode the message
    public static String useMapping(HashMap<Character, Character> mapping, String message) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char originalChar = message.charAt(i);
            char mappedCharacter = mapping.getOrDefault(originalChar, ' ');

            // Debugging: Show each character being replaced
            System.out.println("🔄 Replacing '" + originalChar + "' with '" + mappedCharacter + "'");

            ans.append(mappedCharacter);
        }
        return ans.toString();
    }

    // Main method to decode the message
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(' ', ' '); // Space remains unchanged

        System.out.println("🔹 Creating character mapping...");
        createMapping(mapping, key);

        System.out.println("🔹 Decoding message...");
        return useMapping(mapping, message);
    }
}
