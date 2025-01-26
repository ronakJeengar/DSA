package com.ronak.searching;

public class FindSquareRoot {

    public static void main(String[] args) {
        int x = 50;
        double result = findSquareRoot(x, 2);
        System.out.println("Square root of : " + x + " is " + result);
        System.out.printf("Square root of %d with precision is: %.2f%n", x, findSquareRootWithPrecisionUsingBS(x));
    }

    public static int findSquareRootIntegerPart(int number) {
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

    public static double findSquareRoot(int number, int precision) {
        double result = findSquareRootIntegerPart(number);
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (result * result <= number) {
                result += increment;
            }
            result -= increment;
            increment /= 10;
        }
        result = Math.round(result * Math.pow(10, precision)) / Math.pow(10, precision);
        return result;
    }

    public static double findSquareRootWithPrecisionUsingBS(int number) {
        double start = 0;
        double end = number;
        double ans = 0;
        while ((end - start) > 0.000000001) {
            double mid = (start + end) / 2;
            double sqr = mid * mid;
            if (sqr <= number) {
                ans = mid;
                start = mid + 0.000000000000000000000000001;
            } else
                end = mid - 0.000000000000000000000000001;
        }
        return ans;
    }
}
