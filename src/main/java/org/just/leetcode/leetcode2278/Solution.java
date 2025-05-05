package org.just.leetcode.leetcode2278;

public class Solution {

    public int percentageLetter(String s, char letter) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                result++;
            }
        }
        result = (int) ((double) result / (double) s.length() * 100);
        return result;
    }
}