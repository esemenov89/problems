import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1941 {

    /*

Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:
Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Example 2:
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

Constraints:
1 <= s.length <= 1000
s consists of lowercase English letters.
    */

    public static void main(String[] args) {
        Leetcode1941 solution = new Leetcode1941();
        long startDate = new Date().getTime();
        String s = "abacbc";
        System.out.println(s);
        System.out.println(solution.areOccurrencesEqual(s));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: true
        startDate = new Date().getTime();
        String s2 = "aaabb";
        System.out.println(s2);
        System.out.println(solution.areOccurrencesEqual(s2));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: false
        startDate = new Date().getTime();
        String s3;
        char[] chars = new char[1000];
        for (int i = 0; i < chars.length; i++) {
            switch (i % 10) {
                case 0: chars[i] = 'a'; break;
                case 1: chars[i] = 'b'; break;
                case 2: chars[i] = 'c'; break;
                case 3: chars[i] = 'd'; break;
                case 4: chars[i] = 'e'; break;
                case 5: chars[i] = 'f'; break;
                case 6: chars[i] = 'g'; break;
                case 7: chars[i] = 'h'; break;
                case 8: chars[i] = 'i'; break;
                case 9: chars[i] = 'j'; break;
            }
        }
        s3 = new String(chars);
        System.out.println(s3);
        System.out.println(solution.areOccurrencesEqual(s3));
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: true
    }

    public boolean areOccurrencesEqual(String s) {
        boolean result = true;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int occurrences = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (occurrences == 0) {
                occurrences = entry.getValue();
            }
            if (occurrences != entry.getValue()) {
                result = false;
                break;
            }
        }
        return result;
    }
}