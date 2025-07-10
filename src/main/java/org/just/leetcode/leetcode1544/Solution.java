package org.just.leetcode.leetcode1544;

public class Solution {

    public String makeGood(String s) {
        String result;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1) + 32
                    || sb.charAt(i) == sb.charAt(i + 1) - 32) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = i - 2;
                if (i < -1) {
                    i = -1;
                }
            }
        }
        result = sb.toString();
        return result;
    }
}