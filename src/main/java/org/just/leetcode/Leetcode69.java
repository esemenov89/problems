package org.just.leetcode;

public class Leetcode69 {

    public static void main(String[] args) {
        Leetcode69 solution = new Leetcode69();
        int x = 4;
        int x1 = 8;
        int x2 = (int) Math.pow(2, 31) - 1;
        int x3 = 1;
        int x4 = 2;
        int x5 = 0;
        int x6 = 5;

        System.out.println(solution.mySqrt(x));
        System.out.println(solution.mySqrt(x1));
        System.out.println(solution.mySqrt(x2));
        System.out.println(solution.mySqrt(x3));
        System.out.println(solution.mySqrt(x4));
        System.out.println(solution.mySqrt(x5));
        System.out.println(solution.mySqrt(x6));
    }

    public int mySqrt(int x) {
        if (x == 1 || x == 2 || x == 3) {
            return 1;
        }
        long result = 0;
        for (long i = 0; i <= x / 2 + 1; i++) {
            if (i * i == x) {
                result = i;
                break;
            }
            if (i * i > x) {
                result = i - 1;
                break;
            }
            if (i != 0 && i * i * i * i < x) {
                i = i * i;
            }
        }
        return (int) result;
    }
}
