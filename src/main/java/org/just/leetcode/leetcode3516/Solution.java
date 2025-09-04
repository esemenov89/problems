package org.just.leetcode.leetcode3516;

public class Solution {

    public int findClosest(int x, int y, int z) {
        int result = 0;
        if (Math.abs(x - z) < Math.abs(y - z)) {
            result = 1;
        }
        if (Math.abs(x - z) > Math.abs(y - z)) {
            result = 2;
        }
        return result;
    }
}