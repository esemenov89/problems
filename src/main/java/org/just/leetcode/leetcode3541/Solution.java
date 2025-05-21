package org.just.leetcode.leetcode3541;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int maxFrequencyVowel = 0;
        int maxFrequencyConsonant = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (VOWELS.contains(entry.getKey()) && entry.getValue() > maxFrequencyVowel) {
                maxFrequencyVowel = entry.getValue();
            }
            if (!VOWELS.contains(entry.getKey()) && entry.getValue() > maxFrequencyConsonant) {
                maxFrequencyConsonant = entry.getValue();
            }
        }
        result = maxFrequencyVowel + maxFrequencyConsonant;
        return result;
    }
}