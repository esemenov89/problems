package org.just.leetcode.leetcode1221;

public class Solution {

    public int balancedStringSplit(String s) {
        int result = 0;
        int r = 0;
        int l = 0;
        // LLRRL
        boolean rChanged = false;
        boolean lChanged = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                if (lChanged || i == s.length() - 1) {
                    result++;
                    if (r == l)  {
                        r = 0;
                        l = 0;
                    } else if (r > l) {
                        r = r - l;
                        l = 0;
                    } else {
                       l = l - r;
                       r = 0;
                    }
                    lChanged = false;
                    rChanged = false;
                } else if (i > 0 && s.charAt(i - 1) == 'R') {
                    rChanged = true;
                }
                l++;
            }
            if (s.charAt(i) == 'R') {
                if (rChanged || i == s.length() - 1) {
                    result++;
                    if (r == l)  {
                        r = 0;
                        l = 0;
                    } else if (r > l) {
                        r = r - l;
                        l = 0;
                    } else {
                        l = l - r;
                        r = 0;
                    }
                    lChanged = false;
                    rChanged = false;
                } else if (i > 0 && s.charAt(i - 1) == 'L') {
                    lChanged = true;
                }
                r++;
            }
        }
        return result;
    }
}