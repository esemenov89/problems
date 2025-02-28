package org.just.leetcode.leetcode1684;

public class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        char[] chars;
        boolean containAll;
        for (String word : words) {
            chars = word.toCharArray();
            containAll = true;
            for (char c : chars) {
                if (allowed.indexOf(c) == -1) {
                    containAll = false;
                    break;
                }
            }
            if (containAll) {
                result++;
            }
        }
        return result;
    }
}