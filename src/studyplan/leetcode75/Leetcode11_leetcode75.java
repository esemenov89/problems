package studyplan.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class Leetcode11_leetcode75 {

/* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

*/

    public static void main(String[] args) {
        Leetcode11_leetcode75 solution = new Leetcode11_leetcode75();
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

    public int maxArea(int[] height) {
        int result = 0;
        return result;
    }
}