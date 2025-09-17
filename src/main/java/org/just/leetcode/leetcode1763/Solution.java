package org.just.leetcode.leetcode1763;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public String longestNiceSubstring(String s) {
        int stringLength = s.length();
        int startIndex = -1;
        int maxLength = 0;

        for (int i = 0; i < stringLength; ++i) {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < stringLength; ++j) {
                charSet.add(s.charAt(j));
                boolean isNice = true;
                for (char ch : charSet) {
                    char counterpart = (char) (ch ^ 32);
                    if (!charSet.contains(ch) || !charSet.contains(counterpart)) {
                        isNice = false;
                        break;
                    }
                }
                if (isNice && maxLength < j - i + 1) {
                    maxLength = j - i + 1;
                    startIndex = i;
                }
            }
        }
        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + maxLength);
    }
}