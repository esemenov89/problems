package org.just.leetcode.leetcode1047;

public class Solution {

    public String removeDuplicates(String s) {
        String result;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i = Math.max(i - 2, -1);
            }
        }
        result = sb.toString();
        return result;
    }
}