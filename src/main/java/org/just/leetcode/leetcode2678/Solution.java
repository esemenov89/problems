package org.just.leetcode.leetcode2678;

public class Solution {

    public int countSeniors(String[] details) {
        int result = 0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                result++;
            }
        }
        return result;
    }
}