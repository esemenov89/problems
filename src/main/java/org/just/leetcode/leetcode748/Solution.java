package org.just.leetcode.leetcode748;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String result = "";
        String licensePlateCorrected = licensePlate.toLowerCase().replace(" ", "");
        List<String> goodWords = new ArrayList<>();
        String temp;
        String tempWord;
        int index = 0;
        for (String word : words) {
            temp = licensePlateCorrected;
            tempWord = word;
            for (int i = 0; i < temp.length(); i++) {
                if (!Character.isLetter(temp.charAt(i))) {
                    temp = temp.substring(0, i) + temp.substring(i + 1);
                    i--;
                    continue;
                }
                index = tempWord.indexOf(temp.substring(i, i + 1));
                if (index != -1) {
                    temp = temp.substring(0, i) + temp.substring(i + 1);
                    tempWord = tempWord.substring(0, index) + tempWord.substring(index + 1);
                    i--;
                } else {
                    break;
                }
            }
            if (temp.isEmpty()) {
                goodWords.add(word);
            }
        }
        int minLength = Integer.MAX_VALUE;
        for (String word : goodWords) {
            if (word.length() < minLength) {
                minLength = word.length();
                result = word;
            }
        }
        return result;
    }
}