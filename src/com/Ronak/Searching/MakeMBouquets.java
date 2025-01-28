package com.ronak.searching;

import java.util.Arrays;

public class MakeMBouquets {

    public static void main(String[] args) {

        int[] arr = {1, 10, 3, 10, 2};
        int m = 3, k = 2;
        int ans = minDays(arr, m, k);

        System.out.println("ans is : " + ans);

    }

    public static boolean canWeMakeMBouquetsWithDDays(int[] bloomDay, int m, int k, int D) {
        int counter = 0;
        for (int j : bloomDay) {
            if (j <= D) {
                counter++;
            }
            if (counter == k) {
                m--;
                counter = 0;
                if (m == 0) {
                    return true;
                }
            }

            if (j > D) {
                counter = 0;
            }
        }
        return m == 0;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        long requirement = (long) m * k;
        if (bloomDay.length < requirement) {
            return -1;
        }

        int start = Arrays.stream(bloomDay).min().getAsInt();
        int end = Arrays.stream(bloomDay).max().getAsInt();
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canWeMakeMBouquetsWithDDays(bloomDay, m, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
