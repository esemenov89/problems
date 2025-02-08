package org.just.leetcode.study.plan75;

import java.util.Arrays;
import java.util.Date;

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
2 <= n <= 10^5
0 <= height[i] <= 10^4

*/

    public static void main(String[] args) {
        Leetcode11_leetcode75 solution = new Leetcode11_leetcode75();
        long startDate = new Date().getTime();
        System.out.println("height");
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 49
        startDate = new Date().getTime();
        int[] height2 = new int[]{1, 1};
        System.out.println(solution.maxArea(height2) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        // Output: 1
        startDate = new Date().getTime();
        int[] height3 = new int[100000];
        Arrays.fill(height3, 1);
        System.out.println(solution.maxArea(height3) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        // Output: 99999
        startDate = new Date().getTime();
        int[] height4 = new int[100000];
        Arrays.fill(height4, 10000);
        System.out.println(solution.maxArea(height4) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        // Output: 999990000
    }

    public int maxArea(int[] height) {
        int result = 0;
        int s;
        int containerVolume;
        for (int i = 0; i < height.length; i++) {
            if (height[i] * height.length - 1 - i < result) {
                continue;
            }
            for (int j = i + 1; j < height.length; j++) {
                s = Math.min(height[i], height[j]);
                containerVolume = s * (j - i);
                if (containerVolume > result) {
                    result = containerVolume;
                }
            }
        }
        return result;
    }
}