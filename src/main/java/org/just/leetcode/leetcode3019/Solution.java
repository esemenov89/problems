package org.just.leetcode.leetcode3019;

public class Solution {

    public int countKeyChanges(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (!s.substring(i, i + 1).equalsIgnoreCase(s.substring(i - 1, i))) {
                result++;
            }
        }
        return result;
    }
}