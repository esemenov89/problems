package org.just.leetcode.leetcode2138;

public class Solution {

    public String[] divideString(String s, int k, char fill) {
        String[] result;
        if (s.length() % k != 0) {
            result = new String[s.length() / k + 1];
        } else {
            result = new String[s.length() / k];
        }
        int j = 0;
        String temp;
        for (int i = 0; i < s.length(); i += k) {
            if (i + k >= s.length()) {
                temp = s.substring(i);
                temp += (fill + "").repeat(k - temp.length());
                result[j++] = temp;
            } else {
                result[j++] = s.substring(i, i + k);
            }
        }
        return result;
    }
}