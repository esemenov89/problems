package org.just.leetcode.leetcode342;

public class Solution {

    public boolean isPowerOfFour(int n) {
        boolean result;
        result = n > 0 && 1162261467 % n == 0;
        return result;
    }
}