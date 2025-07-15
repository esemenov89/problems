package org.just.leetcode.leetcode3136;

import java.util.Set;

public class Solution {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    private static final Set<Character> CONSONANTS = Set.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',
            'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
            'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z');

    public boolean isValid(String word) {
        boolean result;
        boolean containVowel = false;
        boolean containConsonant = false;
        boolean containNotValid = false;
        if (word.length() < 3) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (VOWELS.contains(word.charAt(i))) {
                containVowel = true;
            } else if (CONSONANTS.contains(word.charAt(i))) {
                containConsonant = true;
            } else if (!Character.isDigit(word.charAt(i))) {
                containNotValid = true;
            }
        }
        result = containVowel && containConsonant && !containNotValid;
        return result;
    }
}