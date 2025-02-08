package org.just.leetcode;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Leetcode136 {

    /*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

Constraints:

1 <= nums.length <= 3 * 10^4
-3 * 10^4 <= nums[i] <= 3 * 10^4
Each element in the array appears twice except for one element which appears only once.
    */

    public static void main(String[] args) {
        Leetcode136 solution = new Leetcode136();
        long startDate = new Date().getTime();
        int[] nums1 = new int[]{2, 2, 1};
        System.out.println("nums: " + Arrays.toString(nums1));
        System.out.println(solution.singleNumber(nums1) + " milliseconds:" + (new Date().getTime() - startDate));
        // [1]
        startDate = new Date().getTime();
        int[] nums2 = new int[]{4, 1, 2, 1, 2};
        System.out.println("nums: " + Arrays.toString(nums2));
        System.out.println(solution.singleNumber(nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        // [4]
        startDate = new Date().getTime();
        int[] nums3 = new int[]{1};
        System.out.println("nums: " + Arrays.toString(nums3));
        System.out.println(solution.singleNumber(nums3) + " milliseconds:" + (new Date().getTime() - startDate));
        // [4]
        startDate = new Date().getTime();
        int[] nums4 = new int[30001];
        for (int i = 0; i < nums4.length - 1; i++) {
            nums4[i] = i % 10 + 29000;
        }
        nums4[30000] = 3000;
        System.out.println("nums: " + Arrays.toString(nums4));
        System.out.println(solution.singleNumber(nums4) + " milliseconds:" + (new Date().getTime() - startDate));
        // [3000]
    }

    public int singleNumber(int[] nums) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
