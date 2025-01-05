package com.ronak.searching;

public class FindFirstOccurrenceInSortedArray {

    public static void main(String[] args) {
        int[] nums = {10,20,20,30,40,50,60};
        System.out.println("ans is : " + findFirstOccurrence(nums, 20));
    }

    static  int findFirstOccurrence(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid +1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else if(target == nums[mid]){
                ans = mid;
                end = mid - 1;
            }
        }
        return  ans;
    }

}
