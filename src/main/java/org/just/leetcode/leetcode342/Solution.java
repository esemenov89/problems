package org.just.leetcode.leetcode342;

public class Solution {

    public boolean isPowerOfFour(int n) {
        boolean result;
        result = n > 0 && (n & (n - 1)) == 0 && (n & 0xAAAAAAAA) == 0;
        return result;
    }
}