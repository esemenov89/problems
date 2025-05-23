package org.just.leetcode.leetcode2315;

public class Solution {

    public int countAsterisks(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        boolean ignore = false;
        for (char c : chars) {
            if (c == '|' && !ignore) {
                ignore = true;
                continue;
            }
            if (c == '|' && ignore) {
                ignore = false;
                continue;
            }
            if (c == '*' && !ignore) {
                result++;
            }
        }
        return result;
    }
}