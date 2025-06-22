package com.ronak.searching;

public class DivideIntegerWithoutDividerOperator {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 5;

        int ans = divide(dividend, divisor);
        System.out.println("ans is : "+ ans);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean isPositive = (dividend < 0) == (divisor < 0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        if (absDividend < absDivisor) return 0;

        long start = 0, end = absDividend, result = 0;
        while (start <= end) {
            long mid = start + ((end - start) >> 1);
            if (mid * absDivisor <= absDividend) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        result = isPositive ? result : -result;
        return (int) Math.min(Math.max(result, Integer.MIN_VALUE), Integer.MAX_VALUE);
    }

}
