package org.just.leetcode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1945 {

    /*

You are given a string s consisting of lowercase English letters, and an integer k.
Your task is to convert the string into an integer by a special process, and then transform it by summing its digits repeatedly k times. More specifically, perform the following steps:

Convert s into an integer by replacing each letter with its position in the alphabet (i.e. replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
Transform the integer by replacing it with the sum of its digits.
Repeat the transform operation (step 2) k times in total.
For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:

Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.

Example 1:
Input: s = "iiii", k = 1
Output: 36
Explanation:
The operations are as follows:
- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.

Example 2:
Input: s = "leetcode", k = 2
Output: 6
Explanation:
The operations are as follows:
- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545
- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33
- Transform #2: 33 ➝ 3 + 3 ➝ 6
Thus the resulting integer is 6.

Example 3:
Input: s = "zbax", k = 2
Output: 8

Constraints:
1 <= s.length <= 100
1 <= k <= 10
s consists of lowercase English letters.
    */

    private static final Map<Character, Integer> ALPHABET = new HashMap<>();

    static {
        ALPHABET.put('a', 1);
        ALPHABET.put('b', 2);
        ALPHABET.put('c', 3);
        ALPHABET.put('d', 4);
        ALPHABET.put('e', 5);
        ALPHABET.put('f', 6);
        ALPHABET.put('g', 7);
        ALPHABET.put('h', 8);
        ALPHABET.put('i', 9);
        ALPHABET.put('j', 10);
        ALPHABET.put('k', 11);
        ALPHABET.put('l', 12);
        ALPHABET.put('m', 13);
        ALPHABET.put('n', 14);
        ALPHABET.put('o', 15);
        ALPHABET.put('p', 16);
        ALPHABET.put('q', 17);
        ALPHABET.put('r', 18);
        ALPHABET.put('s', 19);
        ALPHABET.put('t', 20);
        ALPHABET.put('u', 21);
        ALPHABET.put('v', 22);
        ALPHABET.put('w', 23);
        ALPHABET.put('x', 24);
        ALPHABET.put('y', 25);
        ALPHABET.put('z', 26);
    }

    public static void main(String[] args) {
        Leetcode1945 solution = new Leetcode1945();
        long startDate = new Date().getTime();
        String s = "iiii";
        int k = 1;
        System.out.println(s);
        System.out.println(solution.getLucky(s, k));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 36
        startDate = new Date().getTime();
        String s2 = "leetcode";
        int k2 = 2;
        System.out.println(s2);
        System.out.println(solution.getLucky(s2, k2));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 6
        startDate = new Date().getTime();
        String s3 = "zbax";
        int k3 = 2;
        System.out.println(s3);
        System.out.println(solution.getLucky(s3, k3));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 8
        startDate = new Date().getTime();
        String s4 = "z".repeat(100);
        int k4 = 10;
        System.out.println(s4);
        System.out.println(solution.getLucky(s4, k4));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 8
        startDate = new Date().getTime();
        String s5 = "hvmhoasabaymnmsd";
        int k5 = 1;
        System.out.println(s5);
        System.out.println(solution.getLucky(s5, k5));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: 79
    }

    public int getLucky(String s, int k) {
        int result = 0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            temp.append(ALPHABET.get(s.charAt(i)));
        }
        Integer tempSum = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < temp.length(); j++) {
                tempSum += Integer.parseInt(temp.charAt(j) + "");
            }
            if (i == k - 1) {
                result = tempSum;
            } else {
                temp = new StringBuilder(String.valueOf(tempSum));
                tempSum = 0;
            }
        }
        return result;
    }
}