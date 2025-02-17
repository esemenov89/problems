package org.just.leetcode.leetcode2042;

public class Solution {

    public boolean areNumbersAscending(String s) {
        boolean result = true;
        String[] words = s.split(" ");
        int lastNumber = -1;
        for (String word : words) {
            try {
                int number = Integer.parseInt(word);
                if (lastNumber == -1) {
                    lastNumber = number;
                } else {
                    if (lastNumber >= number) {
                        result = false;
                        break;
                    }
                    lastNumber = number;
                }
            } catch (Exception ignored) {
            }
        }
        if (lastNumber == -1) {
            result = false;
        }
        return result;
    }
}