package org.just.leetcode.leetcode2011;

public class Solution {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.contains("+")) {
                result++;
            } else if (operation.contains("-")) {
                result--;
            }
        }
        return result;
    }
}