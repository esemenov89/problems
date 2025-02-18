package org.just.leetcode.leetcode125;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private static final Set<Character> LETTERS_AND_DIGITS = new HashSet<>();

    static {
        LETTERS_AND_DIGITS.add('0');
        LETTERS_AND_DIGITS.add('1');
        LETTERS_AND_DIGITS.add('2');
        LETTERS_AND_DIGITS.add('3');
        LETTERS_AND_DIGITS.add('4');
        LETTERS_AND_DIGITS.add('5');
        LETTERS_AND_DIGITS.add('6');
        LETTERS_AND_DIGITS.add('7');
        LETTERS_AND_DIGITS.add('8');
        LETTERS_AND_DIGITS.add('9');
        LETTERS_AND_DIGITS.add('a');
        LETTERS_AND_DIGITS.add('b');
        LETTERS_AND_DIGITS.add('c');
        LETTERS_AND_DIGITS.add('d');
        LETTERS_AND_DIGITS.add('e');
        LETTERS_AND_DIGITS.add('f');
        LETTERS_AND_DIGITS.add('g');
        LETTERS_AND_DIGITS.add('h');
        LETTERS_AND_DIGITS.add('i');
        LETTERS_AND_DIGITS.add('j');
        LETTERS_AND_DIGITS.add('k');
        LETTERS_AND_DIGITS.add('l');
        LETTERS_AND_DIGITS.add('m');
        LETTERS_AND_DIGITS.add('n');
        LETTERS_AND_DIGITS.add('o');
        LETTERS_AND_DIGITS.add('p');
        LETTERS_AND_DIGITS.add('q');
        LETTERS_AND_DIGITS.add('r');
        LETTERS_AND_DIGITS.add('s');
        LETTERS_AND_DIGITS.add('t');
        LETTERS_AND_DIGITS.add('u');
        LETTERS_AND_DIGITS.add('v');
        LETTERS_AND_DIGITS.add('w');
        LETTERS_AND_DIGITS.add('x');
        LETTERS_AND_DIGITS.add('y');
        LETTERS_AND_DIGITS.add('z');
    }

    public boolean isPalindrome(String s) {
        boolean result = true;
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (LETTERS_AND_DIGITS.contains(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        char[] chars = stringBuilder.toString().toCharArray();
        int iMax = chars.length / 2;
        int jMin = chars.length % 2 == 0 ? chars.length / 2 : chars.length / 2 + 1;
        for (int i = 0, j = chars.length - 1; i < iMax && j >= jMin; i++, j--) {
            if (chars[i] != chars[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}