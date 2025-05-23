package org.just.leetcode.leetcode2696;

public class Solution {

    public int minLength(String s) {
        int result;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (!stringBuilder.isEmpty() && (stringBuilder.indexOf("AB") != -1 || stringBuilder.indexOf("CD") != -1)) {
            if (stringBuilder.indexOf("AB") != -1) {
                stringBuilder.delete(stringBuilder.indexOf("AB"), stringBuilder.indexOf("AB") + 2);
            }
            if (stringBuilder.indexOf("CD") != -1) {
                stringBuilder.delete(stringBuilder.indexOf("CD"), stringBuilder.indexOf("CD") + 2);
            }
        }
        result = stringBuilder.length();
        return result;
    }
}