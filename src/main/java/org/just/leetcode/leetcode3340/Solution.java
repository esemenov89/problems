package org.just.leetcode.leetcode3340;

public class Solution {

    public boolean isBalanced(String num) {
        boolean result;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Integer.parseInt(num.charAt(i) + "");
            if (i % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }
        result = sumEven == sumOdd;
        return result;
    }
}