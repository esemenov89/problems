package org.just.leetcode.leetcode2243;

public class Solution {

    public String digitSum(String s, int k) {
        String result;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tempSb;
        int temp;
        int tempLength;
        while (sb.length() > k) {
            tempSb = new StringBuilder();
            for (int i = 0; i < sb.length(); i += k) {
                temp = 0;
                tempLength = Math.min(i + k, sb.length());
                for (int j = i; j < tempLength; j++) {
                    temp += Integer.parseInt(sb.substring(j, j + 1));
                }
                tempSb.append(temp);
            }
            sb = tempSb;
        }
        result = sb.toString();
        return result;
    }
}