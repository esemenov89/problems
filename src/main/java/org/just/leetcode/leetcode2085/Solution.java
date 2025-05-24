package org.just.leetcode.leetcode2085;

public class Solution {

    public int countWords(String[] words1, String[] words2) {
        int result = 0;
        int count;
        for (String value : words1) {
            count = 0;
            for (String string : words1) {
                if (value.equals(string)) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count > 1) {
                continue;
            }
            for (String s : words2) {
                if (value.equals(s)) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                result++;
            }
        }
        return result;
    }
}