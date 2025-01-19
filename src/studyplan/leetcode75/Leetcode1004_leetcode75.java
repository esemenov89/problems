package studyplan.leetcode75;

import java.util.Date;

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
1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
0 <= k <= nums.length

*/

    public static void main(String[] args) {
        Leetcode1004_leetcode75 solution = new Leetcode1004_leetcode75();
        long startDate = new Date().getTime();
        int[] nums = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        solution.printNums(nums);
        int k = 2;
        System.out.println(solution.longestOnes(nums, k) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 6

        startDate = new Date().getTime();
        int[] nums2 = new int[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 0};
        solution.printNums(nums2);
        int k2 = 2;
        System.out.println(solution.longestOnes(nums2, k2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 9

        startDate = new Date().getTime();
        int[] nums3 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums3[i] = i % 2;
        }
        solution.printNums(nums3);
        int k3 = 2;
        System.out.println(solution.longestOnes(nums3, k3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 9
    }

    public int longestOnes(int[] nums, int k) {
        int result = -1;
        int count;
        int countToFlip = k;
        for (int i = 0; i < nums.length; i++) {
            if (result >= nums.length - i) {
                break;
            }
            count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 1) {
                    count++;
                } else {
                    if (countToFlip == 0) {
                        break;
                    } else {
                        countToFlip--;
                        count++;
                    }
                }
            }
            countToFlip = k;
            if (count > result) {
                result = count;
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