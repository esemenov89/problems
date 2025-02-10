package org.just.leetcode.leetcode1961;

public class Solution {

    public boolean isPrefixString(String s, String[] words) {
        boolean result = false;
        StringBuilder temp = new StringBuilder();
        for (String word : words) {
            temp.append(word);
            if (s.contentEquals(temp)) {
                result = true;
                break;
            }
            if (temp.length() >= s.length()) {
                break;
            }
        }
        return result;
    }
}