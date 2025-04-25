package org.just.leetcode.leetcode1876;

public class Solution {

    public int countGoodSubstrings(String s) {
        int result = 0;
        String temp;
        for (int i = 0; i < s.length() - 2; i++) {
            temp = s.substring(i, i + 3);
            if (temp.charAt(0) != temp.charAt(1) && temp.charAt(0) != temp.charAt(2) && temp.charAt(1) != temp.charAt(2)) {
                result++;
            }
        }
        return result;
    }
}