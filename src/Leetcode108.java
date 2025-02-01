import java.util.Date;
import java.util.List;
import java.util.Stack;

public class Leetcode108 {

    /*

Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
 binary search tree.


Example 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.


Constraints:
1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums is sorted in a strictly increasing order.
    */
    private static List<String> DIGITS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

    public static void main(String[] args) {
        Leetcode108 solution = new Leetcode108();
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
        String s3 = "200[abc]3[cd]ef";
        System.out.println(s3);
        System.out.println(solution.decodeString(s3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: abcabccdcdcdef
    }

    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0'); // Оч интересно
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}