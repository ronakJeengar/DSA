package com.ronak.searching;

public class FindQuotient {

    public static void main(String[] args) {
        int divisor = -2;
        int dividend = 10;

        int ans = findQuotientWithoutDivide(Math.abs(divisor), Math.abs(dividend));

        if ((divisor > 0 && dividend < 0) || (divisor < 0 && dividend > 0)) {
            ans = 0 - ans;
        }

        System.out.println(ans);
    }

    static int findQuotientWithoutDivide(int divisor, int dividend) {
        int s = 0;
        int e = dividend;
        int ans = -1;

        while (s <= e) {
            int mid = s + ((e - s) >> 1);
            if ((divisor * mid) == dividend) {
                return mid;
            } else if ((divisor * mid) < dividend) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
