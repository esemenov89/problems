package org.just.leetcode.leetcode2894;

public class Solution {

    public int differenceOfSums(int n, int m) {
        int result = 0;
        int notDivisible = 0;
        int divisible = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divisible += i;
            } else {
                notDivisible += i;
            }
        }
        result = notDivisible - divisible;
        return result;
    }
}