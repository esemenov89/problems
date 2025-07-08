package org.just.leetcode.leetcode2264;

public class Solution {

    public String largestGoodInteger(String num) {
        String result = "";
        int temp = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                if (Integer.parseInt(num.substring(i, i + 3)) > temp) {
                    temp = Integer.parseInt(num.substring(i, i + 3));
                    result = num.substring(i, i + 3);
                }
            }
        }
        return result;
    }
}