package org.just.leetcode.leetcode3232;

public class Solution {

    public boolean canAliceWin(int[] nums) {
        boolean result = false;
        int singleDigit = 0;
        int doubleDigit = 0;
        for (int num : nums) {
            if (num < 10) {
                singleDigit+=num;
            } else {
                doubleDigit+=num;
            }
        }
        if (singleDigit > doubleDigit) {
            result = true;
        }
        if (doubleDigit > singleDigit) {
            result = true;
        }
        return result;
    }
}