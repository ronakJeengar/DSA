package com.ronak.searching;

import java.util.Arrays;

public class KokoEatingBananas {

    public static boolean canKokoFinishBananasWithKSpeed(int[] piles, int h, int k) {
        long totalHoursTaken = 0;
        for (int pile : piles) {
            totalHoursTaken += (long) Math.ceil(pile / (double) k);
        }
        return totalHoursTaken <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (canKokoFinishBananasWithKSpeed(piles, h, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println("Minimum eating speed: " + minEatingSpeed(piles, h));
    }
}
