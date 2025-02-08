package org.just.leetcode.leetcode75;

import java.util.Date;
import java.util.Stack;

public class Leetcode2390_leetcode75 {

/*

You are given a string s, which contains stars *.

In one operation, you can:

- Choose a star in s.
- Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

- The input will be generated such that the operation is always possible.
- It can be shown that the resulting string will always be unique.


Example 1:
Input: s = "leet**cod*e"
Output: "lecoe"
Explanation: Performing the removals from left to right:
- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
There are no more stars, so we return "lecoe".

Example 2:
Input: s = "erase*****"
Output: ""
Explanation: The entire string is removed, so we return an empty string.

Constraints:
1 <= s.length <= 10^5
s consists of lowercase English letters and stars *.
The operation above can be performed on s.

*/

    public static void main(String[] args) {
        Leetcode2390_leetcode75 solution = new Leetcode2390_leetcode75();
        long startDate = new Date().getTime();
        String s = "leet**cod*e";
        System.out.println(s);
        System.out.println(solution.removeStars(s) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: lecoe
        startDate = new Date().getTime();
        String s1 = "erase*****";
        System.out.println(s1);
        System.out.println(solution.removeStars(s1) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output:
        startDate = new Date().getTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            if (i < 50001) {
                sb.append('a');
            } else {
                sb.append('*');
            }
        }
        String s2 = sb.toString();
        System.out.println(s2);
        System.out.println(solution.removeStars(s2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: aa
        startDate = new Date().getTime();
        String s3 = "*";
        System.out.println(s3);
        System.out.println(solution.removeStars(s3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output:
        startDate = new Date().getTime();
        String s4 = "a*";
        System.out.println(s4);
        System.out.println(solution.removeStars(s4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output:
    }

    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '*') {
                if(stack.isEmpty()) {
                   break;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        for (Character c : stack) {
            result.append(c);
        }
        return result.toString();
    }
}