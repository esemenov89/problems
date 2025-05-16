package org.just.leetcode.leetcode2586;

import java.util.Set;

public class Solution {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public int vowelStrings(String[] words, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (VOWELS.contains(words[i].charAt(0)) && VOWELS.contains(words[i].charAt(words[i].length() - 1))) {
                result++;
            }
        }
        return result;
    }
}