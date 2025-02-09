package org.just.leetcode.study.plan.leetcode75;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Leetcode345_leetcode75 {

    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Leetcode345_leetcode75 leetcode = new Leetcode345_leetcode75();
        System.out.println(leetcode.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> vowelsInString = new Stack<>();
        char[] sChar = s.toCharArray();
        for (char c : sChar) {
            if (vowels.contains(c)) {
                vowelsInString.push(c);
            }
        }
        for (char c : sChar) {
            if (vowels.contains(c)) {
                result.append(vowelsInString.pop());
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}