package org.just.leetcode.leetcode1002;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        String temp = words[0];
        String tempLetter;
        boolean isCommon;
        StringBuilder tempBuilder;
        for (int i = 0; i < temp.length(); i++) {
            tempLetter = temp.substring(i, i + 1);
            isCommon = true;
            for (int j = 1; j < words.length; j++) {
                tempBuilder = new StringBuilder(words[j]);
                if (!words[j].contains(tempLetter)) {
                    isCommon = false;
                    break;
                } else {
                    tempBuilder.delete(tempBuilder.indexOf(tempLetter), tempBuilder.indexOf(tempLetter) + 1);
                    words[j] = tempBuilder.toString();
                }
            }
            if (isCommon) {
                result.add(tempLetter);
            }
        }
        return result;
    }
}