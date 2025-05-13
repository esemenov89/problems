package org.just.leetcode.leetcode2351;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public char repeatedCharacter(String s) {
        char result = ' ';
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                result = s.charAt(i);
                break;
            }
        }
        return result;
    }
}