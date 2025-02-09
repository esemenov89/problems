package org.just.leetcode.study.plan.leetcode75;

import java.util.Scanner;

public class Leetcode392_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        Leetcode392_leetcode75 leetcode = new Leetcode392_leetcode75();
        System.out.println(leetcode.isSubsequence(word1, word2));
    }

    public boolean isSubsequence(String s, String t) {
        boolean result = true;
        char[] charT = t.toCharArray();
        char[] charS = s.toCharArray();
        boolean[] arrayBoolean = new boolean[charS.length];
        int startTint = 0;
        for (int i = 0; i < charS.length; i++) {
            for (int j = startTint; j < charT.length; j++) {
                if (charS[i] == charT[j]) {
                    arrayBoolean[i] = true;
                    startTint = j + 1;
                    break;
                }
            }
        }
        for (boolean b : arrayBoolean) {
            if (!b) {
                result = false;
                break;
            }
        }
        return result;
    }
}