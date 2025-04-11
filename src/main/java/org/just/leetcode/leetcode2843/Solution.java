package org.just.leetcode.leetcode2843;

public class Solution {

    public int countSymmetricIntegers(int low, int high) {
        int result = 0;
        for (int i = low; i <= high; i++) {
            if (i >= 10 && i < 100) {
                if (i / 10 == i % 10) {
                    result++;
                }
            }
            if (i >= 1000 && i < 10000) {
                if (i / 1000 + (i - (i / 1000 * 1000)) / 100 == (i - (i / 100 * 100)) / 10 + (i - (i / 100 * 100)) % 10) {
                    result++;
                }
            }
        }
        return result;
    }
}