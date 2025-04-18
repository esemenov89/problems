package org.just.leetcode.leetcode3461;

public class Solution {

    public boolean hasSameDigits(String s) {
        boolean result = false;
        StringBuilder sb = new StringBuilder();
        while (s.length() != 2) {
            for (int i = 0; i < s.length() - 1; i++) {
                sb.append((Integer.parseInt(s.substring(i, i + 1)) + Integer.parseInt(s.substring(i + 1, i + 2))) % 10);
            }
            s = sb.toString();
            sb.setLength(0);
        }
        if (s.substring(0, 1).equals(s.substring(1, 2))) {
            result = true;
        }
        return result;
    }
}