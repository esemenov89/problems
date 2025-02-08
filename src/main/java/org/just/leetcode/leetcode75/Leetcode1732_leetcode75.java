package org.just.leetcode.leetcode75;

import java.util.Arrays;
import java.util.Date;

public class Leetcode1732_leetcode75 {

/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.


Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:
Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.


Constraints:

n == gain.length
1 <= n <= 100
-100 <= gain[i] <= 100
*/

    public static void main(String[] args) {
        Leetcode1732_leetcode75 solution = new Leetcode1732_leetcode75();
        long startDate = new Date().getTime();
        int[] nums = new int[]{-5, 1, 5, 0, -7};
        solution.printNums(nums);
        System.out.println(solution.largestAltitude(nums) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        int[] nums2 = new int[]{-4,-3,-2,-1,4,3,2};
        solution.printNums(nums2);
        System.out.println(solution.largestAltitude(nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 0
        startDate = new Date().getTime();
        int[] nums3 = new int[100];
        Arrays.fill(nums3, 100);
        solution.printNums(nums3);
        System.out.println(solution.largestAltitude(nums3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 10000
        int[] nums4 = new int[100];
        Arrays.fill(nums4, -100);
        solution.printNums(nums4);
        System.out.println(solution.largestAltitude(nums4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 0
        int[] nums5 = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                nums5[i] = 100;
            } else {
                nums5[i] = -100;
            }
        }
        solution.printNums(nums5);
        System.out.println(solution.largestAltitude(nums5) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 100
    }

    public int largestAltitude(int[] gain) {
        int result = 0;
        int altitude = 0;
        for (int j : gain) {
            altitude += j;
            if (altitude > result) {
                result = altitude;
            }
        }
        return result;
    }

    private void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
    }
}