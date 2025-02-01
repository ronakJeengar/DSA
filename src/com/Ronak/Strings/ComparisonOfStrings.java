package com.ronak.strings;

import java.util.Arrays;

public class ComparisonOfStrings {

    public static void main(String[] args) {
        // 1️⃣ String (Immutable)
        String s1 = "Ronak";   // Stored in String Pool
        String s2 = "Ronak";   // Points to the same pool object
        String s3 = new String(s1);  // New object in Heap memory

        System.out.println("🔹 String Comparison Reference Obj & Value :");
        System.out.println("s1 == s2: " + (s1 == s2));  // true (same reference)
        System.out.println("s1 == s3: " + (s1 == s3));  // false (different objects)

        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));  // true (same value)
        System.out.println("s1.equals(s3) : " + (s1.equals(s3)));  // true (same value)

        System.out.println("------------------------------");

        // Modifying String (Creates a new object)
        s1 = s1 + " Jeengar";
        System.out.println("Modified String: " + s1);  // New object created

        System.out.println("------------------------------");

        // 2️⃣ StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Ronak");
        System.out.println("🔹 StringBuilder Before Modification: " + sb);

        // Save reference before modification
        StringBuilder sbBefore = sb;

        sb.append(" Jeengar"); // Modifies the same object

        // Compare if the object reference is the same
        System.out.println("Is the StringBuilder the same object? " + (sb == sbBefore)); // true
        System.out.println("StringBuilder After Modification: " + sb);

        System.out.println("------------------------------");

        // 3️⃣ StringBuffer (Mutable & Thread-Safe)
        StringBuffer sbf = new StringBuffer("Ronak");
        System.out.println("🔹 StringBuffer Before Modification: " + sbf);
        StringBuffer sbfBefore = sbf;

        sbf.append(" Jeengar"); // Modifies the same object
        System.out.println("Is the StringBuffer the same object? " + (sbf == sbfBefore)); // true
        System.out.println("StringBuffer After Modification: " + sbf);
        System.out.println("------------------------------");

        // 4️⃣ char[] (Mutable & Best for Sensitive Data)
        char[] password = {'p', 'a', 's', 's', '1', '2', '3'};
        System.out.println("🔹 Password Before Erase: " + Arrays.toString(password));

        // Clearing sensitive data
        Arrays.fill(password, '*'); // Overwrites sensitive data in memory
        System.out.println("Password After Erase: " + Arrays.toString(password));

        System.out.println("------------------------------");

        // 5️⃣ Checking Performance (Comparing String vs StringBuilder)
        long start, end;

        // String Concatenation Test
        start = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";  // Creates new objects in memory (inefficient)
        }
        end = System.nanoTime();
        System.out.println("🔹 String Concatenation Time: " + (end - start) + " ns");

        // StringBuilder Append Test
        start = System.nanoTime();
        StringBuilder sbTest = new StringBuilder();
        sbTest.append("a".repeat(10000));  // Efficient in-place modification
        end = System.nanoTime();
        System.out.println("🔹 StringBuilder Append Time: " + (end - start) + " ns");
    }

}
