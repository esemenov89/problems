package org.just.leetcode.leetcode2506;

public class Solution {

    public int similarPairs(String[] words) {
        int result = 0;
        boolean isPair;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                isPair = true;
                for (int k = 0; k < words[i].length(); k++) {
                    if (!words[j].contains(words[i].charAt(k) + "")) {
                        isPair = false;
                        break;
                    }
                }
                if (isPair) {
                    for (int k = 0; k < words[j].length(); k++) {
                        if (!words[i].contains(words[j].charAt(k) + "")) {
                            isPair = false;
                            break;
                        }
                    }
                    if (isPair) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}