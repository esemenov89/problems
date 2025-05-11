package org.just.leetcode.leetcode1550;

public class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
}