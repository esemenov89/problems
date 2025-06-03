package org.just.leetcode.leetcode1672;

public class Solution {

    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int sum;
        for (int[] account : accounts) {
            sum = 0;
            for (int accountBalance : account) {
                sum += accountBalance;
            }
            if (sum > result) {
                result = sum;
            }
        }
        return result;
    }
}