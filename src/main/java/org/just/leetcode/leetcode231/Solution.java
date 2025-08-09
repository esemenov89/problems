package org.just.leetcode.leetcode231;

public class Solution {

    public boolean isPowerOfTwo(int n) {
        boolean result = false;
        return n > 0 && (n & (n - 1)) == 0;
    }
}