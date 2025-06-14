package org.just.leetcode.leetcode2566;

public class Solution {

    public int minMaxDifference(int num) {
        int result;
        String numStr = String.valueOf(num);
        String tempNotNine = numStr.substring(0, 1);
        String firstDigit = numStr.substring(0, 1);
        if ("9".equals(tempNotNine)) {
            for (int i = 1; i < numStr.length(); i++) {
                if (!"9".equals(numStr.substring(i, i + 1))){
                    tempNotNine = numStr.substring(i, i + 1);
                    break;
                }
            }
        }
        String maxStr = numStr.replace(tempNotNine.charAt(0), '9');
        int max = Integer.parseInt(maxStr);
        String minStr = numStr.replace(firstDigit.charAt(0), '0');
        int min = Integer.parseInt(minStr);
        result = max - min;
        return result;
    }
}