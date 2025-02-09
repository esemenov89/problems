package org.just.leetcode.study.plan.leetcode75;

import java.util.Arrays;
import java.util.Date;
import java.util.Set;

public class Leetcode1456_leetcode75 {

/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.


Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

Constraints:

1 <= s.length <= 10^5
s consists of lowercase English letters.
1 <= k <= s.length

*/

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        Leetcode1456_leetcode75 solution = new Leetcode1456_leetcode75();
        long startDate = new Date().getTime();
        String s = "abciiidef";
        System.out.println(s);
        int k = 3;
        System.out.println(solution.maxVowels(s, k) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 3
        startDate = new Date().getTime();
        String s1 = "aeiou";
        System.out.println(s1);
        int k1 = 2;
        System.out.println(solution.maxVowels(s1, k1) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 2
        startDate = new Date().getTime();
        String s2 = "leetcode";
        System.out.println(s2);
        int k2 = 3;
        System.out.println(solution.maxVowels(s2, k2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 2
        startDate = new Date().getTime();
        String s3 = "aeeeeeee";
        System.out.println(s3);
        int k3 = 8;
        System.out.println(solution.maxVowels(s3, k3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 8
        startDate = new Date().getTime();
        String s4 = "a";
        System.out.println(s4);
        int k4 = 1;
        System.out.println(solution.maxVowels(s4, k4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        String s5;
        char[] chars = new char[100000];
        Arrays.fill(chars, 'a');
        s5 = new String(chars);
        System.out.println(s5);
        int k5 = 1;
        System.out.println(solution.maxVowels(s5, k5) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        String s6;
        char[] chars2 = new char[100000];
        for (int i = 0; i < chars2.length; i++) {
            if (i % 2 == 0) {
                chars2[i] = 'a';
            } else {
                chars2[i] = 'b';
            }
        }
        s6 = new String(chars2);
        System.out.println(s6);
        int k6 = 2;
        System.out.println(solution.maxVowels(s6, k6) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        String s7;
        char[] chars3 = new char[100000];
        for (int i = 0; i < chars3.length; i++) {
            if (i % 2 == 0) {
                chars3[i] = 'a';
            } else {
                chars3[i] = 'b';
            }
        }
        s7 = new String(chars3);
        System.out.println(s7);
        int k7 = 3945;
        System.out.println(solution.maxVowels(s7, k7) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 1973
    }

    public int maxVowels(String s, int k) {
        int result = 0;
        char[] chars = s.toCharArray();
        int count = -1;
        for (int i = 0; i <= chars.length - k; i++) {
            if (count != -1) {
                if (VOWELS.contains(chars[i - 1])) {
                    count--;
                }
                if (VOWELS.contains(chars[i + k - 1])) {
                    count++;
                }
            } else {
                count = 0;
                for (int j = i; j < i + k; j++) {
                    if (VOWELS.contains(chars[j])) {
                        count++;
                    }
                }
            }
            if (count > result) {
                result = count;
                if (result == k) {
                    break;
                }
            }
        }
        return result;
    }
}