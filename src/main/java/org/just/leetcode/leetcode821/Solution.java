package org.just.leetcode.leetcode821;

public class Solution {

    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int before = s.indexOf(c);
        int resultIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Math.abs(s.indexOf(c, i) - i) < Math.abs(before - i)) {
                before = s.indexOf(c, i);
            }
            result[resultIndex++] = Math.abs(before - i);
        }
        return result;
    }
}