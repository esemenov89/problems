package org.just.leetcode.leetcode242;

public class Solution {

    public boolean isAnagram(String s, String t) {
        boolean result;
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        int index;
        for (int i = 0; i < t.length(); i++) {
            index = sb.indexOf("" + t.charAt(i));
            if (index == -1) {
                return false;
            }
            sb.deleteCharAt(sb.indexOf("" + t.charAt(i)));
        }
        result = sb.isEmpty();
        return result;
    }
}