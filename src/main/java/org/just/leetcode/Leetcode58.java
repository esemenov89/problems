package org.just.leetcode;

public class Leetcode58 {

/*    Example 1:

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.
    Example 2:

    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.
    Example 3:

    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.*/



    public static void main(String[] args) {
        Leetcode58 solution = new Leetcode58();
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s1));
        System.out.println(solution.lengthOfLastWord(s2));
        System.out.println(solution.lengthOfLastWord(s3));
    }

    public int lengthOfLastWord(String s) {
        int result;
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        result = lastWord.length();
        return result;
    }
}