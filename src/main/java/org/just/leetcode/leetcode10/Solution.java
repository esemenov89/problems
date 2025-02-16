package org.just.leetcode.leetcode10;

public class Solution {

    public boolean isMatch(String s, String p) {
        boolean result = true;
        if (s.length() != p.length() && !p.contains("*")) {
            return false;
        }
        char[] charsS = s.toCharArray();
        char[] charsP = p.toCharArray();
        int j = 0;
        int startInterval = 0;
        int endInterval = 0;
        for (int i = 0; i < charsS.length; i++) {
            if (i > 0 && charsS[i] != charsS[i - 1]) {
                endInterval = i;
                if (!validInterval(s.substring(startInterval, endInterval), j)) {
                    return false;
                }
            }
        }
        return result;
    }
    private boolean validInterval(String s, int j) {
        boolean result = true;
        return result;
    }
}