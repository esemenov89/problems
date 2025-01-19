package studyplan.leetcode75;

import java.util.Arrays;
import java.util.Date;
import java.util.Set;

public class Leetcode1004_leetcode75 {

/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length

*/

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static void main(String[] args) {
        Leetcode1004_leetcode75 solution = new Leetcode1004_leetcode75();
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