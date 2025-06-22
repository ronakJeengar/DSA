package com.ronak.searching;

public class SingleElementInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("ans is : " + singleNonDuplicate(arr));

    }

    public static int singleNonDuplicate(int[] nums) {
        int s = 0;
        int n = nums.length;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s == e) return nums[s];

            int currentValue = nums[mid];
            int leftValue = -1;
            if (mid - 1 >= 0) leftValue = nums[mid - 1];

            int rightValue = -1;
            if (mid + 1 < n) rightValue = nums[mid + 1];

            if (currentValue != leftValue && currentValue != rightValue) return currentValue;

            if (currentValue == leftValue && currentValue != rightValue) {
                int startingIndex = mid - 1;
                if ((startingIndex & 1) == 1) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }

            if (currentValue != leftValue) {
                if ((mid & 1) == 1) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
