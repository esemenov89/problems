package studyplan.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class Leetcode443_leetcode75 {

/*    Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.



Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".


Constraints:

1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.*/

    public static void main(String[] args) {
        Leetcode443_leetcode75 solution = new Leetcode443_leetcode75();
        System.out.println("chars");
        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        System.out.println(solution.compress(chars));
        solution.printResultChar(chars);
        System.out.println("-----");
        //Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        char[] chars2 = new char[]{'a'};
        System.out.println("chars2");
        System.out.println(solution.compress(chars2));
        solution.printResultChar(chars2);
        System.out.println("-----");
        // Return 1, and the first character of the input array should be: ["a"]
        char[] chars3 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println("chars3");
        System.out.println(solution.compress(chars3));
        solution.printResultChar(chars3);
        System.out.println("-----");
        //Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
        char[] chars4 = new char[2000];
        for (int i = 0; i < 2000; i++) {
            chars4[i] = 'a';
        }
        System.out.println("chars4");
        System.out.println(solution.compress(chars4));
        solution.printResultChar(chars4);
        System.out.println("-----");
        //Output: Return 5, and the first 5 characters of the input array should be: ["a","2","0","0","0"]
        char[] chars5 = new char[2000];
        for (int i = 0; i < 2000; i++) {
            if (i < 1000) {
                chars5[i] = 'a';
            } else {
                chars5[i] = 'b';
            }
        }
        System.out.println("chars5");
        System.out.println(solution.compress(chars5));
        solution.printResultChar(chars5);
        System.out.println("-----");
        //Output: Return 10, and the first 10 characters of the input array should be: ["a","1","0","0","0","b","1","0","0","0"]
        char[] chars6 = new char[]{'a','b','c','d','e'};
        System.out.println("chars6");
        System.out.println(solution.compress(chars6));
        solution.printResultChar(chars6);
        System.out.println("-----");
        //Output: Return 5, and the first 5 characters of the input array should be: ["a","b","c","d","e"]
    }

    public int compress(char[] chars) {
        List<Character> resultChars = new ArrayList<>();
        int result;
        resultChars.add(chars[0]);
        int sizeOfChar = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                sizeOfChar++;
            } else {
                if (sizeOfChar > 1) {
                    addToCompressChars(resultChars, sizeOfChar);
                    sizeOfChar = 1;
                }
                resultChars.add(chars[i]);
            }
        }
        if (sizeOfChar > 1) {
            addToCompressChars(resultChars, sizeOfChar);
        }
        for (int i = 0; i < resultChars.size(); i++) {
            chars[i] = resultChars.get(i);
        }
        result = resultChars.size();
        return result;
    }

    private void addToCompressChars(List<Character> resultChars, int count) {
        char[] charsToAdd = String.valueOf(count).toCharArray();
        for (char c : charsToAdd) {
            resultChars.add(c);
        }
    }

    private void printResultChar(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                System.out.print(chars[i]);
                System.out.println();
            } else {
                System.out.print(String.valueOf(chars[i]) + ',');
            }
        }
    }
}