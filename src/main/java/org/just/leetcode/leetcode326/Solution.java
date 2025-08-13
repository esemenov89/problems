package org.just.leetcode.leetcode326;

public class Solution {

    public boolean isPowerOfThree(int n) {
        boolean result;
        result = n > 0 && 1162261467 % n == 0;
        return result;
    }
}