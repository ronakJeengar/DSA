package com.ronak.searching;

public class FindSquareRoot {

    public static void main(String[] args) {
        int x = 50;
        double result = findSquareRoot(x, 2);
        // Format the result to 2 decimal places
//        System.out.printf("Square root of %d with precision is: %.2f%n", x, result);
        System.out.println("Square root of : " + x + " is " + result);
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
        System.out.println("first result is : " +result);
        double increment = 0.1;
        System.out.println("first increment is : " +increment);
        for (int i = 0; i < precision; i++) {
            System.out.println("current result in iteration ( "+ (i + 1)+ " ) : " +result);
            while (result * result <= number) {
                result += increment;
                System.out.println("loop result is ( "+ (i + 1)+ " ) : " +result);
            }
            result -= increment;
            System.out.println("second result is : " +result);
            increment /= 10;
            System.out.println("second increment is : " +increment);
        }
        result = Math.round(result * Math.pow(10, precision)) / Math.pow(10, precision);
        return result;
    }
}
