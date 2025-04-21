package org.just.leetcode.leetcode1704;

import java.util.Set;

public class Solution {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public boolean halvesAreAlike(String s) {
        boolean result;
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length / 2; i < chars.length / 2 && j < chars.length; i++, j++) {
            if (VOWELS.contains(chars[i])) {
                left++;
            }
            if (VOWELS.contains(chars[j])) {
                right++;
            }
        }
        result = (left == right);
        return result;
    }
}