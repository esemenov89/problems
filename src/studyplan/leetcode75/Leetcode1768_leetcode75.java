package studyplan.leetcode75;

import java.util.Scanner;

public class Leetcode1768_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        Leetcode1768_leetcode75 leetcode = new Leetcode1768_leetcode75();
        System.out.println(leetcode.mergeAlternately(word1, word2));
    }

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
            if (i == length - 1) {
                if (word1.length() > word2.length()) {
                    result.append(word1.substring(i + 1));
                } else if (word1.length() < word2.length()) {
                    result.append(word2.substring(i + 1));
                }
            }
        }
        return result.toString();
    }
}