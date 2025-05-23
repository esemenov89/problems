package org.just.leetcode.leetcode2496;

public class Solution {

    public int maximumValue(String[] strs) {
        int result = 0;
        int temp;
        for (String str : strs) {
            try {
                temp = Math.max(result, Integer.parseInt(str));
            } catch (Exception e) {
                temp = str.length();
            }
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}