package org.just.leetcode.leetcode3;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        StringBuilder temp = new StringBuilder();
        char[] chars = s.toCharArray();
        int startIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                temp.append(chars[i]);
            } else {
                if (!temp.toString().contains(chars[i] + "")) {
                    temp.append(chars[i]);
                } else {
                    if (temp.length() > result) {
                        result = temp.length();
                    }
                    i = s.indexOf(chars[i], startIndex);
                    temp = new StringBuilder();
                    startIndex = i + 1;
                }
            }
        }
        return Math.max(result, temp.length());
    }
}