package org.just.leetcode.leetcode1160;

public class Solution {

    public int countCharacters(String[] words, String chars) {
        int result = 0;
        StringBuilder stringBuilder;
        boolean isGoodWord;
        for (String word : words) {
            isGoodWord = true;
            stringBuilder = new StringBuilder(chars);
            for (int i = 0; i < word.length(); i++) {
                if (stringBuilder.toString().contains(word.substring(i, i + 1))) {
                    stringBuilder.deleteCharAt(stringBuilder.toString().indexOf(word.charAt(i)));
                } else {
                    isGoodWord = false;
                    break;
                }
            }
            if (isGoodWord) {
                result += word.length();
            }
        }
        return result;
    }
}