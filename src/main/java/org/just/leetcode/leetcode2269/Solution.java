package org.just.leetcode.leetcode2269;

public class Solution {

    public int divisorSubstrings(int num, int k) {
        int result = 0;
        String s = String.valueOf(num);
        int temp;
        for (int i = 0; i < s.length() - k + 1; i++) {
            temp = Integer.parseInt(s.substring(i, i + k));
            if (temp == 0) {
                continue;
            }
            if (num % temp == 0) {
                result++;
            }
        }
        return result;
    }
}