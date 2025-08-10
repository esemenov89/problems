package org.just.leetcode.leetcode869;

public class Solution {

    public boolean reorderedPowerOf2(int n) {
        String targetDigitCount = convertToDigitCount(n);
        for (int i = 1; i <= 1e9; i <<= 1) {
            if (targetDigitCount.equals(convertToDigitCount(i))) {
                return true;
            }
        }
        return false;
    }

    private String convertToDigitCount(int n) {
        char[] digitCount = new char[10];
        while (n > 0) {
            digitCount[n % 10]++;
            n /= 10;
        }
        return new String(digitCount);
    }
}