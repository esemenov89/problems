package org.just.leetcode.leetcode1221;

public class Solution {

    public int balancedStringSplit(String s) {
        int result = 0;
        int r = 0;
        int l = 0;
        boolean justChanged = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'R' && !justChanged) {
                    while (r > 0) {
                        if (!(i < s.length() && s.charAt(i) == 'L')) {
                            break;
                        }
                        i++;
                        r--;
                    }
                    if (r == 0) {
                        result++;
                        i--;
                    } else {
                        result++;
                        break;
                    }
                    justChanged = true;
                } else {
                    justChanged = false;
                    l++;
                }
            } else if (s.charAt(i) == 'R') {
                if (i > 0 && s.charAt(i - 1) == 'L' && !justChanged) {
                    while (l > 0) {
                        if (!(i < s.length() && s.charAt(i) == 'R')) {
                            break;
                        }
                        i++;
                        l--;
                    }
                    if (l == 0) {
                        result++;
                        i--;
                    } else {
                        result++;
                        break;
                    }
                    justChanged = true;
                } else {
                    justChanged = false;
                    r++;
                }
            }
        }
        return result;
    }
}