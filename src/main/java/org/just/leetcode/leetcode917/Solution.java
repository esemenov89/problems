package org.just.leetcode.leetcode917;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    private static final Set<Character> ALPHABET = new HashSet<Character>();
    static {
        ALPHABET.add('a');
        ALPHABET.add('b');
        ALPHABET.add('c');
        ALPHABET.add('d');
        ALPHABET.add('e');
        ALPHABET.add('f');
        ALPHABET.add('g');
        ALPHABET.add('h');
        ALPHABET.add('i');
        ALPHABET.add('j');
        ALPHABET.add('k');
        ALPHABET.add('l');
        ALPHABET.add('m');
        ALPHABET.add('n');
        ALPHABET.add('o');
        ALPHABET.add('p');
        ALPHABET.add('q');
        ALPHABET.add('r');
        ALPHABET.add('s');
        ALPHABET.add('t');
        ALPHABET.add('u');
        ALPHABET.add('v');
        ALPHABET.add('w');
        ALPHABET.add('x');
        ALPHABET.add('y');
        ALPHABET.add('z');
        ALPHABET.add('A');
        ALPHABET.add('B');
        ALPHABET.add('C');
        ALPHABET.add('D');
        ALPHABET.add('E');
        ALPHABET.add('F');
        ALPHABET.add('G');
        ALPHABET.add('H');
        ALPHABET.add('I');
        ALPHABET.add('J');
        ALPHABET.add('K');
        ALPHABET.add('L');
        ALPHABET.add('M');
        ALPHABET.add('N');
        ALPHABET.add('O');
        ALPHABET.add('P');
        ALPHABET.add('Q');
        ALPHABET.add('R');
        ALPHABET.add('S');
        ALPHABET.add('T');
        ALPHABET.add('U');
        ALPHABET.add('V');
        ALPHABET.add('W');
        ALPHABET.add('X');
        ALPHABET.add('Y');
        ALPHABET.add('Z');

    }

    public String reverseOnlyLetters(String s) {
        String result = "";
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (ALPHABET.contains(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            } else {
                map.put(i, s.charAt(i));
            }
        }
        stringBuilder = stringBuilder.reverse();
        StringBuilder temp = new StringBuilder();
        int sbIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(i)) {
                temp.append(map.get(i));
            } else {
                temp.append(stringBuilder.charAt(sbIndex++));
            }
        }
        result = temp.toString();
        return result;
    }
}