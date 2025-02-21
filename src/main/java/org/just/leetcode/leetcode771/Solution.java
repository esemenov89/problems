package org.just.leetcode.leetcode771;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        char[] jewelChars = jewels.toCharArray();
        char[] stonesChars = stones.toCharArray();
        for (char stonesChar : stonesChars) {
            for (char jewelChar : jewelChars) {
                if (stonesChar == jewelChar) {
                    result++;
                }
            }
        }
        return result;
    }
}