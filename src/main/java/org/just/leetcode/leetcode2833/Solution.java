package org.just.leetcode.leetcode2833;

public class Solution {

    public int furthestDistanceFromOrigin(String moves) {
        int result = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int sumLeftOrRight = 0;
        char[] chars = moves.toCharArray();
        for (char c : chars) {
            if (c == 'R') {
                sumRight++;
            } else if (c == 'L') {
                sumLeft++;
            } else if (c == '_') {
                sumLeftOrRight++;
            }
        }
        if (sumLeft == sumRight) {
            result = sumLeftOrRight;
        } else if (sumLeft > sumRight) {
            result = sumLeft - sumRight + sumLeftOrRight;
        } else {
            result = sumRight - sumLeft + sumLeftOrRight;
        }
        return result;
    }
}