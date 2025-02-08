package org.just.leetcode.leetcode75;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1207_leetcode75 {

/*

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:
Input: arr = [1,2]
Output: false

Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000

*/

    public static void main(String[] args) {
        Leetcode1207_leetcode75 solution = new Leetcode1207_leetcode75();
        long startDate = new Date().getTime();
        int[] nums = new int[]{1, 2, 2, 1, 1, 3};
        solution.printNums(nums);
        System.out.println(solution.uniqueOccurrences(nums) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        startDate = new Date().getTime();
        int[] nums2 = new int[]{1, 2};
        solution.printNums(nums2);
        System.out.println(solution.uniqueOccurrences(nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: false
        int[] nums3 = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        solution.printNums(nums3);
        System.out.println(solution.uniqueOccurrences(nums3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        int[] nums4 = new int[]{-3};
        solution.printNums(nums4);
        System.out.println(solution.uniqueOccurrences(nums4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        int[] nums5 = new int[1000];
        Arrays.fill(nums5, 0);
        solution.printNums(nums5);
        System.out.println(solution.uniqueOccurrences(nums5) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
        int[] nums6 = new int[1000];
        for (int i = 0; i < nums6.length; i++) {
            nums6[i] = i;
        }
        solution.printNums(nums6);
        System.out.println(solution.uniqueOccurrences(nums6) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: false
    }

    public boolean uniqueOccurrences(int[] arr) {
        boolean result = true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        List<Integer> occurrences = map.values().stream().toList();
        for (int i = 0; i < occurrences.size(); i++) {
            for (int j = i + 1; j < occurrences.size(); j++) {
                if (occurrences.get(i).equals(occurrences.get(j))) {
                    result = false;
                    break;
                }
            }
            if (!result) {
                break;
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