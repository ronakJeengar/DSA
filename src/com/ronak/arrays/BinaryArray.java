package com.ronak.arrays;

import java.util.Arrays;

public class BinaryArray {

    public static void main(String[] args) {
        int[] binaryArray = {0, 1, 1, 0, 1, 0, 0, 0};

        System.out.println("Original array: " + Arrays.toString(binaryArray));

        int[] result = findTwosComplementOfBinaryArray(binaryArray);

        System.out.println("2's Complement array: " + Arrays.toString(result));
    }

    static int[] findTwosComplementOfBinaryArray(int[] arr) {
        int[] nums = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            nums[i + 1] = (arr[i] == 0) ? 1 : 0;
        }

        System.out.print("1's complement array: " + Arrays.toString(nums));
        System.out.println();

        int carry = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int sum = nums[i] + carry;
            nums[i] = sum % 2;
            carry = sum / 2;
        }

        if (carry == 1) {
            nums[0] = 1;
        }
        return nums;
    }
}
