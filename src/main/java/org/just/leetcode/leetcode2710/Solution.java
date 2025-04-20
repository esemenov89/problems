package org.just.leetcode.leetcode2710;

public class Solution {

    public String removeTrailingZeros(String num) {
        String result = num;
        char[] chars = num.toCharArray();
        if (chars[chars.length - 1] == '0') {
            StringBuilder stringBuilder = new StringBuilder();
            boolean trailingZeros = true;
            for (int i = chars.length - 1; i >= 0; i--) {
                if (trailingZeros && chars[i] != '0') {
                    trailingZeros = false;
                }
                if (!trailingZeros) {
                    stringBuilder.append(chars[i]);
                }
            }
            result = stringBuilder.reverse().toString();
        }
        return result;
    }
}