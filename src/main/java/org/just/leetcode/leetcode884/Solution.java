package org.just.leetcode.leetcode884;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] result;
        List<String> uniqueWords = new ArrayList<>();
        List<String> words = new ArrayList<>(List.of(s1.split(" ")));
        words.addAll(List.of(s2.split(" ")));
        boolean found;
        for (int i = 0; i < words.size(); i++) {
            found = false;
            for (int j = 0; j < words.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (words.get(i).equals(words.get(j))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords.add(words.get(i));
            }
        }
        result = uniqueWords.toArray(new String[0]);
        return result;
    }
}