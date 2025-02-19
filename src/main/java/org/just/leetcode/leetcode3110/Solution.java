package org.just.leetcode.leetcode3110;

public class Solution {

    public int scoreOfString(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            result += Math.abs(chars[i] - chars[i + 1]);
        }
        return result;
    }
}