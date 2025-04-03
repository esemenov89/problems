package org.just.leetcode.leetcode2864;

import java.util.Arrays;

public class Solution {

    public String maximumOddBinaryNumber(String s) {
        String result = "";
        char[] chars = s.toCharArray();
        char[] resultChars = new char[chars.length];
        Arrays.fill(resultChars, '0');
        int sum = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                sum++;
            }
        }
        resultChars[chars.length - 1] = '1';
        sum--;
        int i = 0;
        while (sum > 0) {
            resultChars[i++] = '1';
            sum--;
        }
        result = new String(resultChars);
        return result;
    }
}