package org.just.leetcode.leetcode3146;

public class Solution {

    public int findPermutationDifference(String s, String t) {
        int result = 0;
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            result+= Math.abs(i - t.indexOf(sChars[i]));
        }
        return result;
    }
}