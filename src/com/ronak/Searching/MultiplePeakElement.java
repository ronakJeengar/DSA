package com.ronak.searching;

public class MultiplePeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int ans = findPeakElement(arr);

        System.out.println("ans is : " + ans);
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;

        if (nums[0] > nums[1]) return 0;

        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int start = 1, end = n - 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;

            else if (nums[mid] > nums[mid - 1]) start = mid + 1;

            else end = mid - 1;

        }

        return -1;
    }
}
