package org.just.leetcode.leetcode2788;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        String[] temp;
        String separatorStr;
        switch (separator) {
            case '.':
                separatorStr = "\\.";
                break;
            case '$':
                separatorStr = "\\$";
                break;
            case '|':
                separatorStr = "\\|";
                break;
            default:
                separatorStr = String.valueOf(separator);
        }
        for (String word : words) {
            temp = word.split(separatorStr);
            for (String s : temp) {
                if (!s.isEmpty()) {
                    result.add(s);
                }
            }
        }
        return result;
    }
}