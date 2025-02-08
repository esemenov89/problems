package org.just.leetcode.study.plan75;

import java.util.Date;

public class Leetcode1679_leetcode75 {

/*

You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.


Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.


Constraints:

1 <= nums.length <= 10^5
1 <= nums[i] <= 10^9
1 <= k <= 10^9

*/

    public static void main(String[] args) {
        Leetcode1679_leetcode75 solution = new Leetcode1679_leetcode75();
        long startDate = new Date().getTime();
        System.out.println("nums");
        int[] nums = new int[]{1, 2, 3, 4};
        int k = 5;
        System.out.println(solution.maxOperations(nums, k) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 2
        startDate = new Date().getTime();
        System.out.println("nums2");
        int[] nums2 = new int[]{3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println(solution.maxOperations(nums2, k2) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        System.out.println("nums3");
        int[] nums3 = new int[100000];
        int k3 = 1000000000;
        for (int i = 0; i < nums3.length; i++) {
            if (i % 2 == 0) {
                nums3[i] = 1000000000 - 1;
            } else {
                nums3[i] = 1;
            }
        }
        System.out.println(solution.maxOperations(nums3, k3) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 50000
        startDate = new Date().getTime();
        System.out.println("nums4");
        int[] nums4 = new int[100000];
        int k4 = 1000000000;
        for (int i = 0; i < nums4.length / 2; i++) {
            nums4[i] = 1000000000 - 1;
        }
        for (int i = nums4.length / 2; i < nums4.length; i++) {
            nums4[i] = 1;
        }
        System.out.println(solution.maxOperations(nums4, k4) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 50000
    }

    public int maxOperations(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (nums[i] > k) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0) {
                    continue;
                }
                if (nums[i] + nums[j] == k) {
                    result++;
                    nums[i] = 0;
                    nums[j] = 0;
                    break;
                }
            }
        }
        return result;
    }
}