package org.just.leetcode.leetcode1528;

public class Solution {

    public String restoreString(String s, int[] indices) {
        String result = "";
        char[] chars = s.toCharArray();
        char[] resultChars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            resultChars[indices[i]] = chars[i];
        }
        result = new String(resultChars);
        return result;
    }
}