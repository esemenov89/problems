package org.just.leetcode.leetcode1769;

public class Solution {

    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        char[] boxesChars = boxes.toCharArray();
        for (int i = 0; i < boxesChars.length; i++) {
            for (int j = 0; j < boxesChars.length; j++) {
                if (i == j) {
                    continue;
                }
                if (boxesChars[j] == '1') {
                    result[i] += Math.abs(j - i);
                }
            }
        }
        return result;
    }
}