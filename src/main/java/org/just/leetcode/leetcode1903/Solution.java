package org.just.leetcode.leetcode1903;

public class Solution {

    public String largestOddNumber(String num) {
        String result = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(num.substring(i, i + 1)) % 2 == 1) {
                result = num.substring(0, i + 1);
                break;
            }
        }
        return result;
    }
}