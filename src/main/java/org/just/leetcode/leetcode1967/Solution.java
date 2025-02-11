package org.just.leetcode.leetcode1967;

public class Solution {

    public int numOfStrings(String[] patterns, String word) {
        int result = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                result++;
            }
        }
        return result;
    }
}