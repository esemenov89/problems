package org.just.leetcode.leetcode2124;

public class Solution {

    public boolean checkString(String s) {
        boolean result = true;
        boolean bWas = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                bWas = true;
            } else if (s.charAt(i) == 'a' && bWas) {
                result = false;
                break;
            }
        }
        return result;
    }
}