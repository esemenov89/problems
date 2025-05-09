package org.just.leetcode.leetcode1221;

public class Solution {

    public int balancedStringSplit(String s) {
        int result = 0;
        int r = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                l++;
            } else if (s.charAt(i) == 'R') {
                r++;
            }
            if (l == r) {
                result++;
                r = 0;
                l = 0;
            }
        }
        return result;
    }
}