package studyplan.leetcode75;

import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Leetcode394_leetcode75 {

    /*

    Given an encoded string, return its decoded string.
    The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
    You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
    The test cases are generated so that the length of the output will never exceed 10^5.

    Example 1:
    Input: s = "3[a]2[bc]"
    Output: "aaabcbc"

    Example 2:
    Input: s = "3[a2[c]]"
    Output: "accaccacc"

    Example 3:
    Input: s = "2[abc]3[cd]ef"
    Output: "abcabccdcdcdef"


    Constraints:
    1 <= s.length <= 30
    s consists of lowercase English letters, digits, and square brackets '[]'.
    s is guaranteed to be a valid input.
    All the integers in s are in the range [1, 300].
    */
    private static List<String> DIGITS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

    public static void main(String[] args) {
        Leetcode394_leetcode75 solution = new Leetcode394_leetcode75();
        long startDate = new Date().getTime();
        String s = "3[a]2[bc]";
        System.out.println(s);
        System.out.println(solution.decodeString(s) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: aaabcbc
        startDate = new Date().getTime();
        String s1 = "3[a2[c]]";
        System.out.println(s1);
        System.out.println(solution.decodeString(s1) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: accaccacc
        String s2 = "2[abc]3[cd]ef";
        System.out.println(s2);
        System.out.println(solution.decodeString(s2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: abcabccdcdcdef
    }

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (DIGITS.contains(String.valueOf(s.charAt(i)))) {
                int indexStart = s.indexOf('[', i) + 1;
                int indexEnd = s.indexOf(']', i);
                int count = Integer.parseInt(s.substring(i, indexStart - 1));
                String sub = s.substring(indexStart, indexEnd);
                result.append(sub.repeat(Math.max(0, count)));
                i = indexEnd;
            } else if (s.charAt(i) != '[' && s.charAt(i) != ']') {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}