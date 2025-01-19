package studyplan.leetcode75;

import java.util.Date;

public class Leetcode1493_leetcode75 {

/*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.


Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.


Constraints:

1 <= nums.length <= 10^5
nums[i] is either 0 or 1.
*/

    public static void main(String[] args) {
        Leetcode1493_leetcode75 solution = new Leetcode1493_leetcode75();
        long startDate = new Date().getTime();
        int[] nums = new int[]{1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 3

        startDate = new Date().getTime();
        int[] nums2 = new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 5

        startDate = new Date().getTime();
        int[] nums3 = new int[]{1, 1, 1};
        System.out.println(solution.longestSubarray(nums3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 2

        startDate = new Date().getTime();
        int[] nums4 = new int[]{1, 0, 1};
        System.out.println(solution.longestSubarray(nums4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 2
    }

    public int longestSubarray(int[] nums) {
        int result = -1;
        int count;
        int countToFlip = 1;
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
                    }
                }
            }
            countToFlip = 1;
            if (count > result) {
                result = count;
            }
        }
        if (result == nums.length) {
            result--;
        }
        return result;
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