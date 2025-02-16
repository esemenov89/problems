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
        int endInterval;
        for (int i = 0; i <= charsS.length; i++) {
            if (i == charsS.length || (i > 0 && charsS[i] != charsS[i - 1])) {
                endInterval = i;
                j = validInterval(s.substring(startInterval, endInterval), j, charsP, endInterval == charsS.length);
                if (j == -1) {
                    return false;
                }
                startInterval = i;
            }
        }
        if ((j == charsP.length - 1 && charsP[j] != '*') || j < charsP.length - 1) {
            return false;
        }
        return result;
    }

    private int validInterval(String s, int j, char[] p, boolean lastInterval) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j > p.length - 1) {
                return -1;
            }
            if (s.charAt(i) == p[j] || p[j] == '.') {
                j++;
                count++;
                if (lastInterval && j < p.length && i == s.length() - 1 && p[j] != '*') {
                    return -1;
                }
            } else {
                if (p[j] == '*' && (p[j - 1] == s.charAt(i) || p[j - 1] == '.')) {
                    if (j < p.length - 1) {
                        j++;
                        if (p[j] == s.charAt(i) || p[j] == '.') {
                            count = s.length() - count;
                            while (j < (lastInterval ? p.length : p.length - 1) && (p[j] == s.charAt(i) || p[j] == '.') && count > 0) {
                                j++;
                                count--;
                            }
                            return j;
                        }
                    }
                    return j;
                } else {
                    if (j < p.length - 1 && p[j + 1] == '*') {
                        j += 2;
                        i--;
                    } else {
                        return -1;
                    }
                }
            }
        }
        if (j < p.length - 1 && p[j] == '*') {
            j++;
        }
        return j;
    }
}