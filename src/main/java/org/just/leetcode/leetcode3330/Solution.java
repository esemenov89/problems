package org.just.leetcode.leetcode3330;

public class Solution {

    public int possibleStringCount(String word) {
        int result = 1;
        int start = 0;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                start = i - 1;
                while (i < word.length() && word.charAt(i) == word.charAt(i - 1)) {
                    i++;
                }
                result = result + (i - start - 1);
            }
        }
        return result;
    }
}