package com.ronak.searching;

public class FindSquareRoot {

    public static void main(String[] args) {
        int x = 2147395599;

        System.out.println(findSquareRoot(x));
    }

    public static int findSquareRoot(int number) {

        int s = 0;
        int e = number;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long square = (long) mid * mid;

            if (square == number) {
                return mid;
            } else if (square < number) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
