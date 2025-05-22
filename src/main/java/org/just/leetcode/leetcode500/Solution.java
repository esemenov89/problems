package org.just.leetcode.leetcode500;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final String FIRST_ROW = "qwertyuiop";
    private static final String SECOND_ROW = "asdfghjkl";
    private static final String THIRD_ROW = "zxcvbnm";

    public String[] findWords(String[] words) {
        String[] result;
        List<String> list = new ArrayList<>();
        String checkingRow = FIRST_ROW;
        char[] chars;
        boolean found;
        for (String word : words) {
            chars = word.toCharArray();
            if (FIRST_ROW.contains((chars[0] + "").toLowerCase())) {
                checkingRow = FIRST_ROW;
            } else if (SECOND_ROW.contains((chars[0] + "").toLowerCase())) {
                checkingRow = SECOND_ROW;
            } else if (THIRD_ROW.contains((chars[0] + "").toLowerCase())) {
                checkingRow = THIRD_ROW;
            }
            found = true;
            for (char c : chars) {
                if (!checkingRow.contains((c + "").toLowerCase())) {
                    found = false;
                    break;
                }
            }
            if (found) {
                list.add(word);
            }
        }
        result = new String[list.size()];
        list.toArray(result);
        return result;
    }
}