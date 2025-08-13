package org.just.leetcode.leetcode326;

public class Solution {

    public boolean isPowerOfThree(int n) {
        boolean result;
        result = n > 0 && (n & (n - 1)) == 0;
        return result;
    }
}