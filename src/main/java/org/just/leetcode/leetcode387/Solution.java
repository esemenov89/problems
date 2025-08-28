package org.just.leetcode.leetcode387;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int firstUniqChar(String s) {
        int result = -1;
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!set.contains(chars[i])) {
                if (i == chars.length - 1) {
                    result = i;
                    break;
                } else {
                    if (!s.substring(i + 1).contains(chars[i] + "")) {
                        result = i;
                        break;
                    }
                }
                set.add(chars[i]);
            }
        }
        return result;
    }
}