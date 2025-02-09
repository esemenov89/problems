package org.just.leetcode.study.plan.leetcode75;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Leetcode1657_leetcode75 {

/*

Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

Example 1:
Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"

Example 2:
Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.

Example 3:
Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"


Constraints:

1 <= word1.length, word2.length <= 10^5
word1 and word2 contain only lowercase English letters.

*/

    public static void main(String[] args) {
        Leetcode1657_leetcode75 solution = new Leetcode1657_leetcode75();
        long startDate = new Date().getTime();
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(word1 + " " + word2);
        System.out.println(solution.closeStrings(word1, word2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        startDate = new Date().getTime();
        String word12 = "a";
        String word22 = "aa";
        System.out.println(word12 + " " + word22);
        System.out.println(solution.closeStrings(word12, word22) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: false
        startDate = new Date().getTime();
        String word13 = "cabbba";
        String word23 = "abbccc";
        System.out.println(word13 + " " + word23);
        System.out.println(solution.closeStrings(word13, word23) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        startDate = new Date().getTime();
        StringBuilder word14 = new StringBuilder("a");
        StringBuilder word24 = new StringBuilder("a");
        for (int i = 0; i < 100000; i++) {
            word14.append("a");
            word24.append("a");
        }
        System.out.println(word14 + " " + word24);
        System.out.println(solution.closeStrings(word14.toString(), word24.toString()) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        startDate = new Date().getTime();
        StringBuilder word15 = new StringBuilder("a");
        StringBuilder word25 = new StringBuilder("a");
        for (int i = 0; i < 100000; i++) {
            switch (i % 10) {
                case 0:
                    word15.append("a");
                    word25.append("j");
                    break;
                case 1:
                    word15.append("b");
                    word25.append("i");
                    break;
                case 2:
                    word15.append("c");
                    word25.append("h");
                    break;
                case 3:
                    word15.append("d");
                    word25.append("g");
                    break;
                case 4:
                    word15.append("e");
                    word25.append("f");
                    break;
                case 5:
                    word15.append("f");
                    word25.append("e");
                    break;
                case 6:
                    word15.append("g");
                    word25.append("d");
                    break;
                case 7:
                    word15.append("h");
                    word25.append("c");
                    break;
                case 8:
                    word15.append("i");
                    word25.append("b");
                    break;
                case 9:
                    word15.append("j");
                    word25.append("a");
                    break;
            }
            word15.append("a");
            word25.append("a");
        }
        System.out.println(word15 + " " + word25);
        System.out.println(solution.closeStrings(word15.toString(), word25.toString()) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        startDate = new Date().getTime();
        String word16 = "aaabbbbccddeeeeefffff";
        String word26 = "aaaaabbcccdddeeeeffff";
        System.out.println(word16 + " " + word26);
        System.out.println(solution.closeStrings(word16, word26) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
    }

    public boolean closeStrings(String word1, String word2) {
        boolean result = true;
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> word1OccurrencesMap = new HashMap<>();
        Map<Character, Integer> word2OccurrencesMap = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            word1OccurrencesMap.put(word1.charAt(i), word1OccurrencesMap.getOrDefault(word1.charAt(i), 0) + 1);
            word2OccurrencesMap.put(word2.charAt(i), word2OccurrencesMap.getOrDefault(word2.charAt(i), 0) + 1);
        }
        List<Character> charactersWord1List = word1OccurrencesMap.keySet().stream().toList();
        List<Character> charactersWord2List = word2OccurrencesMap.keySet().stream().toList();
        for (Character character : charactersWord1List) {
            if (!charactersWord2List.contains(character)) {
                return false;
            }
        }
        for (Character character : charactersWord2List) {
            if (!charactersWord1List.contains(character)) {
                return false;
            }
        }
        Object[] countOccurrencesCharacterWord1 = word1OccurrencesMap.values().stream().toList().toArray();
        Object[] countOccurrencesCharacterWord2 = word2OccurrencesMap.values().stream().toList().toArray();
        for (int i = 0; i < countOccurrencesCharacterWord1.length; i++) {
            for (int j = 0; j < countOccurrencesCharacterWord2.length; j++) {
                if (Objects.equals(countOccurrencesCharacterWord1[i], countOccurrencesCharacterWord2[j])) {
                    countOccurrencesCharacterWord1[i] = -1;
                    countOccurrencesCharacterWord2[j] = -1;
                }
            }
        }
        for (Object o : countOccurrencesCharacterWord1) {
            if (!Objects.equals(o, -1)) {
                return false;
            }
        }
        return result;
    }
}