package org.just.leetcode.leetcode1869;

public class Solution {

    public boolean checkZeroOnes(String s) {
        boolean result = false;
        char[] chars = s.toCharArray();
        int countZeros = 0;
        int countOnes = 0;
        int maxPeriodZeros = 0;
        int maxPeriodOnes = 0;
        char before = '9';
        for (Character c : chars) {
            if (c == '0') {
                if (before == '0') {
                    countZeros++;
                } else {
                    countZeros = 1;
                }
            } else {
                if (before == '1') {
                    countOnes++;
                } else {
                    countOnes = 1;
                }
            }
            if (countZeros > maxPeriodZeros) {
                maxPeriodZeros = countZeros;
            }
            if (countOnes > maxPeriodOnes) {
                maxPeriodOnes = countOnes;
            }
            before = c;
        }
        result = (maxPeriodOnes > maxPeriodZeros);
        return result;
    }
}