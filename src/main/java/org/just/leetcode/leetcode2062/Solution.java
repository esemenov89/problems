package org.just.leetcode.leetcode2062;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    private static final Set<Character> VOWELS_SET = Set.of('a', 'e', 'i', 'o', 'u');
    private final Map<Character, Integer> VOWELS_MAP = new HashMap<>();

    {
        VOWELS_MAP.put('a', 0);
        VOWELS_MAP.put('e', 0);
        VOWELS_MAP.put('i', 0);
        VOWELS_MAP.put('o', 0);
        VOWELS_MAP.put('u', 0);
    }

    public int countVowelSubstrings(String word) {
        int result = 0;
        Set<String> vowelSubstrings = new HashSet<>();
        int start;
        for (int i = 0; i < word.length(); i++) {
            if (VOWELS_SET.contains(word.charAt(i))) {
                start = i;
                while (i < word.length() && VOWELS_SET.contains(word.charAt(i))) {
                    i++;
                }
                if (i - start > 4) {
                    vowelSubstrings.add(word.substring(start, i));
                }
            }
        }
        boolean allVowels;
        int temp;
        for (String s : vowelSubstrings) {
            for (int i = 0; i < s.length(); i++) {
                if (i + 4 >= s.length()) {
                    break;
                }
                allVowels = true;
                VOWELS_MAP.put(s.charAt(i), VOWELS_MAP.getOrDefault(s.charAt(i), 0) + 1);
                VOWELS_MAP.put(s.charAt(i + 1), VOWELS_MAP.getOrDefault(s.charAt(i + 1), 0) + 1);
                VOWELS_MAP.put(s.charAt(i + 2), VOWELS_MAP.getOrDefault(s.charAt(i + 2), 0) + 1);
                VOWELS_MAP.put(s.charAt(i + 3), VOWELS_MAP.getOrDefault(s.charAt(i + 3), 0) + 1);
                VOWELS_MAP.put(s.charAt(i + 4), VOWELS_MAP.getOrDefault(s.charAt(i + 4), 0) + 1);
                temp = i + 4;
                while(temp < s.length()) {
                    for (Map.Entry<Character, Integer> entry : VOWELS_MAP.entrySet()) {
                        if (entry.getValue() == 0) {
                            allVowels = false;
                        }
                    }
                    if (!allVowels) {
                        temp++;
                        if (temp == s.length()) {
                            break;
                        }
                        VOWELS_MAP.put(s.charAt(temp), VOWELS_MAP.getOrDefault(s.charAt(temp), 0) + 1);
                        allVowels = true;
                    } else {
                        temp++;
                        break;
                    }
                }
                if (allVowels) {
                    result++;
                    while (temp < s.length()) {
                        temp++;
                        result++;
                    }
                }
                for (Map.Entry<Character, Integer> entry : VOWELS_MAP.entrySet()) {
                    entry.setValue(0);
                }
            }
        }
        return result;
    }
}